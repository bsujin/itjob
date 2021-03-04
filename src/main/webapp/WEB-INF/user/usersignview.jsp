<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<title>Insert title here</title>
<script>
	$(function(){
		$('#usersignBtn').on("click",function(){
			$('#usersignfrm').attr("method","post");
			$('#usersignfrm').attr("action","/itjob/usersignok");
			$('#usersignfrm').submit();
		})
		
	})
</script>
</head>

<body>
	<form id="usersignfrm">
		<h1>일반 회원가입</h1>
			아이디<input id="users_id" type="text" name="users_id"><button id="sameBtn">중복확인</button><br>
			이름<input type="text" name="users_nm"><br>
			비밀번번호<input type="password" name="users_pass"><br>
			비밀번번호확인<input type="password" ><br>
			이메일<input type="text" name="users_em"><br>
			<button id="usersignBtn">회원등록</button>
			<button id="cansleBtn">취소</button>
	</form>
	
</body>
</html>