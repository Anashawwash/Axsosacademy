from django.shortcuts import render, redirect
import random
from datetime import datetime
from zoneinfo import ZoneInfo

def index(request):
    if (not "gold" in request.session) or (not 'activaties' in request.session):
        request.session['gold'] = random.randint(1,100)
        request.session['activaties'] = []
    return render(request, 'page.html')

def get_gold(request):
    rand = random.randint(10,20)
    request.session['gold'] += rand
    palestine_time = datetime.now(ZoneInfo("Asia/Jerusalem"))
    
    
    if(request.POST['hidden_input'] == 'farm'):
        request.session['activaties'].insert(0,f"You entered a farm and earned {rand} gold ({palestine_time.strftime("%b %d , %Y %I:%M %p")})")
    
    elif(request.POST['hidden_input'] == 'cave'):
        request.session['activaties'].insert(0,f"You entered a cave and earned {rand} gold ({palestine_time.strftime("%b %d , %Y %I:%M %p")})")
    
    elif(request.POST['hidden_input'] == 'house'):
        request.session['activaties'].insert(0,f"You entered a house and earned {rand} gold ({palestine_time.strftime("%b %d , %Y %I:%M %p")})")  
    
    else:
        rand_quest = random.randint(0,50)
        rand_earns_takes = random.randint(0,1)
        if rand_earns_takes == 1:   
            request.session['activaties'].insert(0,f"You complete a quest and earned {rand_quest} gold ({palestine_time.strftime("%b %d , %Y %I:%M %p")})")
            request.session['gold'] += rand_quest
        else:         
            request.session['activaties'].insert(0,f"You faild a quest and lost {rand_quest} gold Ouch ({palestine_time.strftime("%b %d , %Y %I:%M %p")})")
            request.session['gold'] -= rand_quest
    if(request.session['gold'] <= 0):
        pass
    return redirect('/')

def destroy(request):
    request.session.flush()
    return redirect('/')
