<%@page import="winder.vo.TeamVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="header_basic.jsp" />
<jsp:include page="nav.jsp" />

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
   
    <title>Free Responsive Admin Theme - ZONTAL</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME ICONS  -->
    <link href="css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="css/style.css" rel="stylesheet" />
     <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>


<div class="content-wrapper">
        <div class="container">
              <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">Forms </h1>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="panel panel-default">
                        <div class="panel-heading">
                           Team create
                        </div>
                        
   			<div class="panel-body">
           
  		<form action="teamInfo" mehtod="post" >
		  <div class="form-group">
		  	
		    <label for="exampleInputEmail1">Team name</label>
		    <input type="text" class="form-control" name="teamname" placeholder="Input teamname." />
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">Password</label>
		    <input type="password" class="form-control" name="teampassword" placeholder="Password" />
		  </div>
		  
		  <div class="form-group">
		  	<label for="exampleInputComment">Comment</label>
		  	<textarea class="form-control" rows="3" name="teamcomment" placeholder="Input comment"></textarea> 
		  </div>
		 
		  <div class="checkbox">
		    <label>
		      <input type="checkbox" /> Check me out
		    </label>
		  </div>
		  <button type="submit" class="btn btn-default">Submit</button>
                           <hr />
                         <!--   <input type="text" class="form-control" placeholder="Text input"  -->
                           <hr />
                           <!-- <textarea class="form-control" rows="3" placeholder="Text Area"></textarea> -->
                           <hr />
                          

		</form>
         </div>
                            </div>
                    </div>
                    
        </div>
    </div>
    <!-- CONTENT-WRAPPER SECTION END-->
    
    
    
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    &copy; 2015 YourCompany | By : <a href="http://www.designbootstrap.com/" target="_blank">DesignBootstrap</a>
                </div>

            </div>
        </div>
    </footer>


    k9m ,ㅣOTER SECTION END-->
    <!-- JAVASCRIPT AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY SCRIPTS -->
    <script src="/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="/js/bootstrap.js"></script>
</body>
</html>
