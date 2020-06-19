<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 25018
  Date: 2020/4/19
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
   <%-- <script src="https://cdn.bootcss.com/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
   <%-- <script src="https://cdn.bootcss.com/jquery/2.2.1/jquery.min.js"></script>--%>
    <style type="text/css">
        body{
            margin-top: 25px;
        }
    </style>
</head>
<body>
<div class="container">
     <div class="row">
          <div class="col-md-4">
                <h4>员工列表 ——显示所有员工信息</h4>
          </div>
          <div class="col-md-4">
              <button class="btn" type="button">
                  <a href="${pageContext.request.contextPath}/addEmp">添加员工</a>
              </button>
          </div>
         <div class="col-md-4">
              <form action="${pageContext.request.contextPath}/searchEmp" class="form form-inline form-group">
                    <input type="text" id="name" class="form-control" placeholder="请输入搜索内容">
                    <button class="btn btn-default" type="submit">搜索</button>
              </form>
        </div>
    </div>
    <div class="row">
        <table class="table table-hover table-striped">
            <thead>
            <tr class="info">
                <th>ID</th>
                <th>姓名</th>
                <th>性别</th>
                <th>邮箱</th>
                <th>部门编号</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${lists}" var="emp">
                <tr>
                    <td>${emp.emp_id}</td>
                    <td>${emp.emp_name}</td>
                    <td>${emp.gender}</td>
                    <td>${emp.email}</td>
                    <td>${emp.d_id}</td>
                    <td><a href="${pageContext.request.contextPath}/deleteEmp?e_id=${emp.emp_id}">删除</a>&nbsp;|&nbsp;<a href="${pageContext.request.contextPath}/updateEmp?e_id=${emp.emp_id}">修改</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>