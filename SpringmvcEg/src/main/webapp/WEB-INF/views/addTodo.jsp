<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add your todo here</title>
</head>
<body>
    <form action="/SpringmvcEg/add-todo" method="POST">
        Description : <input name="describe" type="text" /> <input type="submit" value="Add Todo" />
    </form>
</body>
</html>