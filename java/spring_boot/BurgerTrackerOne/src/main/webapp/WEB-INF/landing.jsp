<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>

<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Burger Tracker</title>
</head>
<body>

<div class="w-[80%] mx-auto my-10">
    <h1 class="text-5xl text-blue-400">Burger Tracker</h1>
</div>

<div class=" mx-auto w-[80%]">
    <table class="w-full border-2">
        <tr>
            <th class="border-r-2 text-3xl">Burger Name</th>
            <th class="text-3xl border-2">Restaurant Name</th>
            <th class="text-3xl border-2">Rating</th>
            <th class="text-3xl border-2">Action</th>
        </tr>

        <c:forEach var="burger" items="${burgers}">
            <tr class="even:bg-gray-200 border-2">
                <td class="pl-5 text-center text-3xl">${burger.burgerName}</td>
                <td class="pl-5 text-center text-3xl">${burger.restaurantName}</td>
                <td class="text-3xl text-center">${burger.rating}</td>
                <td class="pl-5 text-center text-blue-400 underline text-3xl"><a href="/edit/${burger.id}"> edit</a></td>
            </tr>
        </c:forEach>

    </table>
</div>

<div class="mx-auto h-200 w-[50%] mt-10">
    <form:form action="/create" method="post" modelAttribute="burger">

    <div class="flex justify-between m-5">
        <form:label cssClass="text-4xl" path="burgerName">Burger Name</form:label>
        <form:input cssClass="w-[30%] border-2" path="burgerName" />
    </div>
        <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="burgerName"/>
        </div>


        <div class="flex justify-between m-5">
            <form:label cssClass="text-4xl" path="restaurantName">Restaurant Name</form:label>
            <form:input cssClass="w-[30%] border-2" path="restaurantName" />
        </div>
        <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="restaurantName"/>
        </div>

        <div class="flex justify-between m-5">
            <form:label cssClass="text-4xl" path="rating">Rating</form:label>
            <form:input cssClass="w-[30%] border-2" path="rating" />
        </div>

        <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="rating"/>
        </div>





        <div class="flex m-5 justify-between">
            <form:label cssClass="text-4xl" path="notes">Notes</form:label>
            <form:input cssClass="w-[30%] border-2" path="notes" />
        </div>


        <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="notes"/>
        </div>


        <div class="flex justify-end mr-5 mt-10">
        <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
        </div>

    </form:form>
</div>

</body>
</html>
