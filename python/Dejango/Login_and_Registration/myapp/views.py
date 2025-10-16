from django.shortcuts import render , redirect
from .models import *
from django.contrib import messages
import bcrypt

# Create your views here.



def adduser(request):
    if request.POST['type'] == "reg": 
        errors = User.objects.reg_val(request.POST)
        if len(errors) > 0 :
            for key,value in errors.items():
                messages.error(request,value ,extra_tags=key)
            return redirect('/')
        else:
            f_name = request.POST['f_name']
            l_name = request.POST['l_name']
            email = request.POST['email']
            password = request.POST['password']
            create_user(fname = f_name , lname = l_name , Email = email , Password = password )
            messages.success(request,f_name,extra_tags=f_name)
            return redirect('/home')
    elif request.POST['type'] == "login": 
        errors = User.objects.login_val(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value,extra_tags=key)
            return redirect('/')
        f_name = git_name_by_email(email= request.POST['login_email'])
        messages.success(request,f_name,extra_tags=f_name)
        return redirect('/home')

                
            
        


def index(request):
    All_message = {}
    for message in messages.get_messages(request):
        All_message[message.extra_tags] = str(message)
    print(All_message)
    return render(request,'index.html',{'all_messages': All_message})
        

def home(request):
    return render(request,'home.html')
    