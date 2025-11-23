<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>
    <div class="h-[100vh]  flex">
        <div class="border-r-2 mr-20 w-[15%]">
            <h1 class="ml-4 mt-20 mb-6 text-6xl">Todo</h1>
            <a href="/home"> <h1 class="ml-4 mb-3 text-4xl hover:underline">Inprogress</h1></a>
            <a href="/done"> <h1 class="ml-4 mb-3 text-4xl hover:underline">Done</h1></a>
           <a href="/imortent"> <h1 class="ml-4 mb-3 text-4xl hover:underline">Important</h1></a>
            <h1 class="ml-4 mb-3 text-4xl  hover:underline">Tag</h1>
        </div>
        <div class="w-[80%] ">

            <div class="w-[100%] h-30 border-b-2 flex items-center justify-between">
                <button class="w-[18%] rounded-xl text-5xl border-2 shadow-lg"><a href="/addtask">+ Add Task</a></button>
                <div class="items-center flex justify-between">
                    <H1 class="text-5xl mr-10">HI ! ${User.firstName} ${User.lastName}  </H1>
                    <a class="text-5xl text-blue-500 hover:underline" href="/logout"> <img class="w-10 mt-3" src=" https://cdn-icons-png.flaticon.com/128/4400/4400629.png"> </a>
                </div>
            </div>

            <c:forEach items="${tasks}" var="task">
                <div class="mt-10 border-2 ">
                    <div class="border-b-2 p-4 flex justify-between">
                       <h1 class="text-4xl font-bold"> <a href="/show/${task.id}">${task.taskName}</a></h1>
                        <a class="hover:underline" href="/impo/${task.id}"> Important  </a>
                    </div>
                    <div class="mt-5 ml-3">
                        <h1 class="text-xl">${task.taskDescription}</h1>
                    </div>
                </div>
            </c:forEach>

        </div>
    </div>
</body>
</html>
