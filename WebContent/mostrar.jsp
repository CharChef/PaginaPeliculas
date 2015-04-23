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
        
        <div class="panelUsuario">
            <s:text name="Administrador"></s:text>
        </div> 
        
        <div>
            <s:hidden name="nomVie" value="nombre"/>
            Nombre: <s:property value ="nombre"/><br/>
            Año: <s:property value ="anio"/><br/>
            Categoria: <s:property value ="categoria"/><br/>
            Calificación: <s:property value ="calificacion"/><br/>
            IMDB: <s:property value = "imdb"/><br/>
            Calificación a IMDB: <s:property value = "cal_imdb"/><br/>
            Link Trailer: <s:property value ="trailer"/><br/>
            Comentario: <s:property value ="comentario"/><br/>
        </div>
	</body>
</html>