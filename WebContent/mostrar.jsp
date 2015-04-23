<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="Imagenes/style.css"/>
        <title>TDP PROYECTO 2013</title>
	</head>
	
	<body>
		<div class="panelTitulo">
            <header></header>
        </div>
        
        <div>
        	<s:form action="index">
           		<s:submit class="botonI" value="Cerrar Sesión"></s:submit>
           	</s:form>
        </div> 
        
        <div>
            <s:hidden name="nomVie" value="%{mipeli.nombre}"/>
            <s:text name ="%{mipeli.nombre}"/>
            <s:text name ="%{mipeli.anio}"/>
            <s:text name ="%{mipeli.categoria}"/>
            <s:text name ="%{mipeli.calificacion}"/>
            <s:text name ="%{mipeli.imdb}"/>
            <s:text name ="%{mipeli.cal_imdb}"/>
            <s:text name ="%{mipeli.trailer}"/>
            <s:text name="%{mipeli.comentario}"/>
        </div>
	</body>
</html>