<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<!-- Basic Page Info -->
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Job Board</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="/WEB-INF/common/itjob/itjob_lib.jsp"%>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header" />
	</header>
		<tiles:insertAttribute name="body" />
	<!-- footer start -->
	<footer class="footer">
	<tiles:insertAttribute name="footer" />
	</footer>
	<!--/ footer end  -->
</body>
</html>