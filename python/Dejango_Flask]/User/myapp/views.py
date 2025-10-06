from django.shortcuts import render , redirect , HttpResponse
from .models import User
# Create your views here.


def index(request):
    All = {
        'users' : User.objects.all()
    }
    return render(request, 'index.html' ,All)


def create_user(request):
    first_name = request.POST['fisrt_name']
    last_name = request.POST['fisrt_name']
    email = request.POST['email']
    age = request.POST['age']
    
    User.objects.create(first_name = first_name, last_name = last_name , email = email ,age = age )
    return redirect('/')


