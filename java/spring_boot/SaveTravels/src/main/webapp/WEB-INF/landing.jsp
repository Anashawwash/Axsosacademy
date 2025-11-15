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
    <h1 class="text-5xl text-blue-400">Save Travels</h1>
</div>

<div class=" mx-auto w-[80%]">
    <table class="w-full border-2">
        <tr>
            <th class="border-r-2 text-3xl">Expense</th>
            <th class="text-3xl border-2">Vendor</th>
            <th class="text-3xl border-2">Amount</th>
            <th class="text-3xl border-2">Action</th>
        </tr>

        <c:forEach var="burger" items="${Travels}">
            <tr class="even:bg-gray-200 border-2">
                <td class="pl-5 text-center text-3xl"><a class="text-blue-400 underline" href="/show/${burger.id}"> ${burger.name}</a></td>
                <td class="pl-5 text-center text-3xl">${burger.vendor}</td>
                <td class="text-3xl text-center">$${burger.amount}</td>
                <td class="pl-5 text-center text-blue-400 underline text-3xl"><a href="/edit/${burger.id}"> edit</a></td>
                <td class="pl-5 text-center  text-3xl h-15">
                    <button class="border-2 bg-red-500 h-10 shadow-[2px_2px] "> <a href="/delete/${burger.id}">Delete</a></button>
                </td>

            </tr>
        </c:forEach>

    </table>
</div>

<div class="mx-auto h-200 w-[50%] mt-10">
    <form:form action="/create" method="post" modelAttribute="travel">

        <div class=" m-5">
            <div class="flex justify-between">
            <form:label cssClass="text-4xl" path="name">Name</form:label>
            <form:input cssClass="w-[30%] border-2" path="name" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="name"/>
            </div>
        </div>


        <div class=" m-5">
            <div class="flex justify-between">
            <form:label cssClass="text-4xl" path="vendor">Vendor</form:label>
            <form:input cssClass="w-[30%] border-2" path="vendor" />
        </div>
        <div class="flex justify-end mr-5">
            <form:errors cssClass="text-red-400" path="vendor"/>
        </div>
            </div>

        <div class=" m-5">
            <div class="flex justify-between ">
            <form:label cssClass="text-4xl" path="amount">Amount</form:label>
            <form:input cssClass="w-[30%] border-2" path="amount" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="amount"/>
            </div>
        </div>







        <div class="m-5 ">
            <div class="flex justify-between">
            <form:label cssClass="text-4xl" path="description">Description</form:label>
            <form:input cssClass="w-[30%] border-2" path="description" />
            </div>
            <div class="flex justify-end mr-5">
                <form:errors cssClass="text-red-400" path="description"/>
            </div>
        </div>




        <div class="flex justify-end mr-5 mt-10">
            <button class="border-2 text-3xl bg-blue-500 shadow-[2px_2px]" type="submit">Submit</button>
        </div>

    </form:form>
</div>

</body>
</html>
