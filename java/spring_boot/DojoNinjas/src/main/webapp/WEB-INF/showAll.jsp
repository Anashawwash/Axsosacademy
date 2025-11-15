<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>

<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Save Travels</title>
</head>
<body>

<div class="w-[80%] mx-auto my-10">
    <h1 class="text-5xl text-blue-400">Burbank Location Ninjas</h1>
</div>

<div class=" mx-auto w-[80%]">
    <table class="w-full border-2">
        <tr>
            <th class="border-r-2 text-3xl">First Name</th>
            <th class="text-3xl border-2">Last Name</th>
            <th class="text-3xl border-2">Age</th>
        </tr>

        <c:forEach var="ninja" items="${ninjas}">
            <tr class="even:bg-gray-200 border-2">
                <td class="pl-5 text-center text-3xl">${ninja.firstName}</td>
                <td class="text-3xl text-center">${ninja.lastName}</td>
                <td class="pl-5 text-center text-3xl">${ninja.age}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
