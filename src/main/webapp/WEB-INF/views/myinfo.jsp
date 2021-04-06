<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    

<%@ taglib prefix="c" 
		uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" 
		uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" 
		uri="http://java.sun.com/jsp/jstl/sql" %>
		
<%-- 로그인한 경우이어야만 보여지는 페이지 --%>
<%-- <c:out value="${isLogin}" />
<c:out value="${userid}" /> --%>

<c:if test="${empty lgninfo}">
	<script>location.href="/jlogin"</script>
</c:if>
<%-- 로그인 하지 않고 member.jsp를 보려고 하면 --%>
<%-- login.jsp로 강제 이동 --%>

<div id='main'>
<p>로그인한 아이디 :
	<c:out value='${lgninfo.userid}' /></p>

</div>


