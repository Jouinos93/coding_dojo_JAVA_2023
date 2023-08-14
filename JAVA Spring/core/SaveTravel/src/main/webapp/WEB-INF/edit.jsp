<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Burger Tracker</h1>
<form:form action="/travel/${travel.id}" mode="post" modelAttribute="travel">
   <input type="hidden" name="_method" value="put">
<div>
	
		<form:label path="ExpenseName">Expense Name:</form:label><br>
		<form:errors path="ExpenseName" class="text-danger"/>
		<form:input path="ExpenseName" style="width:250px;"/>
	</div>
	<div>
		<form:label path="Vendor">Vendor:</form:label><br>
		<form:errors path="Vendor" class="text-danger"/>
		<form:input path="Vendor" style="width:250px;"/>
	</div>
	<div>
		<form:label path="Amount">Amount:</form:label><br>
		<form:errors path="Amount" class="text-danger"/>
		<form:input path="Amount" style="width:250px;"/>
	</div>
	<div>
		<form:label path="Description">Description:</form:label><br>
		<form:errors path="Description" class="text-danger"/>
		<form:textarea path="Description" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="Edit"/>
	</div>
</form:form>
</body>

</html>