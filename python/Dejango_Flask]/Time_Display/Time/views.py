from django.shortcuts import render , HttpResponse
from time import gmtime, strftime
from datetime import datetime 
from zoneinfo import ZoneInfo
def Try(request):
    local_time = datetime.now(ZoneInfo("Asia/Hebron"))
    format_time = local_time.strftime("%Y-%b-%d %H:%M:%S %p")
    context = {
        "time":format_time ,
    }
    return render(request,'index.html',context)

# Create your views here.
