<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Page</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-white text-black">

<div class="container mx-auto max-w-md p-6">

    <!-- Product Title -->
    <h2 class="text-center text-2xl font-semibold mb-6">${category.name}</h2>

    <!-- Home link -->
    <a href="/" class="text-blue-600 underline mb-4 inline-block">Home</a>
    <hr class="mb-4 border-black"/>

    <!-- Categories List -->
    <div class="mb-6">
        <span class="font-semibold">Categories:</span>
        <div class="ml-4 mt-2">
            <c:forEach var="product" items="${product}">
                <div>- ${product.name}</div>
            </c:forEach>
            <c:if test="${empty category.products}">
                <div>No categories assigned.</div>
            </c:if>
        </div>
    </div>
    <hr class="mb-6 border-black"/>

    <form method="post" action="/category/${category.id}/addProduct">
        <label for="categoryId" class="block mb-2 font-semibold">Add Category:</label>
        <select name="product" class="w-full border border-black rounded-sm px-2 py-1 mb-4 cursor-pointer">
            <option value="0" selected >Category</option>
            <c:forEach items="${productnot}" var="category">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Add" class="w-full border border-black rounded-sm px-2 py-2 cursor-pointer bg-white hover:bg-gray-100"/>
    </form>

</div>




</body>
</html>