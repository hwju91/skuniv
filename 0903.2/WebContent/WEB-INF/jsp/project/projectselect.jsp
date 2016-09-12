<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../header_basic.jsp" />
<jsp:include page="../nav.jsp" />
<jsp:include page="../menu_project.jsp" />
<div class="row">
	<div class="col-md-12">
		<h4 class="page-head-line">project</h4>
	</div>
</div>
${tno }
<a href="projectform?tno=${tno }" class="btn btn-primary"><i class="fa fa-edit">+create project</i></a>
<hr/>
<div class="row">
	<c:forEach items="${plist }" var="plist">
		<div class="col-md-4 col-sm-4">
		<div class="panel panel-success">
			<div class="panel-heading">${plist.name }</div>
			<div class="panel-body">
			<a href="projectmain?pno=${plist.pno }&tno=${tno}"><img src="img/pic01.png"></a> 
<!-- 				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.</p> -->
			</div>
			<div class="panel-footer">&nbsp;</div>
		</div>
	</div>
	</c:forEach>
<%-- 	<div class="col-md-4 col-sm-4">
		<div class="panel panel-success">
			<div class="panel-heading">Project</div>
			<div class="panel-body">
			<a href="todo?pno=${pno }"><img src="img/pic01.png"></a> 
<!-- 				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.</p> -->
			</div>
			<div class="panel-footer">&nbsp;</div>
		</div>
	</div>
	<div class="col-md-4 col-sm-4">
		<div class="panel panel-success">
			<div class="panel-heading">Project Management</div>
			<div class="panel-body">
			<a href=""><img src="img/pic02.png"></a> 
<!-- 				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.</p> -->
			</div>
			<div class="panel-footer">&nbsp;</div>
		</div>
	</div>
	<div class="col-md-4 col-sm-4">
		<div class="panel panel-success">
			<div class="panel-heading">Scrap</div>
			<div class="panel-body">
			<a href=""><img src="img/pic03.png"></a> 
<!-- 				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue.</p> -->
			</div>
			<div class="panel-footer">&nbsp;</div>
		</div>
	</div> --%>
</div>

<jsp:include page="../footer.jsp" />