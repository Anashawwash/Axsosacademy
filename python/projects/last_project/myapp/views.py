from django.shortcuts import render,redirect
from django.contrib import messages
from .models import *

# Create your views here.



# this is where the user will land 
def landing(request):
    if 'user_id' in request.session:
        return redirect('/dashboard')
    All_message = {}
    for message in messages.get_messages(request):
        All_message[message.extra_tags] = str(message)
    return render(request,'landing.html',{'all_messages': All_message})




# add user 
def adduser(request):
    if request.POST['type'] == "reg": 
        errors = User.objects.reg_val(request.POST)
        if len(errors) > 0 :
            for key,value in errors.items():
                messages.error(request,value ,extra_tags=key)
            return redirect('/')
        else:
            f_name = request.POST['f_name']
            l_name = request.POST['l_name']
            email = request.POST['email']
            password = request.POST['password']
            create_user(fname = f_name , lname = l_name , Email = email , Password = password)
            request.session['user_id'] = get_user_id_by_email(email=email)
            return redirect('/dashboard')
    elif request.POST['type'] == "login":
        errors = User.objects.login_val(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value,extra_tags=key)
            return redirect('/')
        request.session['user_id'] = get_user_id_by_email(email= request.POST['login_email'])
        return redirect('/dashboard')





def dashboard(request):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        context = {
            "all_projects_with_the_user": all_users_in_project(request.session['user_id']),
            "all_user_projects": all_user_projects(request.session['user_id']),
            "all_projects": get_all_projects(),
            'user' : get_user_by_id(request.session['user_id']),
        }
        return render(request,'dashboard.html',context)
    
    
    
    
    
def create_project(request):
    if not request.POST:
        if 'user_id' not in request.session:
            return redirect('')
        else:
            
            All_message = {}
            for message in messages.get_messages(request):
                All_message[message.extra_tags] = str(message)
            context = {
                'user' : get_user_by_id(request.session['user_id']),
            }
            return render(request,'creatpro.html',{"context":context,"all_messages":All_message})
    else:
        errors = project.objects.project_val(request.POST)
        if len(errors) > 0 :
            for key,value in errors.items():
                messages.error(request,value ,extra_tags=key)
            return redirect('/createproject')
        else:    
            pro_name = request.POST['project_name']
            Desc = request.POST['description']
            start_date = request.POST['start_date']
            end_date = request.POST['end_date']
            User = get_user_by_id(request.session['user_id'])
            create_pro(pro_name = pro_name, desc = Desc ,start_date= start_date , end_date= end_date ,user=User )
            return redirect('/dashboard')
            
        
        
         
    
def view_project(request,project_id):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        pro = get_pro_by_id(project_id)
        if request.session['user_id'] != pro.project_owner.id:
            context = {
                "all_members": get_all_project_members(project_id),
                'project': get_pro_by_id(project_id),
                'user' : get_user_by_id(request.session['user_id']),
            }
            return render(request,'view.html',context)
        else:
            context = {
                "all_members": get_all_project_members(project_id),
                'project': get_pro_by_id(project_id),
                'user' : get_user_by_id(request.session['user_id']),
            }
            return render(request,'viewproject.html',context)
    
    
    
def delete_project(request,project_id):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        pro = get_pro_by_id(project_id)
        if pro.project_owner.id == request.session['user_id']:
            pro.delete()
        return redirect('/dashboard')
    
    
def logout(request):
    request.session.flush()
    return redirect('/')


def join_project(request,project_id):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        pro = get_pro_by_id(project_id)
        user = get_user_by_id(request.session['user_id'])
        add_member_to_project(user,pro)
        return redirect('/dashboard')
    
def edit_project(request,project_id):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        All_message = {}
        for message in messages.get_messages(request):
            All_message[message.extra_tags] = str(message)
        pro = get_pro_by_id(project_id)
        if request.session['user_id'] != pro.project_owner.id:
            return redirect('/dashboard')
        context = {
            'all_messages': All_message,
            'project': pro,
            'user' : get_user_by_id(request.session['user_id']),
        }
        return render(request,'edit.html',context)
    
    
def save_project(request):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        errors = project.objects.project_val(request.POST)
        project_id = request.POST['project_id']
        pro = get_pro_by_id(project_id)
        if request.session['user_id'] != pro.project_owner.id:
            return redirect('/dashboard')
        if len(errors) > 0 :
            for key,value in errors.items():
                messages.error(request,value ,extra_tags=key)
            return redirect(f'/edit/{project_id}/')
        else:    
            pro_name = request.POST['project_name']
            Desc = request.POST['description']
            start_date = request.POST['start_date']
            end_date = request.POST['end_date']
            save_edited_project(pro_id=project_id, pro_name=pro_name, desc=Desc, start_date=start_date, end_date=end_date)
            return redirect('/dashboard')
        
def separate(request,project_id):
    if 'user_id' not in request.session:
        return redirect('')
    else:
        pro = get_pro_by_id(project_id)
        user = get_user_by_id(request.session['user_id'])
        remove_member_from_project(user,pro)
        return redirect('/dashboard')