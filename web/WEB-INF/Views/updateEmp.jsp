<%--
  Created by IntelliJ IDEA.
  User: 25018
  Date: 2020/4/20
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息修改</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        .container{
            margin-top: 100px;
            margin-left: 350px;
        }
    </style>
</head>
<body>
<div class="container col-md-6">
    <form action="${pageContext.request.contextPath}/update" role="form" class="form">
        <h3 style="text-align: center;color: #2aabd2" class="col-md-9">员工信息修改页面</h3>
        <div class="form-group col-md-9">
            <div class="input-group">
                <span class="input-group-addon">ID&nbsp;&nbsp;&nbsp;</span>
                <input type="text" name="emp_id" class="form-control" value="${emp.emp_id}" readonly>
            </div>
        </div>
        <div class="form-group col-md-9">
            <div class="input-group">
                <span class="input-group-addon">姓名&nbsp;&nbsp;&nbsp;</span>
                <input type="text" name="emp_name" class="form-control" value="${emp.emp_name}">
            </div>
        </div>
        <div class="form-group col-md-9">
            <div class="input-group">
                <span class="input-group-addon">性别&nbsp;&nbsp;</span>
                <input type="text" name="gender" class="form-control" value="${emp.gender}">
            </div>
        </div>
        <div class="form-group col-md-9">
            <div class="input-group">
                <span class="input-group-addon">邮箱&nbsp;&nbsp;&nbsp;</span>
                <input type="text" name="email" class="form-control" value="${emp.email}">
            </div>
        </div>
        <div class="form-group col-md-9">
            <div class="input-group">
                <span class="input-group-addon">部门&nbsp;&nbsp;&nbsp;</span>
                <input type="text" name="d_id" class="form-control" value="${emp.d_id}">
            </div>
        </div>
        <div class="form-group col-md-9">
            <button type="submit" class="btn btn-block" style="background-color: #2aabd2">确认修改</button>
        </div>
    </form>
</div>
</body>
</html>
