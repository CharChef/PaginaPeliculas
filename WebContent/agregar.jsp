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
        
        <div align="center">
       		<s:form class="formEditar" action="agregarPelicula">
       			<s:textfield label="Nombre" class="textEdit" name="nombre"/>
	       		<s:textfield label="Año" class="textEdit" name="anio"/>
	       		<s:textfield label="Categoria" class="textEdit" name="categoria"/>
	       		<s:select label="Calificación" class="textEdit" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7','8':'8','9':'9','10':'10'}" 
					headerKey="1" name="calificacion"/>
 	      		<s:textfield label="Link a IMDB" class="textEdit" name="imdb"/>
 	      		<s:textfield label="Calificación de IMDB" class="textEdit" name="cal_imdb"/>
 	      		<s:textfield label="Link a Trailer" class="textEdit" name="trailer"/>
 	      		<s:textarea label="Comentario" class="areaEdit" name="comentario"></s:textarea>
 	      		<s:textfield label="URL de Imagen" class="textEdit" name="tapa"> </s:textfield>
 	      		<s:submit class="BotonBuscar" value="Agregar" align="center" ></s:submit>
			</s:form>
			
			<s:form action="index">
				<div align="center">
   	     			<s:submit class="BotonBuscar" value="Cancelar" align="center" ></s:submit>
    	    	</div>
			</s:form>
		</div>	
			
	</body>
</html>