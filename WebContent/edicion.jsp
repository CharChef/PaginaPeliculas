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
           	<s:submit class="botonI" value="Cerrar Sesión"></s:submit>
        </s:form>
       	<s:form action="finEdicion">
       		<s:textfield class="textEdit" name="nombre" value="%{pelicula.nombre}"/>
       		<s:textfield class="textEdit" name="anio" value="%{pelicula.anio}"/>
       		<s:textfield class="textEdit" name="categoria" value="%{pelicula.categoria}"/>
       		<s:select class="textEdit" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7','8':'8','9':'9','10':'10'}" 
				headerKey="1" name="calificacion" value="%{pelicula.calificacion}"/>
			<s:textfield class="textEdit" name="imdb" value="%{pelicula.imdb}"/>
       		<s:textfield class="textEdit" name="cal_imdb" value="%{pelicula.cal_imdb}"/>
       		<s:textfield class="textEdit" name="trailer" value="%{pelicula.trailer}"/>
       		<s:textarea class="areaEdit" name="comentario" value="%{pelicula.comentario}"></s:textarea>
       		<s:textfield class="textEdit" name="tapa" value="%{pelicula.tapa}"> </s:textfield>
       		<s:submit class="BotonBuscar" value="Fin de Edición" align="center" ></s:submit>
		</s:form>
		
		<s:form action="index">
			<div align="center">
        			<s:submit class="BotonBuscar" value="Cancelar" align="center" ></s:submit>
        	</div>
		</s:form>		
			
	</body>
</html>