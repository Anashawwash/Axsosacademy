from django.urls import path
from . import views


urlpatterns = [
    path('', views.root),
    path('blogs/', views.index),
    path('blogs/new', views.new),
    path('blogs/creat', views.creat),
    path('blogs/<int:val>', views.show),
    path('blogs/<int:val>/edit', views.edit),
    path('blogs/<int:val>/delete', views.destroy),




]