<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <title>New Product</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-white text-black">

<div class="container mx-auto h-100 w-[80%] p-6">

    <h2 class="text-center text-4xl font-semibold mb-6">New Product</h2>

    <a href="/" class="text-blue-600 text-3xl underline mb-4 inline-block">Home</a>
    <hr class="mb-6 border-black"/>

    <form:form method="POST" modelAttribute="product" action="/products/new" class="border border-black">
        <table class="w-full border-collapse border-black">
            <tbody>
            <tr class="border border-black">
                <td class="border border-black px-3 py-2 font-semibold">Name:</td>
                <td class="border border-black px-3 py-2">
                    <form:input path="name" id="name" class="w-full border border-black rounded-sm px-2 py-1" />
                    <form:errors path="name"/>

                </td>
            </tr>
            <tr class="border border-black">
                <td class="border border-black px-3 py-2 font-semibold">Description:</td>
                <td class="border border-black px-3 py-2">
                    <form:input path="description" class="w-full border border-black rounded-sm px-2 py-1"/>
                    <form:errors path="description"/>
                </td>
            </tr>
            <tr class="border border-black">
                <td class="border border-black px-3 py-2 font-semibold">Price:</td>
                <td class="border border-black px-3 py-2">
                    <form:input path="price" id="price" value="0.0" class="w-full border border-black rounded-sm px-2 py-1" />
                    <form:errors path="price"/>
                </td>
            </tr>
            <tr class="border border-black">
                <td colspan="2" class="border border-black p-1">
                    <input type="submit" value="Submit"
                           class="w-full border border-black rounded-sm px-2 py-2 cursor-pointer bg-white hover:bg-gray-100"/>
                </td>
            </tr>
            </tbody>
        </table>
    </form:form>

</div>

</body>
</html>