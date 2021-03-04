<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>login.Jsp</title>
<script>
  $(function(){
  $('#memberBtn').on("click",function(){
     $('#frm').attr("method","get");
  $('#frm').attr("action","/login/userloginok");
  $('#frm').submit();
  })
 
  $('#busiBtn').on("click",function(){
     $('#frm').attr("method","post");
  $('#frm').attr("action","/login/comloginok");
  $('#frm').submit();
  })
 
  $('#adminBtn').on("click",function(){
     $('#frm').attr("method","post");
  $('#frm').attr("action","/login/adminloginview");
  $('#frm').submit();
  })
 
  })
 
  </script>
<body class="login-page">
<div class="login-header box-shadow">
<div class="container-fluid d-flex justify-content-between align-items-center">
<div class="brand-logo">
<a href="${cp }/login/login">
<img src="${cp }/admin/vendors/images/deskapp-logo.svg" alt="">
</a>
</div>
<div class="login-menu">
<ul>
<li><a href="register.jsp">Register</a></li>
</ul>
</div>
</div>
</div>

<div class="login-wrap d-flex align-items-center flex-wrap justify-content-center">
<div class="container">
<div class="row align-items-center">
<div class="col-md-6 col-lg-7">
<img src="${cp }/admin/vendors/images/login-page-img.png" alt="">
</div>
<div class="col-md-6 col-lg-5">
<div class="login-box bg-white box-shadow border-radius-10">
<div class="login-title">
<h2 class="text-center text-primary">로그인</h2>
</div>
<form id="frm">
<div class="select-role">
<div class="btn-group btn-group-toggle" data-toggle="buttons">
<label class="btn active">
<input type="radio" name="options" id="busiBtn">
<div class="icon">
<img src="${cp }/admin/vendors/images/person.svg" class="svg" alt=""></div>
<span>I'm</span>개인 회원
</label>
<label class="btn">
<input type="radio" name="options" id="memberBtn">
<div class="icon"><img src="${cp }/admin/vendors/images/person.svg" class="svg" alt=""></div>
<span>I'm</span> 기업 회원

</label>
</div>
</div>
<div class="input-group custom">
<input type="text" class="form-control form-control-lg" placeholder="Id를 입력하세요 ">
<div class="input-group-append custom">
<span class="input-group-text"><i class="icon-copy dw dw-user1"></i></span>
</div>
</div>
<div class="input-group custom">
<input type="password" class="form-control form-control-lg" placeholder="비밀번호를 입력하세요">
<div class="input-group-append custom">
<span class="input-group-text"><i class="dw dw-padlock1"></i></span>
</div>
</div>
<div class="row pb-30">
<div class="col-6">
<div class="custom-control custom-checkbox">
<input type="checkbox" class="custom-control-input" id="customCheck1">
<label class="custom-control-label" for="customCheck1">Remember</label>
</div>
</div>
<div class="col-6">
<div class="forgot-password"><a href="${cp }/login/forgot-id">아이디 찾기</a></div>
<div class="forgot-password"><a href="${cp }/login/forgot-password">비밀번호 찾기</a></div>
</div>
</div>
<div class="row">
<div class="col-sm-12">
<div class="input-group mb-0">
<!--
use code for form submit

-->
<input class="btn btn-primary btn-lg btn-block" type="submit" value="로그인">
</div>
<div class="font-16 weight-600 pt-10 pb-10 text-center" data-color="#707373">OR</div>
<div class="input-group mb-0">
<a class="btn btn-outline-primary btn-lg btn-block" href="${cp }/itjob/register">회원 가입</a>
</div>
</div>
</div>
</form>
</div>
</div>
</div>
</div>
</div>
</body>