from django.urls import path 
from . import views


urlpatterns = [
    path('', views.landing),
    path('adduser',views.adduser),
    path('dashboard',views.dashboard),
    path('createproject',views.create_project),
    path('createproject',views.create_project),
    path('project/<int:project_id>/', views.view_project),
    path('delete/<int:project_id>/', views.delete_project),
    path('logout', views.logout),
    path('join/<int:project_id>/', views.join_project),
    path('edit/<int:project_id>/', views.edit_project),
    path('save', views.save_project),
    path('separate/<int:project_id>/', views.separate),
]