<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>
<div class="w-[70%] mx-auto">
    <h1 class="text-5xl text-pink-500">Fruit Store</h1>
    <table class="border-10 border-pink-500 w-[80%] mt-10">
        <tr>
            <th class="text-3xl text-start">Name</th>
            <th class="text-3xl text-start">Price</th>
        </tr>
        <c:forEach var="fruit" items="${fruits}">
            <tr class="border-b border-pink-100 text-gray-800">
                <td class="py-3 px-2">${fruit.name}</td>
                <td class="py-3 px-2">${fruit.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
