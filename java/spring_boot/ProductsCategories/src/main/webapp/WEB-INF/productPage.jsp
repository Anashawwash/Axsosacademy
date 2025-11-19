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
    <h2 class="text-center text-2xl font-semibold mb-6">${product.name}</h2>

    <!-- Home link -->
    <a href="<c:url value='/'/>" class="text-blue-600 underline mb-4 inline-block">Home</a>
    <hr class="mb-4 border-black"/>

    <!-- Categories List -->
    <div class="mb-6">
        <span class="font-semibold">Categories:</span>
        <div class="ml-4 mt-2">
            <c:forEach var="category" items="${product.categories}">
                <div>- ${category.name}</div>
            </c:forEach>
            <c:if test="${empty product.categories}">
                <div>No categories assigned.</div>
            </c:if>
        </div>
    </div>
    <hr class="mb-6 border-black"/>

    <!-- Add Category Form -->
    <form:form method="POST" modelAttribute="categoryForm" action="/products/${product.id}/addCategory" class="">

        <label for="categoryId" class="block mb-2 font-semibold">Add Category:</label>

        <form:select path="categoryId" id="categoryId"
                     class="w-full border border-black rounded-sm px-2 py-1 mb-4 cursor-pointer">
        <form:option value="" label="Select Category" />
            <c:forEach var="category" items="${availableCategories}">
            <form:option value="${category.id}">${category.name}</form:option>
            </c:forEach>
        </form:select>
        <input type="submit" value="Add" class="w-full border border-black rounded-sm px-2 py-2 cursor-pointer bg-white hover:bg-gray-100"/>
    </form:form>

</div>

</body>
</html>