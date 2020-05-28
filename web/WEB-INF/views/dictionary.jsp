<%--
  Created by IntelliJ IDEA.
  User: sonnguyen
  Date: 5/28/2020
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<p1>Hello</p1>

<form action="/search" >
<input type="text" name="word" placeholder="Input a English word" value="${word}">
<input type="text" name="result" placeholder="Result" value="${result}">
<br>
<br>
<button type="submit" name="searchBut">Search</button>
</form>

<form action="/addNew" >
    <input type="text" name="newWord" placeholder="Input a English word" value="${newWord}">
    <input type="text" name="vietnamWord" placeholder="Input a Vietnam word" value="${vietnamWord}">
    <input type="text" name="addResult" placeholder="addResult" value="${resultAdd}">
    <br>
    <br>
    <button type="submit" name="addBut">Search</button>
</form>

</body>
</html>
