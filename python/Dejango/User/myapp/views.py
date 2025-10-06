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
    User.create_user(first_name, last_name , email , age )
    return redirect('/')


