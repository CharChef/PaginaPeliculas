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
        
        <s:form action="principalSinLoggeo" class="inisec">
           	<s:submit class="botonI" value="Cerrar Sesión"></s:submit>
        </s:form>
                
        <div>
       		<table class="tablaInfo" align="center">
        		<tr>
        			<td class="portadaPelicula" style="background-image: url(<s:property value="pelicula.tapa"/>)">
        			
        			<td class="infoPeli" align="left">
        				<h2>Nombre: </h2><s:property value="pelicula.nombre"/><br/>
            			<h2>Año: </h2><s:property value="pelicula.anio"/><br/>
	           	 		<h2>Categoria: </h2><s:property value="pelicula.categoria"/><br/>
	            		<h2>Calificación: </h2>
	            			<s:if test="pelicula.calificacion==0">
									Sin calificar
							</s:if>
							<s:else>
 								   <s:property value="pelicula.calificacion"/><br/>
							</s:else>
	            		<h2>IMDB: </h2>
	            			<s:if test="pelicula.imdb==''">
									Sin link a IMDB
							</s:if>
							<s:else>
 								   <a class="linkInfo" href="<s:property value = "pelicula.imdb"/>" > Visitar IMDB</a><br/>
							</s:else>
	            		<h2>Calificación a IMDB: </h2><s:property value = "pelicula.cal_imdb"/><br/>
	            		<h2>Link Trailer: </h2>
	            			<s:if test="pelicula.trailer==''">
									Sin trailer
							</s:if>
							<s:else>
 								   <a class="linkInfo" href="<s:property value="pelicula.trailer" />" > Ver trailer</a><br/>
							</s:else>
	            		<h2>Comentario: </h2>
	            		<s:if test="pelicula.comentario==''">
									Sin comentarios
							</s:if>
							<s:else>
 								   <s:property value ="pelicula.comentario"/><br/>
							</s:else>
        			</td>
        		</tr>
        	</table>
        </div>
        
        <div align="center" style="padding-top: 20px">
        	<s:form action="principalSinLoggeo">
        		<s:submit class="BotonesAct" value="Volver" ></s:submit>
       		</s:form>
        </div>
	</body>
</html>