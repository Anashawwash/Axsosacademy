<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>
<div class="w-[25%] mx-auto">
    <h1 class="text-5xl text-center mt-10">Send an omikuji!</h1>
    <form action="/s" method="POST">
        <div class="mt-8 h-160 border-3">
            <div class="h-170 mt-5 mr-2 ml-10">
                <p class="mt-5 text-xl">Pick any number from 5 to 25</p>
                <input class="border-2 w-20" min="5" name="number" max="25" type="number">

                <p class="mt-5 text-xl">Enter the name of any City</p>
                <input type="text"  class="border-2" name="city">


                <p class="mt-5 text-xl">Enter the name of any real person</p>
                <input type="text"  class="border-2" name="person">



                <p class="mt-5 text-xl">Enter professional endeavor or hobby</p>
                <input type="text"  class="border-2" name="hobby">



                <p class="mt-5 text-xl">Enter any type of living thing.</p>
                <input type="text"  class="border-2" name="thing">


                <p class="mt-5 text-xl">say something nice to someone</p>
                <textarea name="nice" class="border-2 h-20" id=""></textarea>


                <p class="mt-5 text-xl">Send and show a frind</p>

                <div class="flex justify-end pr-10">
                    <button class="text-2xl w-20 border-3 border-black shadow-[2px_2px_black] bg-green-600 text-white">Send</button>

                </div>

            </div>
        </div>

    </form>

</body>
</html>
