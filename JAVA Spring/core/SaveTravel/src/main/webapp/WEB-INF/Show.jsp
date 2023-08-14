<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel Expenses</title>
</head>
<body>
<div class="container mt-5">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h2 class="card-title mb-4">Expense Details</h2>

						<div class="row">
							<div class="col-md-6">

								<p>
									<strong>Expense Name:</strong> ${oneTravel.expenseName}
								</p>
								<p>
									<strong>Expense Description:</strong> ${oneTravel.description}
								</p>
								<p>
									<strong>Vendor:</strong> ${oneTravel.vendor}
								</p>
								<p>
									<strong>Amount Spent:</strong> ${oneTravel.amount}
								</p>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>