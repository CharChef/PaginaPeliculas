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
        
        <s:form action="index" class="inisec">
           	<s:submit class="botonI" value="Cerrar Sesi�n"></s:submit>
        </s:form>
        
        <div align="center">
        	<s:select label="Seleccionar Pelicula" cssClass="check-button" headerKey="1" list="listaNombresPeliculas" name="nombre" value="1" />
        </div>
        
        <div>
            <s:form action="buscarPelicula">
           		<s:submit class="botonI" value="buscar"></s:submit>
           	</s:form>
        </div> 
        
	</body>
</html>