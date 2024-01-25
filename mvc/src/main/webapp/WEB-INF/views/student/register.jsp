<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student - register</title>
</head>

<body>
  <h1>새로운 학생 등록하기</h1>
  <form action="/student/register" method="post">
    이름 : <input type="text" name="name" required/> <br/>
    성별 : 남 <input type="radio" value="M" name="gender" required/>
    여 <input type="radio" value="F" name="gender" required/> <br/>
    나이 : <input type="number" name="age" required/> <br/>
    <button type="submit">등록</button>
  </form>
</body>
</html>
