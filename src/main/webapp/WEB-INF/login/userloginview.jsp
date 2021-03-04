<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<title>Insert title here</title>
 <c:if test="${msg != ''}"></c:if>
<script>

 		$(function(){
 			
 			<c:if test="${msg != null}">
				alert("${msg}");
		 	</c:if>
		 	
 			$('#singBtn').on("click",function(){
 			    $('#frm').attr("method","post");
 				$('#frm').attr("action","/itjob/userloginok");
 				$('#frm').submit();
 				
 			})
 			
 			$('#usersignBtn').on("click",function(){
 			    $('#frm').attr("method","get");
 				$('#frm').attr("action","/itjob/usersignview");
 				$('#frm').submit();
 			})
 			
 			
 		})
 		
 	</script>
</head>
<body>
	<form id=frm>
		<h1>ItJobUser Login</h1>
		아이디 : <input  id="users_id" type="text" name="users_id"/><br>
		비밀번호 : <input id="users_pass" type="password" name="users_pass"/><br>
		<button id="singBtn" class="btn btn-primary">로그인</button>
		<button id="usersignBtn" class="btn btn-primary">개인회원가입</button>
	</form>
</body>
</html>