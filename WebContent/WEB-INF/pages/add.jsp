<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css">
<title>Add New</title>
</head>
<body><br><br>

<form action="add-new.action" method="post"> 
<div class="row">
    <div class="col-lg-6 col-lg-offset-3">
      <div class="well bs-component">
	<form class="form-horizontal">
  <fieldset>
    <legend>新增书籍信息</legend>
    <div class="form-group">
      <label for="inputISBN" class="col-lg-2 control-label">ISBN</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputISBN" placeholder="ISBN">
      </div>
    </div>
    <div class="form-group">
      <label for="inputTitle" class="col-lg-2 control-label">Title书名</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputTitle" placeholder="Title">
      </div>
    </div>
    <div class="form-group">
      <label for="inputAuthorID" class="col-lg-2 control-label">AuthorID</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputAuthorID" placeholder="AuthorID">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPublisher" class="col-lg-2 control-label">Publisher</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputPublisher" placeholder="Publisher">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPublishDate" class="col-lg-2 control-label">PublishDate</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputPublishDate" placeholder="PublishDate">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPrice" class="col-lg-2 control-label">Price</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputPrice" placeholder="Price">
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
</div>
</div>
</div>
</form>

	<tr>
		<!-- <center><td><a href="index.jsp" class="btn btn-default">返回首页</a></td></center> -->
		
		<%String ref = request.getHeader("REFERER");%>   
		<center><input type="button" name="returngo" value="取消"   
		    onclick="javascript:window.location='<%=ref%>'" ></center>
	</tr>
	
</body>
</html>