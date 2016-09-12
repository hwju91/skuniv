<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="header_index.jsp" />
<jsp:include page="nav.jsp" />
<jsp:include page="menu_basic.jsp" />

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
	
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="img/p01.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
	          <div style="color:black;">
		          <h1>P1 slider</h1>
		          <p>Winder main page slider</p>
	        </div>
        </div>
      </div>

      <div class="item">
        <img src="img/p02.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
	          <div style="color:white;">
		          <h1>P2 slider</h1>
		          <p>Winder main page slider</p>
	        </div>
        </div>
      </div>
      
      <div class="item">
        <img src="img/p03.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
	          <div style="color:black;">
		          <h1>P3 slider</h1>
		          <p>Winder main page slider</p>
	        </div>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

<jsp:include page="footer.jsp" />