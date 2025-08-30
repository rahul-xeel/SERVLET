<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Testing Page</title>
<style>

*
{

margin:0;
padding:0;

}


#main
{
background-color: white;
 width:100%;
  height:100vh;
   display:flex; 
   flex-direction:column;
     justify-content:center; 
     align-items:center;
}


#sample_form
{

font-size:4vw;
width:50%;
height:10%;
color:white;
display: flex;
justify-content:center;
align-items:center;
background-color: black;

}


#form
{


font-size:4vw;
width:50%;
height:50%;
color:white;
display: flex;
flex-direction:column;
justify-content:center;
align-items:center;
gap: 20%;
background-color: skyblue;
}


#input
{

font-size:4vw;
border:1px solid black;
width:50%;
height:20%;
color: black;
display: flex;
justify-content:center;
align-items:center;
font-size:2vh;
padding:10px;
box-sizing: border-box;

}



#submit_btn
{

font-size:4vw;
border:1px solid black;
width:50%;
height:20%;
color:white;
display: flex;
justify-content:center;
align-items:center;
font-size:4vh;
background-color: black;

}

</style>

</head>
<body>


<section id="main">


	<div id="sample_form">SAMPLE FORM</div>
	
		<form id ="form" action="<%= application.getContextPath() %>/first" method="post">
		
			<input name="name" id="input" placeholder="Enteryou name"/>
			
			<button id="submit_btn">Submit</button>
		
		
		</form>
	
			
		
		
	
	</div>
	
</section>



</body>
</html>