from django.shortcuts import render , redirect
from . import models

# Create your views here.


def index(request):
    all = {
        'books' : models.get_all_books()
    }
    
    return render(request,'index.html',all)



def add_book(request):
    titel = request.POST['title']
    des = request.POST['des']
    models.add_books(titel , des)
    return redirect('/') 
    # return render(request,'index.html')


def add_author(request):
    fname = request.POST['f-name']
    lname = request.POST['l-name']
    note = request.POST['note']
    models.add_author(fname = fname,lname = lname,note = note)
    return redirect('/authors')


def none(request):
    all = {
        'books' : models.get_all_author()
    }
    return render(request,'author.html',all)



def info_book(request, name , id ):
    if name == "book":
        all = {
            'author_book': models.authors_book(id = id),
            'author' : models.get_all_author(),
            'book' : models.info_book(id = id),
            'view' : "Description",
            'view_one' : "Authors"
        }
        return render(request , 'info_book.html', all)
    else:
        all = {
            'author_book': models.authors_book(id = id),
            'author' : models.get_all_author(),
            'book' : models.info_authar(id = id),
            'view' : "Notes",
            'view_one' : "Books"
        }
        return render(request , 'info_book.html', all)

        
    
    
def many(request):
    author_id = request.POST['ship']
    book_id = request.POST['book_id']
    models.ship(author_id = author_id , book_id = book_id)
    return redirect('book/2')
    