<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

</head>
<body> <h1 class="text-center">Here's Your Omikuji !</h1>
 <div class="w-50 m-auto mt-5 p-3 mb-2 bg-info text-dark">
       
        <p>In <c:out value="${number}"/> years,you will live in <c:out value="${city}"/> with <c:out value="${person}"/>
        as your roomate , <c:out value="${hobby}"/>  for a living. The next time you see a <c:out value="${living}"/>, you will have  
        <c:out value="${message}"/> Also,You do not realize how happy you make others.</p>
      
    </div>
    <div class="d-grid gap-2 col-6 mx-auto">
 <a href="/Omikuji" class="btn btn-link" type="button">Go back</a>

</div>
      
       <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>