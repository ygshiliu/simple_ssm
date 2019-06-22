<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<c:choose>
	<c:when test="${empty sessionScope.user }">
		 <div>
			<a href="tologin">登录</a> | 
			<a href="toregist">注册</a> &nbsp;&nbsp;
			<a href="pages/cart/cart.jsp">购物车</a>
			<a href="pages/manager/manager.jsp">后台管理</a>
			<a href="index.jsp">返回</a>
		</div>
	</c:when>
	<c:otherwise>
		<div>
			<span>欢迎<span class="um_span">${user.username }</span>光临尚硅谷书城</span>
			<a href="pages/cart/cart.jsp">购物车</a>
			<a href="pages/order/order.jsp">我的订单</a>
			<a href="logout">注销</a>&nbsp;&nbsp;
			<a href="index.jsp">返回</a>
		</div>
	</c:otherwise>
</c:choose>


