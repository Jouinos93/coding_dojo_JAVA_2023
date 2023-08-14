<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="w-50 m-auto">
<h1>Send an Omikuji!</h1>
<form action='/formprocess' method='POST'>
  <div class="form-group">
    <label for="number">Pick any number from 5 to 25</label>
    <input type="number" name="number" class="form-control" id="number" >
  </div>
  <div class="form-group">
    <label for="city">Enter the name of any city</label>
    <input type="text" name="city" class="form-control" id="city" >
  </div>
  <div class="form-group">
    <label for="person">Enter the name of any real person</label>
    <input type="text" name="person" class="form-control" id="person" >
  </div>
  <div class="form-group">
    <label for="hobby">Enter professional endeavor or hobby</label>
    <input type="text" name="hobby" class="form-control" id="hobby" >
  </div>
 <div class="form-group">
    <label for="living">Enter any type of living thing</label>
    <input type="text" name="living" class="form-control" id="living" >
  </div>
  <div class="form-group">
    <label for="Textarea">Say something nice to someone</label>
    <textarea class="form-control" name="Textarea" id="Textarea" rows="3"></textarea>
  </div>
  <p>Send and show a friend</p>
  <button>Send</button>
</form>
</div>

</body>
</html>




