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
        <div class="panelTitulo">
            <header></header>
        </div>
         
        <div class="panelIngresar">
            Usuario:<s:textfield></s:textfield>
            Contraseña:<s:password></s:password>
        </div> 
        
        <div >
            <s:submit class="botonI" value="Iniciar Sesión"></s:submit>
        </div> 
         
        <div class="tabla">          
			<table >
			<s:iterator value="listaListas" var="lista" status="estado">
			<tr>
				<s:iterator value="#lista">
            		<td style="background-image: url(<s:property value = "cartelera"/>)">
                		<h4><s:property value="nombre" /></h4><br/>
                		<h5>
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