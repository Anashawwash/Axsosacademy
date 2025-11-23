<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>

<head>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Save Travels</title>
</head>
<body class="bg-white w-[80%] mx-auto">

<div class="w-[100%] h-30 border-b-2 flex items-center justify-between">
    <button class="w-[18%] rounded-xl text-5xl border-2 shadow-lg"><a href="/home">Dashboard</a></button>
    <div class="items-center flex justify-between">
        <H1 class="text-5xl mr-10">HI ! ${User.firstName} ${User.lastName}  </H1>
        <a class="text-5xl text-blue-500 hover:underline" href="/logout"> <img class="w-10 mt-3" src=" https://cdn-icons-png.flaticon.com/128/4400/4400629.png"> </a>
    </div>
</div>

    <form:form action="/editTask" method="post" modelAttribute="newproject">
<div class="flex justify-between">
        <div class="w-[60%] mx-auto">
            <div class="my-10">
                <div class="flex justify-between">
                    <form:label path="taskName" cssClass="text-3xl">Task Title</form:label>
                    <form:input path="taskName" cssClass="border-2 border-black w-[60%] rounded" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors path="taskName" cssClass="text-red-400 text-xl" />
                </div>
            </div>
            <form:hidden path="id" value="${newproject.id}"/>
            <form:hidden path="user" value="${User.id}"/>
            <form:hidden path="inProgress" value="true"/>
            <form:hidden path="done" value="false"/>
            <div class="my-10">
                <div class="flex justify-between items-start">
                    <form:label path="taskDescription" cssClass="text-3xl">Task Description</form:label>
                    <form:textarea path="taskDescription" cssClass="border-2 border-black w-[60%] rounded" rows="5" />
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors path="taskDescription" cssClass="text-red-400 text-sm" />
                </div>
            </div>

            <div class="my-10">
                <div class="flex justify-between items-start">
                    <form:label path="dueDate" cssClass="text-3xl">Due Date :</form:label>
                    <form:input type="Date" path="dueDate" cssClass="border-2 border-black w-[60%] rounded"/>
                </div>
                <div class="flex justify-end mr-5">
                    <form:errors path="dueDate" cssClass="text-red-400 text-sm" />
                </div>
            </div>


            <div class="flex justify-end mr-5 mt-10">
                <button type="submit" class="w-[15%] border-2 mx-10 py-2 rounded shadow-[2px_2px]">
                    Submit Edit
                </button>
                <button class="border-2 w-[15%] rounded shadow-[2px_2px]"> <a href="/home"> Cancel </a></button>
            </div>
    </div>
    <div class="mt-10 h-100  w-[15%]">
        <form:label path="brainstorm" cssClass="m-2 text-3xl text-blue-500">Brainstorm</form:label>
        <form:checkbox path="brainstorm" value="true"/>

        <form:label path="parsonal" cssClass="m-2 text-3xl text-blue-500">parsonal</form:label>
        <form:checkbox path="parsonal" value="true"/>

        <form:label path="inspiration" cssClass="m-2 text-3xl text-blue-500">inspiration</form:label>
        <form:checkbox path="inspiration" value="true"/>

        <form:label path="review" cssClass="m-2 text-3xl text-blue-500">review</form:label>
        <form:checkbox path="review" value="true"/>

        <form:label path="shortTerm" cssClass="m-2 text-3xl text-blue-500">shortTerm</form:label>
        <form:checkbox path="shortTerm" value="true"/>

        <form:label path="longTerm" cssClass="m-2 text-3xl text-blue-500">longTerm</form:label>
        <form:checkbox path="longTerm" value="true"/>

        <form:label path="followUp" cssClass="m-2 text-3xl text-blue-500">follow Up</form:label>
        <form:checkbox path="followUp" value="true"/>

        <form:label path="backlog" cssClass="m-2 text-3xl text-blue-500">backlog</form:label>
        <form:checkbox path="backlog" value="true"/>
    </div>
</div>
    </form:form>
</body>
</html>
