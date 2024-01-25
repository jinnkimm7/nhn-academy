<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>student - search</title>
  <link rel="stylesheet" href="/style.css" />
</head>
<body>
<h1>학생 등록 성공!!</h1>
<table>
  <tr>
    <th>아이디</th>
    <th>이름</th>
    <th>성별</th>
    <th>나이</th>
  </tr>
  <tr>
    <td>${student.id}</td>
    <td>${student.name}</td>
    <td>${student.gender == "M" ? "남" : "여"}</td>
    <td>${student.age}</td>
  </tr>
</table>
<ul>
  <li><a href="/student/list">리스트</a></li>
  <li>
    <!-- todo ${update_link} 설정 c:url -->
    <a href="${update_link}">수정</a>
  </li>
  <li>
  <%--    <!-- todo 삭제버튼 구현, method=post--%>
 </li>

</ul>

</body>
</html>