<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../header_basic.jsp" />
<jsp:include page="../nav.jsp" />
<jsp:include page="../menu_project.jsp" /> 	

<%-- ${tno } --%>
<div class="content-wrapper">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1 class="page-head-line">Project create Form</h1>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-6">
					<div class="panel panel-default">
						<div class="panel-heading">Project create</div>

						<div class="panel-body">

							<form action="projectcreate" mehtod="post">
								<input type="hidden" name="tno" id="tno" value="${tno }"/>
								<div class="form-group">

									<label for="exampleInputEmail1">Project Name</label> <input
										type="text" class="form-control" name="name"
										placeholder="Input projectname" />
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1"> Project Content</label> <input
										type="text" class="form-control" name="content"
										placeholder="Input content" />
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Project Expire Date</label> <input
										type="date" class="form-control" name="exdate"
										placeholder="Input content" />
								</div>
								<button type="submit" class="btn btn-primary" >Submit</button>



							</form>
						</div>
					</div>
				</div>

			</div>
		</div>
		</div>

<jsp:include page="../footer.jsp" />
