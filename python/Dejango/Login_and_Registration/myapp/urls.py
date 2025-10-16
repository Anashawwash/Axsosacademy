from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('adduser',views.adduser),
    path('home',views.home)
]