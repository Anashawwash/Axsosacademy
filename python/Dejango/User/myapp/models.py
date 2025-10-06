from django.db import models

# Create your models here.



class User(models.Model):
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=30)
    email = models.CharField(max_length=50)
    age = models.IntegerField()
    created_add = models.DateTimeField(auto_now_add=True)
    apdated_at = models.DateTimeField(auto_now=True)
    
    def create_user(self,fname,lname,email,age):
        User.objects.create(first_name = fname,last_name=lname,email=email,age=age)
    