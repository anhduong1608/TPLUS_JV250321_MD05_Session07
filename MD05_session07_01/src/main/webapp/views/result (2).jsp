<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết Quả</title>
</head>
<body>
<h2>Thông tin bạn đã nhập:</h2>
<ul>
    <li>Tên: ${user.name}</li>
    <li>Tuổi: ${user.age}</li>
    <li>Địa chỉ: ${user.address}</li>
</ul>
<a href="${pageContext.request.contextPath}/">Quay lại</a>
</body>
</html>
