<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Save Travels</title>
</head>
<body style="margin:10vw;">
<h1>Save Travels</h1>
<table class="table table-striped table-bordered">
	<thead>
		<tr>
			<th>Expense</th>
			<th>Vendor</th>
			<th>Amount</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="trv" items="${travels}">
			<tr>
				<td><a href="expenses/${trv.id}"><c:out value="${trv.expenseName}"/></a></td>
				<td><c:out value="${trv.vendor}"/></td>
				<td><c:out value="${trv.amount}"/></td>
			    <td><a href="/travel/${trv.id}/edit">Edit</a></td>
			    <td>
			      <form action="/travel/${trv.id}" method="post">
                  <input type="hidden" name="_method" value="delete">
                  <input type="submit" value="Delete">
         	       </form>
			    </td>
			 
			    </tr>
		</c:forEach>
	</tbody>
</table>
<br>
<h2>Add new tavel</h2>
<form:form action="/addTravel" mode="post" modelAttribute="travel">
	<div>
	
		<form:label path="expenseName">Expense Name:</form:label><br>
		
		<form:input path="expenseName" style="width:250px;"/>
	</div>
	<div>
		<form:label path="vendor">Vendor:</form:label><br>
		<form:errors path="vendor" class="text-danger"/>
		<form:input path="vendor" style="width:250px;"/>
	</div>
	<div>
		<form:label path="amount">Amount:</form:label><br>
		<form:errors path="amount" class="text-danger"/>
		<form:input path="amount" style="width:250px;"/>
	</div>
	<div>
		<form:label path="description">Description:</form:label><br>
		<form:errors path="description" class="text-danger"/>
		<form:textarea path="description" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</body>
</html>