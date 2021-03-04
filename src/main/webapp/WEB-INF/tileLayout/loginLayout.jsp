<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<!-- Basic Page Info -->
<meta charset="utf-8">
<%@include file="/WEB-INF/common/itjob/itjob_lib.jsp"%>
<%@include file="/WEB-INF/common/admin/com_lib.jsp"%>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header" />
	</header>
	<section class="blog_area section-padding">
		<div class="container">
			<tiles:insertAttribute name="body" />
		</div>
	</section>
	<!--================Blog Area =================-->

	<!-- footer start -->
	<footer class="footer">
	<tiles:insertAttribute name="footer" />
	</footer>
	<!--/ footer end  -->
<%-- 	<%@include file="/WEB-INF/common/itjob/blog_js.jsp"%> --%>
<%@include file="/WEB-INF/common/admin/com_script.jsp"%>
</body>
</html>

