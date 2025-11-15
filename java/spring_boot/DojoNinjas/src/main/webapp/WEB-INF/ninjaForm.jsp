<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>

<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Ninja</title>
</head>
<body>


<div class="w-[50%] flex justify-between mx-auto my-10">
    <h1 class="text-5xl text-blue-400">New Ninja</h1>
    <h1 class="text-5xl text-blue-500 underline"><a href="/">Add Dojo</a></h1>
</div>

<div class="mx-auto h-200 w-[50%] mt-10">
    <div class="flex m-5 justify-between">
        <h1 class="text-4xl" >Dojo</h1>
        <div class="w-[30%]">
    <form:form action="/create/ninja" method="post" modelAttribute="ninja">
        <form:select cssClass="text-4xl border-2" path="dojo">

            <form:label cssClass="text-4xl" path="dojo">Dojo</form:label>
            <c:forEach var="ninja" items="${Dojos}">
                <!--- Each option VALUE is the id of the person --->
                <form:option  value="${ninja.id}" path="dojo">
                    <!--- This is what shows to the user as the option --->
                    <c:out value="${ninja.name}"/>
                </form:option>
            </c:forEach>
        </form:select>
        </div>
    </div>

        <div class=" m-5">
            <div class="flex justify-between">
                <form:label cssClass="text-4xl" path="firstName">Name</form:label>
                <form:input cssClass="w-[30%] border-2" path="firstName" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="firstName"/>
            </div>
        </div>
        <div class=" m-5">
            <div class="flex justify-between">
                <form:label cssClass="text-4xl" path="lastName">Last Name</form:label>
                <form:input cssClass="w-[30%] border-2" path="lastName" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="lastName"/>
            </div>
        </div>

        <div class=" m-5">
            <div class="flex justify-between ">
                <form:label cssClass="text-4xl" path="age">age</form:label>
                <form:input cssClass="w-[30%] border-2" path="age" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="age"/>
            </div>
        </div>






        <div class="flex justify-end mr-5 mt-10">
            <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
        </div>

    </form:form>
</div>

</div>

<div class="w-[50%] mx-auto my-10">
    <h1 class="text-5xl text-blue-400">Save Travels</h1>
</div>

</body>
</html>

