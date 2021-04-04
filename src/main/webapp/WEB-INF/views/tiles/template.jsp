<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>세미프로젝트 v1</title>
<link rel="stylesheet" href="/css/base.css" />
<link rel="stylesheet" href="/css/join.css" />
<link rel="stylesheet" href="/css/login.css" />
<link rel="stylesheet" href="/css/list.css" />
<link rel="stylesheet" href="/css/write.css" />
<link rel="stylesheet" href="/css/view.css" />
</head>
<body>

<div id="container">
	
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="main"/>
	<tiles:insertAttribute name="footer"/>
	
</div>

<script src="/js/join.js"></script>
<script src="/js/login.js"></script>

</body>
</html>


