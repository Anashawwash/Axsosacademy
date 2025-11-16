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

<div class="w-[50%] mx-auto my-10">
    <h1 class="text-5xl text-blue-400">Passport</h1>
</div>

<form:form cssClass="w-[50%] mx-auto" action="/passport" method="post" modelAttribute="passport">
    <form:hidden path="person" value="${person_id}"></form:hidden>
    <div class=" m-5">
        <div class="flex justify-between">
            <form:label cssClass="text-4xl" path="pasNumber">Passport Number</form:label>
            <form:input cssClass="w-[30%] border-2" path="pasNumber"/>
        </div>
        <div class="flex justify-end mr-5">
            <form:errors cssClass="text-red-400" path="pasNumber"/>
        </div>
    </div>
    <div class="flex justify-end mr-5 mt-10">
        <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
    </div>

</form:form>


</body>
</html>
