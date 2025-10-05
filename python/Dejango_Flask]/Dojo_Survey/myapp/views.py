from django.shortcuts import render , redirect

# Create your views here.

def index(request):
    return render(request,'index.html')


def show(request):
    request.session['name'] = request.POST['User_Name']
    request.session['location'] = request.POST['location']
    request.session['lang'] = request.POST['language']
    request.session['comment'] = request.POST['comment']

    return render(request,'show.html')

