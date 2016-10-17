<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css">
<title>Add new author</title>
</head>
<body>

<form action="add-author.action" method="post"> 
<div class="row">
          <div class="col-lg-6 col-lg-offset-3">
            <div class="well bs-component">
	<form class="form-horizontal">
  <fieldset>
    <legend>补充作者信息</legend>
    <div class="form-group">
      <label for="inputName" class="col-lg-2 control-label">Name</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputName" placeholder="Name">
      </div>
    </div>
    <div class="form-group">
      <label for="inputAuthorID" class="col-lg-2 control-label">Age</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputAge" placeholder="Age">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPublisher" class="col-lg-2 control-label">Country</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" name="inputCountry" placeholder="Country">
      </div>
    </div>
    
    <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-default">Reset</button>
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </div>
    
  </fieldset>
</form>
</div></div></div>
</form>



</body>
</html>