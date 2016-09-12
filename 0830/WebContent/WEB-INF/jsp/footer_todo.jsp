<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
</div>
</div>
<!-- CONTENT-WRAPPER SECTION END-->
<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				&copy; 2015 YourCompany | By : <a
					href="http://www.designbootstrap.com/" target="_blank">DesignBootstrap</a>
			</div>

		</div>
	</div>
</footer>
<!-- script -->
<!-- <script src="js/jquery-1.11.1.js"></script> -->
<script src="js/jquery-2.2.3.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/interface.js"></script>
<script src="js/config.js"></script>
<!-- <script src="js/jquery.js"></script> -->
<script src="js/jquery.flot.min.js"></script>
<script src="js/jquery.flot.pie.min.js"></script>

<script type="text/javascript">
$(function() {
	var temp=${per};
	
	
	
	var data = [], totalPoints = 100;

    function getRandomData() {

      if (data.length > 0)
        data = data.slice(1);

      // Do a random walk
      while (data.length < totalPoints) {

        var prev = data.length > 0 ? data[data.length - 1] : 50,
            y = prev + Math.random() * 10 - 5;

        if (y < 0) {
          y = 0;
        } else if (y > 100) {
          y = 100;
        }

        data.push(y);
      }

      // Zip the generated y values with the x values
      var res = [];
      for (var i = 0; i < data.length; ++i) {
        res.push([i, data[i]]);
      }

      return res;
    }
	
	
	
	
	var donutData = [
{
	label : "to do",
	data : 100-temp,
	color : "#d2d6de"
}, {
	label : "done",
	data : temp,
	color : "#0073b7"
}
/* <c:forEach items="${projectmenu }" var="pmenu" varStatus="status">
{
label : "${pmenu.name }",
data : 50,
color : "#3c8dbc"},
</c:forEach>     */
	                 
	                 
	               /*   {
		label : "Series2",
		data : 30,
		color : "#3c8dbc"
	}, {
		label : "Series3",
		data : 20,
		color : "#0073b7"
	}, {
		label : "Series4",
		data : 50,
		color : "#00c0ef"
	} */ ];
	$.plot("#donut-chart", donutData, {
		series : {
			pie : {
				show : true,
				radius : 1,
				innerRadius : 0.4,
				label : {
					show : true,
					radius : 2 / 3,
					formatter : labelFormatter,
					threshold : 0.1
				}

			}
		},
		legend : {
			show : false
		}
	});
})

/*
* Custom Label formatter
* ----------------------
*/
function labelFormatter(label, series) {
return '<div style="font-size:13px; text-align:center; padding:2px; color: #fff; font-weight: 600;">'
    + label
    + "<br>"
    +"</div>";
}
</script>







<!-- <script type="text/javascript">
function drag(target, food) {		//드래그 시작시 호출 할 함수
	food.dataTransfer.setData('Text', target.id);
};
function drop(target, food) {		//드롭시 호출 할 함수
	var id = food.dataTransfer.getData('Text');
	target.appendChild(document.getElementById(id));
	food.preventDefault();	
};
</script> -->



<script>
function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("tr", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("tr");
    ev.target.appendChild(document.getElementById(data));
}
</script>










</body>
</html>