<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Save Travels</title>
</head>
<body class="bg-white p-8 w-[70%] mx-auto">
<div class="flex justify-between h-30 mb-6">
    <h1 class="text-4xl font-bold">${book.title}</h1>
    <a href="/home" class="text-blue-600 text-4xl hover:underline ">back to the shelves</a>
</div>
    <div class="border-b-2 mb-5">

        <h1 class="mb-4 text-4xl">
            <c:if test="${book.user.id == User.id}">
                <span>You</span>
            </c:if>
            <c:if test="${book.user.id != User.id}">
                <span> ${User.userName}</span>
            </c:if>
            Read <span class="text-red-400">${book.title}</span>  By <span class="text-green-400">${book.author}</span>
        </h1>
    </div>

    <div class="mb-10">
        <h1 class="text-2xl">${book.thoughts}</h1>
    </div>
    <div class="flex justify-end">
        <c:if test="${book.user.id == User.id}">
            <button class="mr-15 border-2 w-[15%] rounded shadow-[2px_2px]"> <a href="/delete/${book.id}">Delete</a></button>
            <button class="border-2 rounded w-[15%] shadow-[2px_2px]"> <a href="/edit/${book.id}">Edit</a></button>


        </c:if>

    </div>

</body>
</html>
