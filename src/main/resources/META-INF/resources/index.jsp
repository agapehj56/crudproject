<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>*1TEAM-PROJECT*</title>
	<link rel="stylesheet" href="/css/main/main.css">
</head>
<body>
<div class="main">
	<div class="container">
		<div class="ball"><P>1</p></div>
		<div class="ball"><P>T</p></div>
		<div class="ball"><P>E</p></div>
		<div class="ball"><P>A</p></div>
		<div class="ball"><P>M</p></div>
	</div>
</div>
<div class="container">
	<div style="text-align: center;" class="bg">
		<div style="margin: 0 auto;" >
			<a href="/country/list" data-toggle="tooltip"><img class="img" src="/img/main/country_main.png"></a>
			<a href="/city/list" data-toggle="tooltip"><img class="img" src="/img/main/city_main.png"></a>
			<a href="/memo/1" data-toggle="tooltip"><img class="img" src="/img/main/main.png"></a>
		</div>
	</div>
</div>
</body>
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
</script>
</html>