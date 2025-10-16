from django.db import models
import re
import bcrypt
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
        if not check_password(postdata['login_password'],user.Password):
            errors['Password'] = 'Password is not curect'
        return errors
    

            
            
        
        
class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    Email = models.CharField(max_length=255)
    Password = models.CharField(max_length=255)
    objects = mangeuser()
    
    
def create_user(fname , lname,Email,Password):
    hashed_pw = bcrypt.hashpw(Password.encode(),bcrypt.gensalt()).decode()
    User.objects.create(first_name = fname , last_name = lname , Email = Email , Password = hashed_pw)
    
    
def check_password(password,hashed_password):
    return bcrypt.checkpw(password.encode(),hashed_password.encode())
    
def git_name_by_email(email):
    user =User.objects.get(Email = email)
    return user.first_name
    
    
            
            
        