<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<!-- Basic Page Info -->
<meta charset="utf-8">
<title>DeskApp - Bootstrap Admin Dashboard HTML Template</title>
<%@include file="/WEB-INF/common/admin/com_lib.jsp"%>
</head>

<body>
	<!-- 내가 설정한 jsp 파일을 가져온다는 의미  -->
	<div class="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div class="right-sidebar">
		<tiles:insertAttribute name="right" />
	</div>
	<div class="left-side-bar">
		<tiles:insertAttribute name="left" />
	</div>

	<div class="main-container">
	<div class="mobile-menu-overlay"></div>
		<div class="pd-ltr-20 xs-pd-20-10">
			<div class="min-height-200px">
				<tiles:insertAttribute name="body" />
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>

	<%@include file="/WEB-INF/common/admin/com_script.jsp"%>
</body>
</html>

