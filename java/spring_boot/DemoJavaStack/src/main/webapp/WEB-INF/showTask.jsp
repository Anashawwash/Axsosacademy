<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>

<div class="w-[80%] mx-auto h-30 border-b-2 flex items-center justify-between">
    <button class="w-[18%] rounded-xl text-5xl border-2 shadow-lg"><a href="/home">Dashboard</a></button>
    <div class="items-center flex justify-between">
        <H1 class="text-5xl mr-10">HI ! ${User.firstName} ${User.lastName}  </H1>
        <a class="text-5xl text-blue-500 hover:underline" href="/logout"> <img class="w-10 mt-3" src=" https://cdn-icons-png.flaticon.com/128/4400/4400629.png"> </a>
    </div>
</div>
    <div class="mt-10 w-[70%] mx-auto">
        <h1 class="mb-10 text-5xl">${task.taskName}</h1>
        <h1 class="mb-5 text-3xl">${task.taskDescription}</h1>
        <h1 class="mb-5 text-3xl text-blue-500 ">Your dead Line ${task.dueDate}</h1>
    </div>
    <div class="w-[85%] mx-auto justify-start flex mr-5 mt-10">
        <button class="w-[10%] border-2 mx-10 py-2 rounded shadow-[2px_2px]">
            <a href="/edit/${task.id}">Edit</a>
        </button>
        <button class="border-2 w-[10%] rounded shadow-[2px_2px]"> <a href="/delete/${task.id}"> Delete</a></button>
    </div>



</body>
</html>
