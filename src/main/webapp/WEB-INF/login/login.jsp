<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<title>Insert title here</title>
<script>

 		$(function(){
 			$('#memberBtn').on("click",function(){
 			    $('#frm').attr("method","get");
 				$('#frm').attr("action","/itjob/userloginview");
 				$('#frm').submit();
 			})
 			
 			$('#busiBtn').on("click",function(){
 			    $('#frm').attr("method","post");
 				$('#frm').attr("action","/itjob/comloginview");
 				$('#frm').submit();
 			})
 			
 			$('#adminBtn').on("click",function(){
 			    $('#frm').attr("method","post");
 				$('#frm').attr("action","/itjob/adminloginview");
 				$('#frm').submit();
 			})
 			
 		})
 		
 	</script>
</head>
<body>
	<form id="frm">
	<h1>ItJob Login</h1>
	<button id="memberBtn" class="btn btn-primary">회원로그인</button>
	<button id="busiBtn" class="btn btn-primary">기업로그인</button>
	<button id="adminBtn" class="btn btn-primary">관리자로그인</button>
	</form>
</body>
</html>