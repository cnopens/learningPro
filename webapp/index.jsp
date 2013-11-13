<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-11-12
  Time: 下午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" uri="/WEB-INF/tags/pager.tld"%>
<!DOCTYPE html>
<html>
<head>
    <title>测试分页标签</title>
    <link href="<%=path%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/resources/css/bootstrap-responsive.css" rel="stylesheet">
    <script type="text/javascript">
        function toDel(id){
            var url = "<%=path%>/test/del?id=" + id +"&pageNum=${param.pageNum}&pageSize=${param.pageSize}";
            window.location.href = url;
        }
    </script>
</head>
<body>

<div class="container">
    <c:forEach items="${list}" var="item">
        <div class="border-bottom1">
            <h3><a href="<%=path%>/test/view?id=${item.id}">${item.name}</a></h3>
            <p>
                    ${item.content}
            </p>
            <p class="text-right muted">
                2013-06-22 22:37&nbsp;&nbsp;
                <a href="javascript:toDel('${item.id}');">删除</a>&nbsp;&nbsp;
                <a href="<%=path%>/test/toEdit?id=${item.id}&pageNum=${param.pageNum}&pageSize=${param.pageSize}">编辑</a>&nbsp;&nbsp;
            </p>
        </div>
    </c:forEach>
    <form method="post" id="testForm" action="<%=path%>/test">
        <input type="hidden" name="type" value="${type}">
    </form>
    <page:createPager pageSize="${pageSize}" totalPage="${totalPage}" totalCount="${totalCount}" curPage="${pageNum}" formId="testForm"/>
</div>

</body>
</html>