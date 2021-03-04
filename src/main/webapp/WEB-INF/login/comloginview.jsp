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
	 		
 			$('#comloginBtn').on("click",function(){
 			    $('#frmcom').attr("method","post");
 				$('#frmcom').attr("action","/itjob/comloginok");
 				$('#frmcom').submit();
 				
 			})
 			
 			$('#comsingBtn').on("click",function(){
 			    $('#frmcom').attr("method","get");
 				$('#frmcom').attr("action","/itjob/comsignview");
 				$('#frmcom').submit();
 			})
 			
 			
 		})
 		
 	</script>
</head>
<body>
	<form id=frmcom>
		<h1>ItJobCom Login</h1>
		아이디 : <input id="com_id" type="text" name="com_id"/><br>
		비밀번호 : <input id="com_pass" type="password" name="com_pass"/><br>
		<button id="comloginBtn" class="btn btn-primary">로그인</button>
		<button id="comsingBtn" class="btn btn-primary">기업회원가입</button>
	</form>
</body>
</html>