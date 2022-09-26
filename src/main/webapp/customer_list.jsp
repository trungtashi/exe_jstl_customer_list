<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 26/09/2022
  Time: 3:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.example.exe_jsp_customer.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <style>
        h2{
            text-align: center;
        }
        table{
            margin: 10px auto;
        }
        td{
            padding: 10px 50px;
        }
        img{
            width: 150px;
            height: 80px;
        }
    </style>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<table border="1">
  <thead>
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="c" items="${customerList}">
   <tr>
      <td><c:out value="${c.getName()}"></c:out></td>
      <td><c:out value="${c.getDate()}"></c:out></td>
      <td><c:out value="${c.getAddress()}"></c:out></td>
      <td><img src=" <c:out value="${c.getImg()}"> </c:out>"></td>
    </tr>
  </c:forEach>

  </tbody>
</table>
</body>
</html>
