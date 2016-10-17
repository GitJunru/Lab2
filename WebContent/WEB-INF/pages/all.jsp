<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css">
<title>DataBase</title>
</head>
<body>
<br>
<a href="javascript:history.go(-1);"> &lt; &lt;返回上一页</a>
<br>
<div class="row">
   <div class="col-lg-6 col-lg-offset-3">
     <div class="well bs-component">
     
  <table class="table table-striped table-hover ">
  <thead>
    <tr>
      <th>图书列表</th>
      <th>ISBN</th>
      <th>Title</th>
      <th>AuthorID</th>
      <th>Publisher</th>
      <th>PublishDate</th>
      <th>Price</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    	<td>#</td>
      	<s:iterator value="bookDetail" id="st"> 
			<td>${st}</td>
		</s:iterator> 
    </tr>
    </tbody>
</table> 
 
<table class="table table-striped table-hover ">
  <thead>
    <tr>
      <th>作者列表</th>
      <th>AuthorID</th>
      <th>Name</th>
      <th>Age</th>
      <th>Country</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    	<td>#</td>
      	<s:iterator value="authorDetail" id="sa"> 
			<td>${sa}</td>
		</s:iterator> 
    </tr>
    </tbody>
</table>


</body>
</html>