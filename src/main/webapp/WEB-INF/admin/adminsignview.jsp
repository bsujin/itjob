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
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			url : "/itjob/capchakey",
			dataType:"json",
			success : function(data) {
				console.log(data.key);
				$("#key").val(data.key);
				$("#div01").html("<img src='captchaImage/"+data.captchaImageName+"'>");
			}
		});
		$("#btn01").on("click",function(){
			var form01Data = $("#form01").serialize();
			console.log(form01Data);
			$.ajax({
				url : "/itjob/capchakey",
				data : form01Data,
				dataType:"json",
				success : function(data) {
				}
			});
		});
	});
</script>
<body>
	<h1>일반 회원가입</h1>
	이름<input type="text"><br>
	아이디<input type="text"><br>
	비밀번번호<input type="password"><br>
	비밀번번호확인<input type="password"><br>
	이메일<input type="text"><br>
	<div id="div01">
	</div>
	<form id="form01">
		<input type="hidden" id="key" name="key">
		<input type="text" name="value">
		<button type="button" id="btn01">전송</button>
	</form>
	
</body>
</html>