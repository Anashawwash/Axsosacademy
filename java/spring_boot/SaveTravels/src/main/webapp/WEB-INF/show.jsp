<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="w-[50%] mx-auto h-100">
    <div class="w-[80%]">
        <div class="mt-5">
            <h1 class="text-3xl">Expense Name = ${travel.name}</h1>
        </div>
        <div class="mt-5">
            <h1 class="text-3xl">Expense Description = ${travel.description}</h1>
        </div>
        <div class="mt-5">
            <h1 class="text-3xl">Expense Vendor = ${travel.vendor}</h1>
        </div>
        <div class="mt-5">
            <h1 class="text-3xl">Amount Spent = $${travel.amount}</h1>
        </div>
    </div>



</div>


</body>
</html>
