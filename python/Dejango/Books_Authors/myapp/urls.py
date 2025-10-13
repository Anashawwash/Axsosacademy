from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('book',views.add_book),
    path('add_author',views.add_author),
    path('authors',views.none),
    path('book/<int:id>/',views.info_book ,name="book"),
    path('many',views.many),
    path('author/<int:author_id>/',views.info_author ,name="author"),
    path('many_author',views.many_author)
    
    

]