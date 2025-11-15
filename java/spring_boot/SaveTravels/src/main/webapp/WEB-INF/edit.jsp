<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Edit Form</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>

<div class="flex w-[50%] mx-auto justify-between">
    <h1 class="text-5xl my-6 text-blue-500">Edit Expense</h1>
    <h1 class="text-3xl my-6 text-blue-500 underline inline-block align-middle"> <a href="/">Go back</a></h1>
</div>

<div class="mx-auto h-200 w-[50%] mt-10">
    <form:form action="/edit/${travel.id}" method="post" modelAttribute="travel">

    <div class="flex justify-between m-5">
        <form:label cssClass="text-4xl" path="name">Burger Name</form:label>
        <form:input cssClass="w-[30%] border-2" path="name" />
    </div>
    <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="name"/>
    </div>

    <div class="flex justify-between m-5">
        <form:label cssClass="text-4xl" path="vendor">Restaurant Name</form:label>
        <form:input cssClass="w-[30%] border-2" path="vendor" />
    </div>
    <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="vendor"/>
    </div>

    <div class="flex justify-between m-5">
        <form:label cssClass="text-4xl" path="amount">Rating</form:label>
        <form:input cssClass="w-[30%] border-2" path="amount" />
    </div>

    <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="amount"/>
    </div>

    <div class="flex m-5 justify-between">
        <form:label cssClass="text-4xl" path="description">Notes</form:label>
        <form:input cssClass="w-[30%] border-2" path="description" />
    </div>


    <div class="flex justify-end mr-5">
        <form:errors cssClass="text-red-400" path="description"/>
    </div>


    <div class="flex justify-end mr-5 mt-10">
        <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
    </div>

    </form:form>


</body>
</html>
