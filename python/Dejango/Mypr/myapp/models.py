from django.db import models


class User(models.Model):
    first_name = models.CharField(max_length=45)
    last_name = models.TextField()
    release_date = models.DateTimeField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    

class Addresses(models.Model):
    city = models.CharField(max_length=40)
    street = models.CharField(max_length=30)
    home = models.CharField(max_length=40)
    user = models.ForeignKey(User,  related_name="addresses" ,  on_delete=models.CASCADE)
    
    

def get_all_users():
    return User.objects.all()
    