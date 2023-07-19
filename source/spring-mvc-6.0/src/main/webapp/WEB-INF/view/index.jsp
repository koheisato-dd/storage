<!DOCTYPE html>
 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Spring MVC</title>
	</head>
	<body>
    	<table border="1" style="font-size: 20pt" cellpadding="10">
        	<tr><th>Version</th><th>${yyyymmdd}</th></tr>
        	<tr><th>User Agent</th><th>${userAgent}</th></tr>
        	<tr><th>Pod</th><th>${hostName}</th></tr>
    	</table>
	</body>
</html>