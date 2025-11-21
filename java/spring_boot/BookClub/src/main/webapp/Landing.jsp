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

<div class="w-[88%] mx-auto my-10">
    <h1 class="mb-5 text-5xl text-start text-blue-600">Book Club !!</h1>
    <h1 class="text-2xl">A place For frinds to char books</h1>
</div>

<div class="mx-auto h-200 w-[90%] justify-between flex mt-10">
    <div class="w-[45%]">
        <form:form action="/adduser" method="post" modelAttribute="newUser">

            <div class=" m-5">
                <div class="flex justify-between">
                    <form:label cssClass="text-4xl" path="userName">Name</form:label>
                    <form:input cssClass="w-[30%] border-2" path="userName" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors cssClass="text-red-400" path="userName"/>
                </div>
            </div>
            <div class=" m-5">
                <div class="flex justify-between">
                    <form:label cssClass="text-4xl" path="email">Email</form:label>
                    <form:input cssClass="w-[30%] border-2" path="email" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors cssClass="text-red-400" path="email"/>
                </div>
            </div>

            <div class=" m-5">
                <div class="flex justify-between ">
                    <form:label cssClass="text-4xl" path="password">Passowrd</form:label>
                    <form:input cssClass="w-[30%] border-2" type="password" path="password" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors cssClass="text-red-400" path="password"/>
                </div>
            </div>
            <div class=" m-5">
                <div class="flex justify-between ">
                    <form:label cssClass="text-4xl" path="confirmPas">Passowrd</form:label>
                    <form:input cssClass="w-[30%] border-2" type="password" path="confirmPas" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors cssClass="text-red-400" path="confirmPas"/>
                </div>
            </div>
            <div class="flex justify-end mr-5 mt-10">
                <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
            </div>
        </form:form>
    </div>


    <%--Login--%>
    <div class="w-[45%]">
        <form:form action="/login" method="post" modelAttribute="loginUser">

            <div class=" m-5">
                <div class="flex justify-between">
                    <form:label cssClass="text-4xl" path="loginEmail">Email</form:label>
                    <form:input cssClass="w-[30%] border-2" path="loginEmail" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors cssClass="text-red-400" path="loginEmail"/>
                </div>
            </div>

            <div class=" m-5">
                <div class="flex justify-between ">
                    <form:label cssClass="text-4xl" path="confarm">Passowrd</form:label>
                    <form:input cssClass="w-[30%]  border-2" type="password" path="confarm" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors cssClass="text-red-400" path="confarm"/>
                </div>
            </div>

            <div class="flex justify-end mr-5 mt-10">
                <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
            </div>

        </form:form>
    </div>


</div>

</body>
</html>
