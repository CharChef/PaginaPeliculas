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
    
		<div class="mensajeError" align="center">
			<s:text name=":( ops..."></s:text>
		</div>
		
		<div class="mensajeError2" align="center">
			<s:text name="Nombre de usuario y/o contraseña incorrectos. Vuelva a interntarlo."></s:text>
		</div>
		
		<div align="center" style="padding-top: 20px">
        <s:form action="index">
        	<s:submit class="BotonesAct" value="Volver" ></s:submit>
        </s:form>
        </div>
	</body>
</html>