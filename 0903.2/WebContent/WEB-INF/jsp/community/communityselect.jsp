<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../header_community.jsp" />
<jsp:include page="../nav.jsp" />
${communitylist }
			<div class="row">
				<div class="col-md-12">
					<h4 class="page-head-line">community</h4>
				</div>
			</div>

			<div class="row">
				<div class="col-md-10">
				                     <!--   Basic Table  -->
				 	<div class="panel panel-default">
                        <div class="panel-heading">
                            community list
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>No.</th>
                                            <th>Title</th>
                                            <th>Content</th>
                                            <th>State</th>
                                            <th>Maker</th>
                                            <th>Date</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>C# project</td>
                                            <td>asdfasdfasdf....</td>
                                            <td>Join</td>
                                            <td>abc</td>
                                            <td>2016-09-08</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Python project</td>
                                            <td>asdfasdfasdf....</td>
                                            <td>Invite</td>
                                            <td>aa</td>
                                            <td>2016-09-08</td>
                                            
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Spring MVC</td>
                                            <td>asdfasdfasdf....</td>
                                            <td>Join</td>
                                            <td>aaa</td>
                                            <td>2016-09-08
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                      <!-- End  Basic Table  -->
                      <a class="btn btn-primary" href="#"><span class="fa fa-edit"></span>edit</a>
                </div>
			</div>
		


<jsp:include page="../footer.jsp" />