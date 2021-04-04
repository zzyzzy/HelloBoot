<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
	<h1>세미 프로젝트 v1</h1><!-- 타이틀 -->
	<nav>
		<ul class="nav">
		<li><a href='/jindex'>Home</a></li>
		<li><a href='/jjoin'>회원가입</a></li>

		<c:if test="${empty logininfo}">
			<li><a href='/jlogin'>로그인</a></li></c:if>

		<c:if test="${not empty logininfo}">
			<li><a href='/jlogout'>로그아웃</a></li></c:if>

		<li><a href='/jlist'>게시판</a></li>
		<li><a href='/jmember'>회원정보</a></li>
		</ul>
	</nav><!-- 상단 메뉴 -->
	<hr><!-- 구분선 -->
</header>
