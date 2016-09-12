
<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="winder.vo.TeamVO"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header_basic.jsp" />
<jsp:include page="nav.jsp" />
<div class="row">
    <div class="col-md-12">
        <h4 class="page-head-line">team list</h4>
	<a href="teamcreate">+create team</a>
	<%
		ArrayList<TeamVO> teamAll = new ArrayList<>();
		teamAll = (ArrayList)request.getAttribute("teamlist");
		System.out.println("++"+teamAll);
		
	%>
	
	<c:forEach var="vo" items="${teamlist}">
		<li>${vo.getTno()}</li>
		
		
		<form action="teamInfo" method="post">
		<input type="hidden" name="teamno" value="${vo.getTno()}">
		
		<div class="col-md-6">
			
               <div class="panel panel-default">
                  
                        <div class="panel-heading" >
                      	
                        Team name :  ${vo.getName()} 
                        </div>
                        
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                	 <thead>
                                    
                                        <tr>
                                            <th>#</th>
                                            <th>Team Name</th>
                                            <th>Team commnet</th>
                                            <th>Team Number</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="success">
                                        	<td></td>
                                            <td>${vo.getName() }</td>
                                            <td>${vo.getContent() }</td>
                                            <td>${vo.getTno() }</td>
                                        </tr>
                                    </tbody>
                                    <thead>
                                    	
                                        <tr>
                                            <th>#</th>
                                            <th>Member Name</th>
                                            <th>Member ID</th>
                                            <th>Member Number</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="success">
                                            <td>1</td>
                                            <td>Ju</td>
                                            <td>ju</td>
                                            <td>ju</td>
                                        </tr>
                                        <tr class="info">
                                            <td>2</td>
                                            <td>ju2</td>
                                            <td>ju2</td>
                                            <td>ju2</td>
                                        </tr>
                                        <tr class="warning">
                                            <td>3</td>
                                            <td>ju3</td>
                                            <td>ju3</td>
                                            <td>ju3</td>
                                        </tr>
                                       
                                    </tbody>
                                </table>
                            </div>
                            <input class="btn btn-primary" type="submit" value="teamInfo">
                          	
                        </div>
                       
                    </div>
                    <!--  end  Context Classes  -->
                </div>
                
               </form>
	</c:forEach>
	
            </div>

        </div>
    </div>
    </div>

</div>

<jsp:include page="footer.jsp" />