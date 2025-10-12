from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('book',views.add_book),
    path('author',views.add_author),
    path('authors',views.none),
    path('<slug:name>/<int:id>/',views.info_book),
    path('many',views.many),
    
    

]