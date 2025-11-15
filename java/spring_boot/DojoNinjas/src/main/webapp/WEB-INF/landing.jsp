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

<div class="w-[40%] flex justify-between mx-auto my-10">
    <h1 class="text-5xl text-blue-400">New Dojo</h1>
    <h1 class="text-5xl text-blue-500 underline"><a href="/ninja">Add Ninja</a></h1>
</div>


<div class="mx-auto h-200 w-[40%] mt-10">
    <form:form action="/create/dojo" method="post" modelAttribute="dojo">

        <div class=" m-5">
            <div class="flex justify-between">
                <form:label cssClass="text-4xl" path="name">Name</form:label>
                <form:input cssClass="w-[30%] border-2" path="name" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="name"/>
            </div>
        </div>

        <div class="flex justify-end mr-5 mt-10">
            <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
        </div>

    </form:form>
</div>

</body>
</html>
