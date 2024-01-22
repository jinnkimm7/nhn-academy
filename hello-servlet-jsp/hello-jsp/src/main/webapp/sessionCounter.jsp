<%--
  Created by IntelliJ IDEA.
  User: jin
  Date: 1/22/24
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session Counter</title>
</head>
<body>
  <%
    Long counter = 0L;
    if(Objects.nonNull(session.getAttribute("counter"))) {
      counter = (Long) session.getAttribute("counter");
    }
    session.setAttribute("counter", ++counter);
  %>
  <h1>
    counter: <%=counter%>
  </h1>
</body>
</html>
