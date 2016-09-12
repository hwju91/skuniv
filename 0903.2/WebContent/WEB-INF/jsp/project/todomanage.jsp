<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../header_basic.jsp" />
<jsp:include page="../nav.jsp" />
<jsp:include page="../menu_project.jsp" />
<div class="row">
	<div class="col-md-12">
		<h4 class="page-head-line">to do management</h4>
		<br>
	</div>
</div>

<div class="row">
<div class="col-md-12">
<a href="todo?pno=${pno }" style="text-align: right; margin: auto; display: block;">
			<h4>
				progress ->
			</h4>
			<br>
		</a>
		<!--   Basic Table  -->
		<div class="panel panel-default">
			<div class="panel-heading">TITLE LIST</div>
			<div class="panel-body">
			<form action="todoupdateform">
			<input type="hidden" name="pno" value="${pno }">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>#</th>
								<th>Title</th>
								<th>Dead Line</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${tlist }" var="tlist">
									<tr >
										<td><input type="radio" name="tdno" value="${tlist.tdno }" /></td>
										<td>${tlist.content }</td>
										<td>${tlist.tddate }</td>
									</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
				<div class="form-group">
					<input type="submit" name="update" value="수정" class="btn btn-default">
					<input type="submit" name="delete" value="삭제" class="btn btn-default">
					</div>
				</form>
			</div>
			
			
			
			
			
			<div class="panel-heading">SUBTITLE LIST</div>
			<div class="panel-body">
			<form action="todolistdelete">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>#</th>
								<th>Title</th>
								<th>Subtitle</th>
								<th>Dead Line</th>
								<th>ID</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${tllist }" var="tllist">
									<tr>
										<td><input type="radio" name="tlno" value="${thlist.tlno }" /></td>
										<td>${tllist.title }</td>
										<td>${tllist.content }</td>
										<td>${tllist.tldate }</td>
										<td>${tllist.id }</td>
									</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
				<div class="form-group">
					<a href="#" style="text-align: right; margin: auto; display: block; float:right;">
					<button type="submit" class="btn btn-default">삭제</button>
					</a>
					<a href="#" style="text-align: right; margin: auto; display: block;">
					<button type="submit" class="btn btn-default">수정</button>
					</a>
					</div>
				</form>
			</div>
			
			
			
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-6">
		<!--   Basic Table  -->
		<div class="panel panel-default">
			<div class="panel-heading">TITLE FORM</div>
			<div class="panel-body">
			<%if("todoupdate".equals((String)request.getParameter("update"))) {%>
				<form action="todoupdate?pno=${pno }">
					<div class="form-group">
						<label>Tilte</label>
						<input type="text" value="${todoselect.content }" class="form-control" name="content" />
						<input type="text" value="${todoselect.tddate }" class="form-control" name="content" />
					</div>
					<div class="form-group">
						<label>Date</label> <input type="date" class="form-control" name="tddate" value="${todoselect.tddate }"/>
					</div>
					<div class="form-group">
					<a href="#" style="text-align: right; margin: auto; display: block;">
					<button type="submit" class="btn btn-default">Submit</button>
					</a>
					</div>
				</form>
						<%} else{%>
				<form action="todoinsert?pno=${pno }">
					<div class="form-group">
						<label>Tilte</label>
						<input type="text" class="form-control" name="content" placeholder="title" />
						<input type="text" value="${todoselect.tdcontent }" class="form-control" name="content" />
					</div>
					<div class="form-group">
						<label>Date</label> <input type="date" class="form-control" name="tddate"/>
					</div>
					<div class="form-group">
					<a href="#" style="text-align: right; margin: auto; display: block;">
					<button type="submit" class="btn btn-default">확인</button>
					</a>
					</div>
				</form>
			<%} %>
			</div>
		</div>
		
		
		
	</div>
	
	
	<div class="col-md-6">
		<!--   Basic Table  -->
		<div class="panel panel-default">
			<div class="panel-heading">SUBTITLE FORM</div>
			<div class="panel-body">
				<form action="todolistinsert?pno=${pno }">
					<div class="form-group">
						<label>Title</label>
						<select class="form-control" name="title">
							<option>One Vale</option>
							<option>Two Vale</option>
							<option>Three Vale</option>
							<option>Four Vale</option>
						</select><br>
						<label>+Subtitle</label> 
					</div>
					<div class="form-group">
						<label>Subtilte</label>
						<textarea class="form-control" rows="3" placeholder="subtitle" name="content"></textarea>
					</div>
					<div class="form-group">
						<label>Date</label> <input type="date" class="form-control" name="tldate" />
					</div>
					<div class="form-group">
						<label>Person in charge</label>
						<select class="form-control" name="id">
							<option value="id">One Vale</option>
							<option value="id">Two Vale</option>
							<option>Three Vale</option>
							<option>Four Vale</option>
						</select>
					</div>
					<div class="form-group">
					<a href="#" style="text-align: right; margin: auto; display: block;">
					<button type="submit" class="btn btn-default">Submit</button>
					</a>
					</div>
				</form>

			</div>
		</div>
		</div>
</div>

<jsp:include page="../footer.jsp" />