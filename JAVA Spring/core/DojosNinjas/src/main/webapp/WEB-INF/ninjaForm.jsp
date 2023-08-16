<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Form</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h2 class="card-title">Add a Ninja</h2>
						<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
							<div class="form-group">
								<form:select path="dojo">
								<c:forEach items = "${dojoList }" var = "oneDojo">
								<form:option value="${oneDojo.id }">
								${oneDojo.name }
								</form:option>
								</c:forEach>
								
								</form:select>
							</div>
							<div class="form-group">
								<form:label path="firstName">First Name:</form:label>
								<form:errors path="firstName" cssClass="text-danger" />
								<form:input path="firstName" class="form-control" />
							</div>
							<div class="form-group">
								<form:label path="lastName">Last Name:</form:label>
								<form:errors path="lastName" cssClass="text-danger" />
								<form:input path="lastName" class="form-control" />
							</div>
							<div class="form-group">
								<form:label path="age">Age:</form:label>
								<form:errors path="age" cssClass="text-danger" />
								<form:input path="age" type="number" class="form-control" />
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>