from django.db import models

# Create your models here.
class show_manager(models.Manager):
    
    
    def validator(self,postData):
        error = {}
        if len(postData['title']) < 2:
            error["title"] = "Title should be at least 2 characters"
        if len(postData['network']) < 3:
            error["network"] = "Network should be at least 3 characters"
        if len(postData['desc']) < 10 :
            error['desc'] = "Description should be at least 10 characters" 
        return error
              




class Shows(models.Model):
    Title = models.CharField(max_length=255)
    network = models.CharField(max_length=50)
    release_date = models.DateTimeField()
    Description = models.TextField()
    updated_at = models.DateTimeField(auto_now=True)
    created_at = models.DateTimeField(auto_now_add=True)
    objects = show_manager()


    







def create_show(Title,network,release_date,Desc):
    Shows.objects.create(Title = Title , network = network , release_date = release_date,  Description = Desc)
    
def info_about_all():
    return Shows.objects.all()

def all_delete(id):
    show = Shows.objects.get(id = id)
    show.delete()
    
def all_info_show(id):
    return Shows.objects.get(id = id)

def update_show( id , title , net, date , Desc):
    show = Shows.objects.get(id = id)
    if title:
        show.Title = title
    if net:
        show.network = net
    if date:
        show.release_date = date
    if Desc:
        show.Description = Desc
        
    show.save()