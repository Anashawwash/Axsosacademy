<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Rating Form</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-gray-100">

    <div class="flex w-[50%] mx-auto justify-between">
    <h1 class="text-5xl my-6 text-blue-500">Edit Burger</h1>
        <h1 class="text-3xl my-6 text-blue-500 underline inline-block align-middle"> <a href="/">Go back</a></h1>
    </div>

    <div class="mx-auto h-200 w-[50%] mt-10">
        <form:form action="/edit/${burger.id}" method="post" modelAttribute="burger">

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


</body>
</html>
