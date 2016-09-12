<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../header_basic_test.jsp" /> 
<jsp:include page="../nav.jsp" />
<jsp:include page="../menu_project.jsp" />



					<div class="row">
						<div class="col-md-12">
							<h4 class="page-head-line">project management</h4>
						</div>
					</div>
			  					   <div class="row">
                <div class="col-md-6 col-sm-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            ${pvo.name }
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-tabs">
                                <!-- <li class="active"><a href="#home" data-toggle="tab">Home</a>
                                </li> -->
                                <li class="active"><a href="#profile" data-toggle="tab">Project Profile</a>
                                </li>
                                <li class=""><a href="#messages" data-toggle="tab">Join member</a>
                                </li>
                                <li class=""><a href="#settings" data-toggle="tab">Settings</a>
                                </li>
                            </ul>

                            <div class="tab-content">
                                <!-- <div class="tab-pane fade active in" id="home1">
                                    <h4>Home Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div> -->
                                <div class="tab-pane fade active in" id="profile">
                                    <h4>Project profile</h4>
                                    <!--<p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p> -->
                                	<div class="form-group has-success">
                                        <label class="control-label" for="success">Project Name : ${pvo.name }</label>
                                    </div>
                                    <div class="form-group has-success">
                                        <label class="control-label" for="success">Project pdate : ${pvo.pdate }</label>
                                    </div>
                                    <div class="form-group has-error">
                                        <label class="control-label" for="error">Project Expire Date : ${pvo.exdate }</label>
                                    </div>
                                     <div class="form-group has-warning">
                                        <label class="control-label" for="warning">Project content : ${pvo.content }</label>
                                    </div>
                                    <form action="home" mehtod="post">
                                	<button type="submit"  class="btn btn-default"><i class="fa fa-refresh"></i>Go home</button>
                               		</form>
                                </div>
                                <div class="tab-pane fade" id="messages">
                                    <h4>project joined memberlist</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                	<!-- <a href="#" class="btn btn-default"><i class="fa fa-refresh"></i>udpate</a> -->
                                	<form action="home" method="post">
                                	<button type="submit"  class="btn btn-default"><i class="fa fa-refresh"></i>Go home</button>
                                	</form>
                                </div>
                                <div class="tab-pane fade" id="settings">
                                    <h4>Settings Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                	
									<%-- <a href="#" class="btn btn-default"><i class="fa fa-refresh"></i>update</a>
									<a href="projectupdateform?pvo=${pvo} }" class="btn btn-primary"><i class="fa fa-edit"></i>edit</a>
									<a href="#" class="btn btn-danger"><i class="fa fa-pencil"></i>delete</a>
									 --%>
									 <form action="projectupdateform?pno=${pvo.pno }" method="post">
									 <button type="submit" class="btn btn-primary"><i class="fa fa-edit">update</i></button>
									 </form>
									 <form action="projectdelete?pno=${pvo.pno }" method="post">
									 <button type="submit" class="btn btn-danger"><i class="fa fa-pencil"></i>delete</button>
									 </form>
									
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                         <div class="col-md-6">
                    <div class="alert alert-info">
                        This is a free bootstrap admin template with basic pages you need to craft your project. 
                        Use this template for free to use for personal and commercial use.
                        <br />
                         <strong> Some of its features are given below :</strong>
                        <ul>
                            <li>
                                Responsive Design Framework Used
                            </li>
                            <li>
                                Easy to use and customize
                            </li>
                            <li>
                                Font awesome icons included
                            </li>
                            <li>
                                Clean and light code used.
                            </li>
                        </ul>
                       
                    </div>
                    <div class="alert alert-success">
                         <strong> Instructions To Use:</strong>
                        <ul>
                            <li>
                               Lorem ipsum dolor sit amet ipsum dolor sit ame
                            </li>
                            <li>
                                 Aamet ipsum dolor sit ame
                            </li>
                            <li>
                               Lorem ipsum dolor sit amet ipsum dolor
                            </li>
                            <li>
                                 Cpsum dolor sit ame
                            </li>
                        </ul>
                       
                    </div>
                </div>


<%-- <jsp:include page="../footer.jsp" />
 --%>
