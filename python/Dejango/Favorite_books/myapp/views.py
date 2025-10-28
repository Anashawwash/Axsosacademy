from django.shortcuts import render ,HttpResponse

# Create your views here.
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
            request.session['user_id'] = get_id(email = request.POST['email'])
            return redirect('/home')
        
    elif request.POST['type'] == "login": 
        errors = User.objects.login_val(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value,extra_tags=key)
            return redirect('/')
        request.session['user_id'] = get_id(email= request.POST['login_email'])
        return redirect('/home')

                
            
        


def index(request):
    All_message = {}
    for message in messages.get_messages(request):
        All_message[message.extra_tags] = str(message)
    print(All_message)
    return render(request,'login_reg.html',{'all_messages': All_message})
        

def home(request):
    user = get_user(id = request.session['user_id'] )
    all = {
        "books_are":all_but_unliked(user),
        "books_not":all_books_but(user),
        "user":user,
    }
    return render(request,'home.html',all )


def addbook(request):
    title = request.POST['title']
    desc = request.POST['desc']
    user = get_user(id = request.POST['user_id'] )
    add_book(title = title , desc = desc ,uploded_by = user )
    return redirect('/home')

def add_like(request):
    book_id = request.POST['book_id']
    user_id = request.session['user_id'] 
    like_books(book_id ,user_id)
    return redirect('/home')


def logout(request):
    request.session.flush()
    return redirect('/')

def del_like(request):
    book_id = request.POST['book_id']
    user_id = request.session['user_id'] 
    remove_like(book_id ,user_id)
    return redirect('/home')
    
    

    