from django.shortcuts import render , redirect
from models import *
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
            date = request.POST['Date']
            f_name = request.POST['f_name']
            l_name = request.POST['l_name']
            email = request.POST['email']
            password = request.POST['password']
            create_user(fname = f_name , lname = l_name , Email = email , Password = password ,Date=date)
            request.session['user_id'] = get_user_id_by_email(email=email)
            return redirect('/home')
    elif request.POST['type'] == "login":
        errors = User.objects.login_val(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value,extra_tags=key)
            return redirect('/')
        request.session['user_id'] = get_user_id_by_email(email= request.POST['login_email'])
        return redirect('/home')


                
            
        


def index(request):
    All_message = {}
    for message in messages.get_messages(request):
        All_message[message.extra_tags] = str(message)
    print(All_message)
    return render(request,'landing.html',{'all_messages': All_message})
        

def home(request):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        All_message = {}
        for message in messages.get_messages(request):
            All_message[message.extra_tags] = str(message)
        context = {
            'user' : get_user_by_id(request.session['user_id']),
            'all_messages': All_message,
            'all_games': get_all_games(),
        }
        return render(request,'home.html',context)



# logout function
def logout(request):
    request.session.flush()
    return redirect('/')
    
    
def addgame(request):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        errors = Game.objects.game_val(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value ,extra_tags=key)
            return redirect('/home')
        else:
            user = get_user_by_id(request.session['user_id'])
            Game_name = request.POST['game_name']
            Genre = request.POST['genre']
            release_date = request.POST['release_date']
            Description = request.POST['description']
            Game.objects.create(name=Game_name, genre=Genre, release_date=release_date, description=Description, created_by=user)
            return redirect('/home')
        
def viewgame(request,id):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        context = {
            'game': game_by_id(id),
            'user': get_user_by_id(request.session['user_id']),
        }
        return render(request,'viewgame.html',context)


def viewedit(request,id):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        context = {
            'game': game_by_id(id),
            'user': get_user_by_id(request.session['user_id']),
        }
        return render(request,'editgame.html',context)




def deletegame(request,id):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        delete_game(id)
        return redirect('/home')
    
    
    
def editgame(request):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        errors = Game.objects.game_val(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value ,extra_tags=key)
                game_id = request.POST['game_id']
            return redirect(f"/edit/{game_id}/")
        else:
            game = game_by_id(request.POST['game_id'])
            game_name = request.POST['game_name']
            game_genre = request.POST['genre']
            game_release_date = request.POST['release_date']
            game_description = request.POST['description']
            edit_game(game.id, game_name, game_genre, game_description, game_release_date)
            return redirect('/home')
        
        
def sortgames(request):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        sorted_games = get_sorted_games()
        context = {
            'user' : get_user_by_id(request.session['user_id']),
            'all_games': sorted_games,
        }
        return render(request,'home.html',context)
    
def sortgames2(request):
    if 'user_id' not in request.session:
        return redirect('/')
    else:
        context = {
            'user' : get_user_by_id(request.session['user_id']),
            'all_games': get_sorted_games2()
        }
        return render(request,'home.html',context)