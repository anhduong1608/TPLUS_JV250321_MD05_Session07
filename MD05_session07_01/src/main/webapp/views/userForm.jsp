<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Form Nhập Thông Tin</title>
</head>
<body>
<h2>Nhập thông tin cá nhân</h2>
<form:form action="submit" method="post" modelAttribute="user">
  Tên: <form:input path="name"/><br/><br/>
  Tuổi: <form:input path="age"/><br/><br/>
  Địa chỉ: <form:input path="address"/><br/><br/>
  <input type="submit" value="Gửi"/>
</form:form>
</body>
</html>

