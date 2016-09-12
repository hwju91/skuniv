<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
								<!-- 								<th style="min-width: 20px;">#</th> -->
								<th>Dead Line</th>
								<th>Title</th>
								<th>Content</th>
								<th>ID</th>
							</tr>
						</thead>
						<tbody id="div1" ondrop="drop(event)"
							ondragover="allowDrop(event)">
							<c:forEach items="${todo }" var="todo">
								<c:if test="${todo.state eq '1' }">
									<tr draggable="true" ondragstart="drag(event)"
										id="${todo.tlno }">
										<td>${todo.tldate }</td>
										<td>${todo.title }</td>
										<td>${todo.content }</td>
										<td>${todo.id }</td>
									</tr>
								</c:if>
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
						<tbody id="div1" ondrop="drop(event)"
							ondragover="allowDrop(event)">
							<c:forEach items="${todo }" var="todo">
								<c:if test="${todo.state eq '2' }">
									<tr draggable="true" ondragstart="drag(event)"
										id="${todo.tlno }">
										<td>${todo.tldate }</td>
										<td>${todo.title }</td>
										<td>${todo.content }</td>
										<td>${todo.id }</td>
									</tr>
								</c:if>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="row">
<div class="col-md-6">
	<!-- Donut chart -->
	<div class="panel panel-default">
			<div class="panel-heading">DONUT CHART</div>
			<h4>진행률: ${per }</h4>
			<div class="box-body">
				<div id="donut-chart" style="height: 300px;"></div>
			</div>
			<!-- /.box-body-->
	</div>
</div>
<div class="col-md-6">
	<div class="panel panel-default">
		<div class="panel-heading">TO DO PROGRESS BARS</div>
		<div class="panel-body">
		<c:forEach items="${ab }" var="tdlist">
			${tdlist.key }
			<div class="progress progress-striped">
			<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="${tdlist.value }" aria-valuemin="0" aria-valuemax="100" style="width: ${tdlist.value}%">
			</div>
			</div>
		</c:forEach>
		</div>
	</div>
</div>
</div>



<!-- <div ondrop="drop(this, event);" ondragenter="return false;" ondragover="return false;">
	<h2>아래 음식이미지를 종류별로 드레그 해서 넣어보세요.</h2>
	<img src="img/krfood1.jpg" alt="한국음식1" draggable="true" id="kor1" ondragstart="drag(this, event)" />
	<img src="img/krfood2.jpg" alt="한국음식2" draggable="true" id="kor2" ondragstart="drag(this, event)" />
	<img src="img/krfood3.jpg" alt="한국음식3" draggable="true" id="kor2" ondragstart="drag(this, event)" />
	<img src="img/ufood1.jpg" alt="서양음식1" draggable="true" id="u1" ondragstart="drag(this, event)" />
	<img src="img/ufood2.jpg" alt="서양음식2" draggable="true" id="u2" ondragstart="drag(this, event)" />
	<img src="img/ufood3.jpg" alt="서양음식3" draggable="true" id="u3" ondragstart="drag(this, event)" />
	<img src="img/chfood1.jpg" alt="중국음식1" draggable="true" id="ch1" ondragstart="drag(this, event)" />
	<img src="img/chfood2.jpg" alt="중국음식2" draggable="true" id="ch2" ondragstart="drag(this, event)" />
	<img src="img/chfood3.jpg" alt="중국음식3" draggable="true" id="ch3" ondragstart="drag(this, event)" />
</div>
<div class="fl" ondrop="drop(this, event);" ondragenter="return false;" ondragover="return false;">
	<h2>한국음식</h2>
</div>
<div class="fl" ondrop="drop(this, event);" ondragenter="return false;" ondragover="return false;">
	<h2>중국음식</h2>
</div>
<div class="fl" ondrop="drop(this, event);" ondragenter="return false;" ondragover="return false;">
	<h2>서양음식</h2>
</div>
 -->

<jsp:include page="../footer_todo.jsp" />