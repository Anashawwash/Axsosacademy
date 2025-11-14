<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Title</title>
</head>
<body>
<h1 class="text-5xl m-10">All Books</h1>
<div class=" mx-auto w-[80%]">

    <table class="w-[100%] mx-auto border-2">
        <tr>
            <th class="w-15 border text-3xl">ID</th>
            <th class="text-3xl">Titel</th>
            <th class="text-3xl">Language</th>
            <th class="text-3xl">Pages</th>
        </tr>


    <c:forEach var="book" items="${books}">
        <tr class="even:bg-gray-500 border-2 w-[100%]">
        <td class="pl-5 text-3xl">${book.id}</td>
        <td class="pl-5 text-center text-3xl"> <a class="text-blue-400 underline" href="/book/${book.id}">${book.title}</a></td>
            <td class="text-3xl text-center">${book.language}</td>
            <td class="pl-5 text-center text-3xl">${book.numberOfPages}</td>
            </tr>
    </c:forEach>

    </table>


</div>

</body>
</html>
