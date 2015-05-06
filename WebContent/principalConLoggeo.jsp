<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        
        <div class="botones" align="center">
        	<s:form action="EdicionParaAgregar">
            	<s:submit class="BotonesAct" value="Agregar Pelicula"></s:submit>
            </s:form>
            
            <s:form action="elegirParaEditar">
            	<s:submit class="BotonesAct" value="Editar Pelicula"></s:submit>
            </s:form>
            
            <s:form action="elegirParaEliminar">
        		<s:submit class="BotonesAct" value="Eliminar Pelicula"></s:submit>
       		</s:form>
        </div> 
             
        <s:if test="hasActionErrors()">
    		<div class="mensajeError" align="center">
       			<s:text name="Sin peliculas cargadas."/>
    		</div>
		</s:if>
                
        <div class="tabla" align="center">
        	<table >
				<s:iterator value="listaDeListaPeliculas" var="lista" status="estado">
				<tr>
					<s:iterator value="#lista">
            			<td class="celda" style="background-image: url(<s:property value = "tapa"/>)"> 
            			<a class="linkPelicula" href="<s:url namespace="/" action="verPeliculaConLoggeo"><s:param name="nombre" value="%{nombre}" /></s:url>">
                			<h4 class="cartelerah4"><s:property value="nombre" /></h4>
                			</a>
                			<h5 class="cartelerah5">
                			
                			<s:property value="anio" /><br/>
                			<s:property value="categoria" /><br/>
                			<s:property value="cal_imdb" />
                			</h5>
                		</td>
                	</s:iterator>     
        		</tr>
        		</s:iterator>
			</table>
       </div>
	</body>
</html>