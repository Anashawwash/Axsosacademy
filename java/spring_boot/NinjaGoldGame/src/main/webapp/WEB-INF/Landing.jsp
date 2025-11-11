<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Queue" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body>


<div class="mt-10 ml-39 flex items-center">
    <h1 class="text-[24px] font-bold align-center">Your Gold:</h1>
    <h2 class="ml-10 text-[20px] font-bold border w-30 pl-1">${Ninja}</h2>
</div>
<div class="w-[80%] ml-auto mr-auto mt-10 flex justify-between">
    <div class="border w-60 h-50 text-center pt-4">
        <form action="/get-gold" method="post">
            <input type="hidden" name="hidden_input" value="farm">
            <h2 class="text-[25px] mb-7">Farm</h2>
            <p class="text-[20px] mb-7">(earns 10-20 gold)</p>
            <input class="border w-40 shadow-[3px_3px_3px_rgb(0,0,0)] bg-gray-50" type="submit" value="Find Gold!">

        </form>
    </div>
    <div class="border w-60 h-50 text-center pt-4">
        <form action="/get-gold" method="post">
            <input type="hidden" name="hidden_input" value="cave">
            <h2 class="text-[25px] mb-7">Cave</h2>
            <p class="text-[20px] mb-7">(earns 5-10 gold)</p>
            <input class="border w-40 shadow-[3px_3px_3px_rgb(0,0,0)] bg-gray-50" type="submit" value="Find Gold!">
        </form>
    </div>
    <div class="border w-60 h-50 text-center pt-4">
        <form action="/get-gold" method="post">
            <input type="hidden" name="hidden_input" value="house">
            <h2 class="text-[25px] mb-7">House</h2>
            <p class="text-[20px] mb-7">(earns 2-5 gold)</p>
            <input class="border w-40 shadow-[3px_3px_3px_rgb(0,0,0)] bg-gray-50" type="submit" value="Find Gold!">
        </form>
    </div>
    <div class="border w-60 h-50 text-center pt-4">
        <form action="/get-gold" method="post">
            <input type="hidden" name="hidden_input"value="quest">
            <h2 class="text-[25px] mb-4">Quest</h2>
            <p class="text-[20px] mb-4 w-30 ml-auto mr-auto">(earns/takes 0-50 gold)</p>
            <input class="border w-40 shadow-[3px_3px_3px_rgb(0,0,0)] bg-gray-50" type="submit" value="Find Gold!">
        </form>
    </div>
</div>
    <h2 class="ml-39 mt-10 text-3xl">Activites:</h2>
    <div class="border w-[80%] mx-auto h-100 ml-auto mr-auto mt-5 overflow-scroll">

            <%  if(session.getAttribute("message") != null){
        for (String text : (ArrayList<String>) session.getAttribute("message")){

             if(text.contains("lost")){%>
        <p class="text-2xl text-red-500"><%=text%></p>
            <%} else {%>
        <p class="text-2xl text-green-500"><%=text%></p>
    <%}}}%>


    </div>
</body>
</html>

