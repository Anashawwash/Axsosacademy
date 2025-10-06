from django.shortcuts import render , HttpResponse,redirect
import random
# Create your views here.


def index(request):
    return render(request, 'index.html')


def win(request):
    all.result = 0
    num  = random.randint(1,100)
    print(num)
    number = request.POST['number']
    if int(number) == num:
        all= {
            'result' : 0,
            'win_num': num,
        }
    else:
        if num < int(number):
            all= {
                'result' : 1,
                'win_num': num,

            }
        else:
             all= {
                'result' : 2,
                'win_num': num,
            }
            
            
            

    return render(request,'index.html',{'all' : all})

