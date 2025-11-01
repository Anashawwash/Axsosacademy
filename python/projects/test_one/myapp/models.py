from django.db import models
import re
import bcrypt
from django.utils import timezone
from datetime import datetime

# Create your models here.

class mangeuser(models.Manager):
    def reg_val(self,postdata):
        current_time = datetime.now().date()
        errors = {}
        user_birth_date = datetime.strptime(postdata['Date'], "%Y-%m-%d").date()
        # cheak the Date
        
        
        if User.objects.filter(Email = postdata['email']).first():
            errors['email_exists'] = "This Gmail is Already in Use"
            return errors
        else:
            if current_time < user_birth_date:
                errors['date'] = "Invalid Date"
            elif (current_time.year - user_birth_date.year) < 18:
                errors['age'] = "You must be at least 18 years old"
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
            errors['Password'] = 'Password is not correct'
        return errors
    

            
class mangegame(models.Manager):
    def game_val(self,postdata):
        current_time = datetime.now().date()
        release_date = datetime.strptime(postdata['release_date'], "%Y-%m-%d").date()
        errors = {}
        if current_time < release_date:
            errors['release_date'] = "Invalid Date"
        if len(postdata['game_name']) < 2:
            errors['game_name'] = 'should be at least 2 characters'
        if len(postdata['genre']) < 2:
            errors['genre'] = 'should be at least 2 characters'
        if len(postdata['description']) < 10:
            errors['description'] = 'should be at least 10 characters'
        return errors
    
    
    
               
        
        
class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    Email = models.CharField(max_length=255)
    Password = models.CharField(max_length=255)
    date_of_birth = models.DateField(default=None)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = mangeuser()
    # games
    
    
    #games Model
class Game(models.Model):
    name = models.CharField(max_length=255)
    genre = models.CharField(max_length=255)
    description = models.TextField()
    created_by = models.ForeignKey(User , related_name="games" , on_delete=models.CASCADE)
    objects = mangegame()
    release_date = models.DateField(default=None)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    
    
    #create user function
def create_user(fname , lname , Email , Password , Date ):
    hashed_pw = bcrypt.hashpw(Password.encode(),bcrypt.gensalt()).decode()
    User.objects.create(first_name = fname , last_name = lname , Email = Email , Password = hashed_pw ,date_of_birth = Date)
    
def create_game(name,genre,description,created_by , release_date):
    Game.objects.create(name=name,genre=genre,description=description,created_by=created_by,release_date=release_date)



    
def check_password(password,hashed_password):
    return bcrypt.checkpw(password.encode(),hashed_password.encode())
    
    
    # git name by email 
def git_name_by_email(email):
    user = User.objects.get(Email= email)
    return user.first_name


def get_user_id_by_email(email):
    user = User.objects.get(Email= email)
    return user.id
    
def get_user_by_id(id):
    user = User.objects.get(id= id)
    return user
    
def get_all_games():
    return Game.objects.all()

def game_by_id(id):
    return Game.objects.get(id=id)

def delete_game(id):
    game = Game.objects.get(id=id)
    game.delete()

    
def edit_game(id,name,genre,description,release_date):
    game = Game.objects.get(id=id)
    game.name = name
    game.genre = genre
    game.description = description
    game.release_date = release_date
    game.save()

def get_sorted_games():
    return Game.objects.all().order_by('-name')

def get_sorted_games2():
    return Game.objects.all().order_by('release_date')


