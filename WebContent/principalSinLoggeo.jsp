<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Imagenes/style.css"/>
        <title>TDP PROYECTO 2013</title>
    </head>
    <body>
    	
    	<s:form action="loggear" namespace="/" class="inisec">
   	 		<div>
   	 			<s:textfield class="usu" name="username" placeholder="Usuario"/>
   	 		</div>	
            <div>	
            	<s:password class="pas" name="password" placeholder="Contraseña"/>
			</div>
			<div>
        		<s:submit class="botonI" value="Iniciar Sesión"/>
    		</div>
    	</s:form>
   
        <div class="panelTitulo">
            <header></header>
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
            			<a class="linkPelicula" href="<s:url namespace="/" action="verPeliculaSinLoggeo"><s:param name="nombre" value="%{nombre}" /></s:url>">
                			<h4 class="cartelerah4"> <s:property value="nombre" /> </h4>
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