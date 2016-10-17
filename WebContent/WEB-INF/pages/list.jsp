<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css">
<title>Book List</title>
</head>
<body>
<br><br>
<!--  
<%String ref = request.getHeader("REFERER");%>   
<input type="button" name="returngo" value="返回上一页"   
    onclick="javascript:window.location='<%=ref%>'" >  -->

<div class="row">
   <div class="col-lg-6 col-lg-offset-3">
     <div class="well bs-component">
     
<table>
	
	
 	<tr>
	<s:iterator value="bookname" id="book"> 
		
		<td><a href="book-detail.action?Book=${book}" class="btn btn-success">${book}</a></td>
		<td>&nbsp;</td>
	</s:iterator> 
	</tr>

	
</table>
</div></div></div>
 
	<tr>
		<center><td><a href="index.jsp" class="btn btn-default">返回上一页</a></td></center>
	</tr>
</body>
</html>