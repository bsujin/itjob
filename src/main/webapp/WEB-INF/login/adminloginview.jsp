<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<title>Insert title here</title>
<script>

 		$(function(){
 			
 			<c:if test="${msg != null}">
			alert("${msg}");
	 		</c:if>
	 		
 			$('#adminloginBtn').on("click",function(){
 			    $('#frmadmin').attr("method","post");
 				$('#frmadmin').attr("action","/itjob/adminloginok");
 				$('#frmadmin').submit();
 				
 			})
 			
 			$('#adminsingBtn').on("click",function(){
 			    $('#frmadmin').attr("method","get");
 				$('#frmadmin').attr("action","/itjob/adminsignview");
 				$('#frmadmin').submit();
 			})
 			
 			
 		})
 		
 	</script>
</head>
<body>
	<form id=frmadmin>
		<h1>ItJobAdmin Login</h1>
		아이디 : <input id="admin_id" type="text" name="admin_id"/><br>
		비밀번호 : <input id="admin_pass" type="password" name="admin_pass"/><br>
		<button id="adminloginBtn" class="btn btn-primary">로그인</button>
		<button id="adminsingBtn" class="btn btn-primary">관리자회원가입</button>
	</form>
</body>
</html>