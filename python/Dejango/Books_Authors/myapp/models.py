from django.db import models



class books(models.Model):
    titel = models.CharField(max_length=200)
    desc = models.CharField(max_length=200)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    # authors
    
    
    
class authors(models.Model):
    titel = models.CharField(max_length=200)
    last_name = models.CharField(max_length=200)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    Books = models.ManyToManyField(books ,related_name='authors')
    desc = models.TextField(default="hello")



def get_all_books():
    return books.objects.all()

def add_books(titel,desc):
    books.objects.create(titel = titel , desc = desc)
    
def get_all_author():
    return authors.objects.all()

    
    
def add_author(fname ,lname ,note):
    authors.objects.create(titel = fname ,last_name = lname , desc = note)
    
def info_book(id):
    return books.objects.get(id = id)

def info_authar(id):
    return authors.objects.get(id = id)



def ship(author_id , book_id):
    author = authors.objects.get(id = author_id)
    book = books.objects.get(id = book_id)
    book.authors.add(author)
    
def authors_book(id):
    book = books.objects.get(id = id)
    return book.authors.all()
