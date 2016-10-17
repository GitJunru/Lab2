<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   
"http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css">
<title>Library System</title>  
</head>  
  
<body>  
  <br><br>
<form action="find-book.action" method="post"> 

<div class="row">
   <div class="col-lg-6 col-lg-offset-3">
     <div class="well bs-component">
<form class="form-horizontal">
  <fieldset>
    <legend>作者查询</legend>
    <div class="form-group">
      <label for="search" class="col-lg-2 control-label">作者名</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="AuthorName" placeholder="作者名">
      </div>
    </div>
    <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-warning">Reset</button>
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </div>
    </fieldset>
</form>
</div></div></div>
</form>  
 
 <form action="add.action" method="post"> 
 <table>  
    
    <tr>  
         
        <center><a href="add.action" class="btn btn-success">新建</a></center>
    </tr>  
</table> 
</form>  
</body>  
</html>