from django.shortcuts import render, HttpResponse
from . import models


def index(request):
    context  = {
        "users" : models.get_all_users()
    }
    
    return render(request,'index.html',context)

