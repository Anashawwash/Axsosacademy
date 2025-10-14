from django.shortcuts import render , redirect
from .models import *
# Create your views here.


def index(request):
    return render(request,"index.html")

def creat_show(request):
    title = request.POST['title']
    network = request.POST['network']
    Date = request.POST['date']
    desc = request.POST['desc']
    create_show(Title= title , network=network , release_date = Date , Desc= desc)
    return redirect('shows')


def show(request):
    all = {
        'all': info_about_all(),
    }
    return render(request, 'reveal.html' , all)

def delete(request , del_id):
    all_delete(id = del_id)
    return redirect('shows')


def page_show(request,show_id):
    all = {
    'all':all_info_show(id = show_id)
    }
    return render(request,'show.html',all)


def edit(request,edit_id):
    all = {
        'all': all_info_show(id = edit_id)
    }
    return render(request,'edit.html',all)

def update(request ,update_id):
    title = request.POST['title']
    network = request.POST['network']
    Date = request.POST['date']
    desc = request.POST['desc']
    update_show(id = update_id, title = title , net = network , date = Date , Desc = desc)
    pass
    return redirect('shows')
    