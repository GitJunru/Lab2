<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css">
<title>Editing</title>
</head>
<body>

<form action="edit-book.action" method="post"> 
<div class="row">
    <div class="col-lg-6 col-lg-offset-3">
      <div class="well bs-component">
	<form class="form-horizontal">
  <fieldset>
    <legend>编辑书籍信息</legend>
    <div class="form-group">
  	<label class="control-label" for="focusedInput">作者ID</label>
 	 <input class="form-control" name="finishAuthor" type="text" value="${editAuthor}">
	</div>
	<div class="form-group">
  	<label class="control-label" for="focusedInput">出版社</label>
 	 <input class="form-control" name="finishPublisher" type="text" value="${editPublisher}">
	</div>
	<div class="form-group">
  	<label class="control-label" for="focusedInput">出版日期</label>
 	 <input class="form-control" name="finishDate" type="text" value="${editPublishDate}">
	</div>
    <div class="form-group">
  	<label class="control-label" for="focusedInput">价格</label>
 	 <input class="form-control" name="finishPrice" type="text" value="${editPrice}">
	</div>
    
    <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="submit" class="btn btn-primary">Submit</button>
        <%String ref = request.getHeader("REFERER");%> 
        <input type="button" class="btn btn-warning" name="returngo" value="取消"   
		    onclick="javascript:window.location='<%=ref%>'" >
      </div>
    </div>
     
  </fieldset>
</form>
</div>
</div>
</div>
</form>

</body>
</html>