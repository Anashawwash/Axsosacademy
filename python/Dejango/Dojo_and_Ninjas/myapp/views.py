from django.shortcuts import render , redirect ,HttpResponse
from . import models


def index(request):
    context = {
        'Dojos' : models.get_all_dojos(),
    }
    return render(request , 'index.html' ,context)


def Dojo_and_ningas(request):
    cheak =  request.POST['hidden']
    if cheak == "Dojo":
        name = request.POST['name']
        city = request.POST['city']
        state = request.POST['state']
        models.create_Dojos(name = name , city = city , state = state)
    elif cheak == "ninjas":
        fname =  request.POST['fname']
        lname = request.POST['lname']
        dojo_id = request.POST['dojo']
        models.create_ninja(fname = fname,lname = lname , dojo_id = dojo_id )
    return redirect('/')




