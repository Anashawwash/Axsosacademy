from django.urls import path, include
from . import views

urlpatterns = [
    path('', views.index),
    path("get-gold", views.get_gold),
    path("flush/", views.destroy)
]