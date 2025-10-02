from django.shortcuts import render , HttpResponse

def index(request):
    
    if 'Number' in request.session:
        count = request.session['Number'] + 1
    else:
        count = 1
    request.session['Number'] = count    
    return render(request,'index.html', {'count':count})



