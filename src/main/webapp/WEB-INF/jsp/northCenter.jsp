<%@ page import="java.net.InetAddress" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>${pageContext.servletContext.servletContextName}</title>
        <base href="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, '')}${pageContext.request.contextPath}/" />
    </head>
    <body>
        <h2>northCenter</h2>
        <div> tilesvala: ${tilesvala} </div>        <!-- CWEID 80 -->
        <div> tilesvalb: ${tilesvalb} </div>
        <div> tilesvalc: ${tilesvalc} </div>
        <div> tilesvald: ${tilesvald} </div>        <!-- CWEID 80 -->
        <tiles:insertAttribute name="north-content"/>
        <tiles:insertAttribute name="center-content"/>
    </body>
</html>
