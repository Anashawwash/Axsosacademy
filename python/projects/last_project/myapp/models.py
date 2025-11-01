from django.db import models
import re
import bcrypt
from datetime import datetime

# Create your models here.


class mangeuser(models.Manager):
    def reg_val(self,postdata):
        errors = {}
        
        
        if User.objects.filter(Email = postdata['email']).first():
            errors['email_exists'] = "This Gmail is Already in Use"
            return errors
        else:
            if len(postdata['f_name']) < 2:
                errors['f_name'] = 'should be at least 2 characters'
            if len(postdata['l_name']) < 2:
                errors['l_name'] = 'should be at least 2 characters'
            pattern = re.compile(r'^[a-zA-Z0-9-._]+@[a-zA-Z]+\.[a-zA-Z]+$')
            if not pattern.match(postdata['email']):
                errors['email_error'] = 'email is invalid'
            if len(postdata['password']) < 8:
                errors['password'] = 'should be at least 8 characters'
            elif postdata['password'] != postdata['con_pw']:
                errors['con_pw'] = 'Password dose not match'
            return errors
        
    def login_val(self,postdata):
        errors = {}
        user = User.objects.filter(Email = postdata['login_email']).first()
        if not user:
            errors['email'] = 'Email does not exist'
            return errors
            #function cheak_passwrod
        if not check_password(postdata['login_password'],user.Password):
            errors['Password'] = 'Password is not correct'
        return errors




    
    
#  this is the user table
class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    Email = models.CharField(max_length=255)
    Password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = mangeuser() 
    #owner
    #members_project  
    
#create user function
def create_user(fname , lname , Email , Password):
    hashed_pw = bcrypt.hashpw(Password.encode(),bcrypt.gensalt()).decode()
    User.objects.create(first_name = fname , last_name = lname , Email = Email , Password = hashed_pw )
    
    
#cheak_passwrod    
def check_password(password,hashed_password):
    return bcrypt.checkpw(password.encode(),hashed_password.encode())



#get user id by email   
def get_user_id_by_email(email):
    user = User.objects.get(Email= email)
    return user.id

#get user by id
def get_user_by_id(id):
    user = User.objects.get(id= id)
    return user
    
    
    
    
    
    
    
    
    
    
    

class mange_project(models.Manager):
    def project_val(self,postdata):
        current_time = datetime.now().date()
        start_date = datetime.strptime(postdata['start_date'], "%Y-%m-%d").date()
        end_date = datetime.strptime(postdata['end_date'], "%Y-%m-%d").date()
        errors = {}
        
        if current_time < start_date:
            errors['start_date'] = "Invalid Date"
        if current_time > end_date:
            errors['end_date'] = "Invalid Date"
        if len(postdata['project_name']) < 3:
            errors['project_name'] = 'should be at least 3 characters'
        if len(postdata['description']) < 10:
            errors['description'] = 'should be at least 10 characters'
        return errors
    
        
        
    
    
    
    
    
    
    
# this is projects table
class project(models.Model):
    # main
    project_name = models.CharField(max_length=250)
    project_owner = models.ForeignKey(User,related_name="owner_project",on_delete=models.CASCADE)
    project_members = models.ManyToManyField(User,related_name="members_project" ,default=None)
    description = models.TextField()
    start_date = models.DateField()
    end_date = models.DateField()
    
    
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = mange_project()
    
   
# create Project function
def create_pro(pro_name , desc ,start_date , end_date ,user):
    project.objects.create(project_name = pro_name , project_owner = user  ,description = desc,start_date = start_date, end_date = end_date )
   
   
def get_pro_by_id(pro_id):
    return project.objects.get(id= pro_id)




def get_all_projects():
    return project.objects.all()
   

def all_user_projects(id):
    user = get_user_by_id(id)
    return user.owner_project.all()


def get_all_project_members(pro_id):
    pro = get_pro_by_id(pro_id)
    return pro.project_members.all()


def add_member_to_project(user,pro):
    pro.project_members.add(user)
    pro.save()
    
def all_users_in_project(user_id):
    user = get_user_by_id(user_id)
    return user.members_project.all()


def save_edited_project(pro_id,pro_name,desc,start_date,end_date):
    pro = get_pro_by_id(pro_id)
    pro.project_name = pro_name
    pro.description = desc
    pro.start_date = start_date
    pro.end_date = end_date
    pro.save()
    
    
def remove_member_from_project(user,pro):
    pro.project_members.remove(user)
    pro.save()