<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>

<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Home</title>
</head>
<body class="p-6 bg-white">

    <!-- Header Section -->
    <div class="flex h-30 justify-between mb-2">
        <div>
            <h1 class="text-6xl mb-3 font-bold">Welcome, ${User.userName}</h1>
            <p class="text-gray-700 text-3xl">Books from everyone's shelves:</p>
        </div>
        <div class="text-right">
            <a href="/logout" class="text-3xl mb-8 text-blue-600 underline mb-1 inline-block">logout</a><br>
            <a href="/addbook" class="text-3xl text-blue-600 underline">+ Add a to my shelf!</a>
        </div>
    </div>
    <c:if test="${not empty userE}">
        <h1 class="text-4xl text-red-500">${userE}</h1>
    </c:if>
    <!-- Books Table -->
    <table class="table-auto border-2 border-gray-400 w-full text-left">
        <thead>
        <tr class="bg-gray-300">
            <th class="border-2  px-3 py-1">ID</th>
            <th class="border-2  px-3 py-1">Title</th>
            <th class="border-2  px-3 py-1">Author Name</th>
            <th class="border-2  px-3 py-1">Posted By</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${Books}" >
            <tr class="border border-gray-400">
                <td class="border-2  px-3 py-1">${book.id}</td>
                <td class="border-2 px-3 py-1"> <a href="/book/${book.id}" class="text-blue-600 hover:underline">${book.title}</a></td>
                <td class="border-2 px-3 py-1">${book.author}</td>
                <td class="border-2 px-3 py-1">${book.user.userName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
