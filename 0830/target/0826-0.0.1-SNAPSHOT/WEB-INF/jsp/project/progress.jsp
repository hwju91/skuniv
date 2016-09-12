<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header_basic.jsp" />
<jsp:include page="../nav.jsp" />
<jsp:include page="../menu_project.jsp" />
<div class="row">
	<div class="col-md-12">
		<h4 class="page-head-line">progress</h4>
	</div>	
</div>
<div class="row">

	<div class="col-md-6">
		<!--   Basic Table  -->
		<div class="panel panel-default">
			<div class="panel-heading">TO DO</div>
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th style="min-width: 20px;">#</th>
								<th>Dead Line</th>
								<th>Title</th>
								<th>Content</th>
								<th>ID</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${todo }" var="todo">
							<tr>
								<td style="min-width: 20px;">
								<div class="checkbox">
								<label>
								<input type="checkbox" value="">
								</label>
								</div>
								</td>
								<td>${todo.tldate}</td>
								<td>${todo.title }</td>
								<td>${todo.content }</td>
								<td>${todo.id }</td>
							</tr>
							</c:forEach>
					
							
						</tbody>
					</table>
				</div>
			</div>
			<a href="#" class="btn btn-default btn-sm">default</a>
		</div>
	</div>

	<div class="col-md-6">
		<!--   Basic Table  -->
		<div class="panel panel-default">
			<div class="panel-heading">DONE</div>
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th style="min-width: 20px;">#</th>
								<th>Dead Line</th>
								<th>Title</th>
								<th>Content</th>
								<th>ID</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td style="min-width: 20px;">
								<div class="checkbox">
								<label>
								<input type="checkbox" value="">
								</label>
								</div>
								</td>
								<td>03.01</td>
								<td>Markaaaaaaaaaaaaaasssssssssssssssssssaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
								<td>Otto</td>
								<td>@mdo</td>
							</tr>
							<tr>
								<td style="min-width: 20px;">
								<div class="checkbox">
								<label>
								<input type="checkbox" value="">
								</label>
								</div>
								</td>
								<td>03.01</td>
								<td>Jacob</td>
								<td>Thornton</td>
								<td>@fat</td>
							</tr>
							<tr>
								<td style="min-width: 20px;">
								<div class="checkbox">
								<label>
								<input type="checkbox" value="">
								</label>
								</div>
								</td>
								<td>03.01</td>
								<td>Larry</td>
								<td>the Bird</td>
								<td>@twitter</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../footer_todo.jsp" />