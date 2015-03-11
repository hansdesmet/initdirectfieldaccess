<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<!doctype html>
<html lang='nl'>
<head>
<title>initDirectFieldAccess</title>
</head>
<body>
<form:form action='${url}' commandName='commandObject'>
<form:input path='array[0]'/>
<form:input path='list[0]'/>
<form:input path='map[1]'/>
<input type='submit'>
</form:form>
</body>
</html>