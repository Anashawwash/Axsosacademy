from django.shortcuts import render , HttpResponse,redirect

def index(request):
    
    if 'Number' in request.session:
        count = request.session['Number'] + 1
    else:
        count = 1
    request.session['Number'] = count    
    return render(request,'index.html', {'count':count})


def go(request):
    count = 0
    request.session['Number'] = count    
    return redirect('/')



