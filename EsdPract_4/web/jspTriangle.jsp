<%-- 
    Document   : jspPage
    Created on : 10-Nov-2020, 12:01:14
    Author     : Marken Tuan Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>     
       <%
           String str = (String)request.getAttribute("triangleMsg");
           out.println(str);
        %>
    </body>
</html>
