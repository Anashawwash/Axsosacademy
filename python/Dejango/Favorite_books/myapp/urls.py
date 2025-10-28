from django.urls import path
from . import views


urlpatterns = [
    path('',views.index),
    path('adduser',views.adduser),
    path('home',views.home),
    path('addbook',views.addbook),
    path('like',views.add_like),
    path('logout',views.logout),
    path('remove',views.del_like)
]