<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOB Board</title>
<%@include file="/WEB-INF/views/common/common_lib.jsp" %>
<script type="text/javascript">
	$(function(){
		$('.jobList').on('click', function(){
			var comid = $(this).data('comid');
			var title = $(this).data('title');
			$('#com_id').val(comid);
			$('#job_title').val(title);
			console.log(comid);
			console.log(title);
			
			$("#frm").attr("action", "${cp }/jobBoard/detailjob_Board");
			$('#frm').submit();
		})
		
	})
	
</script>
</head>
<body>
<div id="layoutSidenav_content">
				
				<div class="container-fluid">
					<div class="row">
						<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
		<form id="frm">
		 <input type="hidden" id="com_id" name="com_id" value="">
		 <input type="hidden" id="job_title" name="job_title" value="">
		</form>
									<div class="table-responsive">
									<button style='float: right;' id="insertPost" class="btn btn-primary" type="button">새글 등록</button>
									<br><br>
										<table class="table table-striped table-hover">
											<tr>
												<th>번호</th>
												<th>기업아이디</th>
												<th>제목</th>
												<th>직무</th>
												<th>고용형태</th>
												<th>작성일시</th>
											</tr>
<%-- 											${jobList } --%>
											<c:forEach items="${jobList }" var="list" varStatus="loop">
											<tr class="jobList" data-comid=${list.com_id } data-title=${list.job_title } >
												<td>${loop.count + ((pageVo.page-1) * 10) }</td>
													<td>${list.com_id}</td>
													<td>${list.job_title }</td>
													<td>${list.job_task }</td>
													<td>${list.job_type }</td>
													<td><fmt:formatDate value="${list.job_date }"  pattern="yyyy-MM-dd"/></td>
												</tr>
											</c:forEach>
										</table>
									</div>
							</div>
						</div>
					</div>
				</div>

 <div class="card-body">
	                        <ul class="boardList pagination" >
	                        	<c:choose>
									<c:when test="${pageVo.page-1 < 1 }">
										<li class="paginate_button page-item next" id="dataTable_next">
											<span class="page-link"><<</span>
			                        	</li>
										<li class="paginate_button page-item next" id="dataTable_next">
											<span class="page-link"><</span>
			                        	</li>
									</c:when>
									<c:otherwise>			
										<li class="paginate_button page-item next" id="dataTable_next">
			                        		<a href="${cp}/jobBoard/job_BoardList?page=${1}&pageSize=${pageVo.pageSize }" class="page-link"><<</a>
			                        	</li>							
										<li class="paginate_button page-item next" id="dataTable_next">
			                        		<a href="${cp}/jobBoard/job_BoardList?page=${pageVo.page-1}&pageSize=${pageVo.pageSize }" class="page-link"><</a>
			                        	</li>
									</c:otherwise>
								</c:choose>
                        	<c:forEach begin="1" end="${pagination }" var="i">
										<c:choose>
											<c:when test="${pageVo.page == i}">
												<li class="active"><span class="page-link">${i}</span></li>
											</c:when>
											<c:otherwise>
												<li class="page-item active">
												<a href="${cp}/jobBoard/job_BoardList?page=${i }&pageSize=${pageVo.pageSize }" class="page-link">${i}</a>
											</c:otherwise>
										</c:choose>
									</c:forEach>
	                        	<c:choose>
									<c:when test="${pageVo.page+1>pagination }">
										<li class="paginate_button page-item next" id="dataTable_next">
											<span class="page-link">></span>
			                        	</li>
			                        	<li class="paginate_button page-item next" id="dataTable_next">
											<span class="page-link">>></span>
			                        	</li>
										
									</c:when>
									<c:otherwise>										
										<li class="paginate_button page-item next" id="dataTable_next">
			                        		<a href="${cp}/jobBoard/job_BoardList?page=${pageVo.page+1 }&pageSize=${pageVo.pageSize }" class="page-link">></a>
			                        	</li>
			                        	<li class="paginate_button page-item next" id="dataTable_next">
			                        		<a href="${cp}/jobBoard/job_BoardList?page=${pagination }&pageSize=${pageVo.pageSize }" class="page-link">>></a>
			                        	</li>
									</c:otherwise>
								</c:choose>
	                        </ul>
                        </div>
</body>
</html>