from django.urls import path
from . import views 


urlpatterns = [
    path('',views.index),
    path('Dojo',views.Dojo_and_ningas),
]