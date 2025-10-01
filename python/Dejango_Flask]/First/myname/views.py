from django.shortcuts import render , HttpResponse,redirect


def root(request):
    return redirect('/blogs')
# Create your views here.


def index(request):
    return HttpResponse("placeholder to later display a list of all blogs")

def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog")

def creat(request):
    return redirect('/')

def show(request , val):
    return HttpResponse(f"placeholder to display blog number: {val}")

def edit(request ,val):
        return HttpResponse(f"placeholder to display edit Number: {val}")
    
def destroy(request , val):
    return redirect('/blogs')