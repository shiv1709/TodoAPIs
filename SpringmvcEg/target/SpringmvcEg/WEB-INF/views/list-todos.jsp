<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todos for ${name}</title>

</head>
<body>
<h1>Your Todos</h1>

 <h3>${todos}</h3>
 
 <h1>Click on below link to add a Todo</h1>
 <h3>
 <a href="/SpringmvcEg/add-todo">Add Todo</a>
 </h3>
 
<br/>
 <br/>
 
 <h1>Click on below link to delete a Todo</h1>
 <h3> 
 <a href="/SpringmvcEg/delete-todo">Delete Todo</a>
 </h3>

<br/>
 <br/>
 
</body>
<!--body>
	<H1>Your Todos</H1>
	<div>
		<table>
			<caption>Your Todos are</caption>

			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Completed</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.describe}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.Done}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<a class="button" href="/SpringmvcEg/add-todo">Add</a>
</body-->


</html>