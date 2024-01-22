<%--
  Created by IntelliJ IDEA.
  User: jin
  Date: 1/22/24
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>global counter</title>
</head>
<body>
<%!
  private long counter=0;
  private long increaseCounter(){
    return ++counter;
  }
%>
<h1>counter : <%=increaseCounter()%></h1>
</body>
</html>
