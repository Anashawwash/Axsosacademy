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
    #books
    #liked_books
    

    
class Books(models.Model):
    title = models.CharField(max_length=255)
    desc = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    uploaded_by = models.ForeignKey(User , related_name="books" ,on_delete=models.CASCADE )
    liked_by = models.ManyToManyField(User, related_name="liked_books" ,default=None) 


    
    



def create_user(fname , lname,Email,Password):
    hashed_pw = bcrypt.hashpw(Password.encode(),bcrypt.gensalt()).decode()
    User.objects.create(first_name = fname , last_name = lname , Email = Email , Password = hashed_pw)
    
    
def check_password(password,hashed_password):
    return bcrypt.checkpw(password.encode(),hashed_password.encode())
    
def get_id(email):
    user =User.objects.get(Email = email)
    return user.id

def get_user(id):
    return User.objects.get(id =id )
    
def add_book(title , desc ,uploded_by):
    Books.objects.create(title = title ,desc = desc ,uploaded_by = uploded_by)
            
            
def all_books_but(user):
    return Books.objects.exclude(liked_by  = user)

def all_but_unliked(user):
    return Books.objects.filter(liked_by = user)

def like_books(book_id ,user_id):
    book = Books.objects.get(id = book_id)
    user = User.objects.get(id = user_id)
    book.liked_by.add(user)
    
def remove_like(book_id ,user_id):
    book = Books.objects.get(id = book_id)
    user = User.objects.get(id = user_id)
    book.liked_by.remove(user)
    
    