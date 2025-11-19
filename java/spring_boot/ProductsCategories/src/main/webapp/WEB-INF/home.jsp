<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>
    <div class="mt-10 h-40">
        <h1 class="text-5xl text-center">Home Page</h1>
    </div>
<div class="w-[85%] mx-auto border-b-2">
    <h1 class=" text-3xl text-blue-500 underline"><a  href="/addProduct">New Product</a></h1>
    <h1 class="my-5  text-3xl text-blue-500 underline"><a href="/addcategory">New Category</a></h1>
</div>
    <table class="w-[85%] mt-5 mx-auto border border-black border-collapse table-auto">
        <thead>
        <tr>
            <th class="border border-black px-4 py-2 text-center font-semibold">Products</th>
            <th class="border border-black px-4 py-2 text-center font-semibold">Categories</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <!-- Products Column -->
            <td class="border border-black px-4 py-2 align-top">
                <c:forEach items="${products}" var="product">
                    <div>
                        - <a href="#" class="text-blue-600 underline">${product.name}</a>
                    </div>
                </c:forEach>
            </td>
            <!-- Categories Column -->
            <td class="border border-black px-4 py-2 align-top">
                <c:forEach items="${categories}" var="category">
                    <div>
                        - <a href="#" class="text-blue-600 underline">${category.name}</a>
                    </div>
                </c:forEach>
            </td>
        </tr>
        </tbody>
    </table>
</body>
</html>
