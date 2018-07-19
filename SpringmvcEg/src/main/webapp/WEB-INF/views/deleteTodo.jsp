<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete your todos here</title>
</head>
<body>
   <form action="/SpringmvcEg/delete-todo" method="POST">
        Enter Todo id to delete : <input name="id" type="text" /> <input type="submit" value="Delete Todo" />
    </form>
</body>
</html>