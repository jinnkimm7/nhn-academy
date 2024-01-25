<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student - register</title>
</head>

<body>
  <c:choose>
    <c:when test="${empty student}">
      <h1>새로운 학생 등록하기</h1>
    </c:when>
    <c:otherwise>
      <h1>등록된 학생 수정하기</h1>
    </c:otherwise>
  </c:choose>
  <form action="${action}" method="post">
    <input type="number" name="id" value="${empty student ? '' : student.id}" readonly/>
    이름 : <input type="text" name="name" value="${empty student ? '' : student.name}" required/> <br/>
    성별 : 남 <input type="radio" value="M" name="gender" ${!empty student && student.gender == 'M' ? 'checked' : ''} required/>
    여 <input type="radio" value="F" name="gender" ${!empty student && student.gender == 'F' ? 'checked' : ''} required/> <br/>
    나이 : <input type="number" name="age" value="${empty student ? '' : student.age}" required/> <br/>
    <button type="submit">
      <c:choose>
        <c:when test="${empty student}">등록</c:when>
        <c:otherwise>수정</c:otherwise>
      </c:choose>
    </button>
  </form>
</body>
</html>
