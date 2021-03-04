<%@page import="kr.or.itjob.model.ItJobUserVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% ItJobUserVo uservo = (ItJobUserVo)request.getAttribute("users_id");
	
	if(uservo == null){%>
		{
		"cnt" : "0"
		}
		<% 
	}else{%>
		
		{
		"cnt" : "1"
		}
		
	<% }%>

