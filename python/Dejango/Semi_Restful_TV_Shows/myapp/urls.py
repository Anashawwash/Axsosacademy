from django.urls import path
from . import views

urlpatterns = [
    path('shows/new',views.index),
    path('show',views.creat_show),
    path('shows',views.show,name='shows'),
    path('delete/<int:del_id>/',views.delete),
    path('shows/<int:show_id>/',views.page_show),
    path('shows/<int:edit_id>/edit',views.edit),
    path('update/<int:update_id>/',views.update)
    
    
]