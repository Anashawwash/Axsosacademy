from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('adduser',views.adduser),
    path('home',views.home),
    path('logout',views.logout),
    path('addgame',views.addgame),
    path('game/<int:id>/',views.viewgame),
    path('edit/<int:id>/',views.viewedit),
    path('delete/<int:id>/',views.deletegame),
    path('editgame',views.editgame),
    path('sort',views.sortgames),
    path('sort2',views.sortgames2),
]