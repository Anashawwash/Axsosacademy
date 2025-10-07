from django.db import models

class Dojos(models.Model):
    name = models.CharField(max_length=40)
    city = models.CharField(max_length=255)
    state = models.CharField(max_length=200)



class Ninjas(models.Model):
    first_name = models.CharField(max_length=50)
    last_name = models.CharField(max_length=50)
    dojos = models.ForeignKey( Dojos,related_name="ninjas" , on_delete= models.CASCADE)
    
    
def create_Dojos(name , city , state):
    Dojos.objects.create(name = name , city = city , state =  state)


def get_all_dojos():
    return Dojos.objects.all()


def create_ninja(fname , lname , dojo_id):
    main_dojo = Dojos.objects.get(id = dojo_id)
    Ninjas.objects.create(first_name = fname , last_name = lname , dojos =  main_dojo)


def get_all():
    pass
    # return Dojos.objects.ninjas.all()