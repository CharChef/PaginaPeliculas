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
       		<table class="tablaInfo" align="center">
        		<tr>
        			<td class="portadaPelicula" style="background-image: url(<s:property value="pelicula.tapa"/>)">
        			
        			<td class="infoPeli" align="left">
        				<h3>Nombre: </h3><s:property value="pelicula.nombre"/><br/>
            			<h3>Año: </h3><s:property value="pelicula.anio"/><br/>
	           	 		<h3>Categoria: </h3><s:property value="pelicula.categoria"/><br/>
	            		<h3>Calificación: </h3>
	            			<s:if test="pelicula.calificacion==0">
									Sin calificar
							</s:if>
							<s:else>
 								   <s:property value="pelicula.calificacion"/><br/>
							</s:else>
	            		<h3>IMDB: </h3><s:property value = "pelicula.imdb"/><br/>
	            		<h3>Calificación a IMDB: </h3><s:property value = "pelicula.cal_imdb"/><br/>
	            		<h3>Link Trailer: </h3><s:property value ="pelicula.trailer"/><br/>
	            		<h3>Comentario: </h3><s:property value ="pelicula.comentario"/><br/>
        			</td>
        		</tr>
        	</table>
        </div>
	</body>
</html>