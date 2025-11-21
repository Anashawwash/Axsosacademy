<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>

<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Save Travels</title>
</head>
<body class="bg-white p-8 w-[70%] mx-auto">

<!-- Title and back link -->
<div class="flex justify-between h-30 mb-6">
    <h1 class="text-3xl font-bold">Add a Book to Your Shelf!</h1>
    <a href="/home" class="text-blue-600 text-3xl hover:underline ">back to the shelves</a>
</div>

<div class="w-[70%] mx-auto">
    <form:form action="/addBook" method="post" modelAttribute="newBook">
        <div class="my-5">
            <div class="flex justify-between">
                <form:label path="title" cssClass="text-3xl">Title</form:label>
                <form:input path="title" cssClass="border-2 border-black w-[60%] rounded" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors path="title" cssClass="text-red-400 text-xl" />
            </div>
        </div>
    <form:hidden path="user" value="${User.id}"/>
        <div class="my-5">
            <div class="flex justify-between">
                <form:label path="author" cssClass="text-3xl">Author</form:label>
                <form:input path="author" cssClass="border-2 border-black w-[60%] rounded"  />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors path="author" cssClass="text-red-400 text-sm" />
            </div>
        </div>

        <div class="my-5">
            <div class="flex justify-between items-start">
                <form:label path="thoughts" cssClass="text-3xl">My thoughts</form:label>
                <form:textarea path="thoughts" cssClass="border-2 border-black w-[60%] rounded" rows="5" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors path="thoughts" cssClass="text-red-400 text-sm" />
            </div>
        </div>


        <div class="flex justify-end mr-5 mt-10">
            <button type="submit" class="border-2 px-4 py-2 rounded shadow-[2px_2px]">
                Submit
            </button>
        </div>

    </form:form>
</div>

</body>
</html>
