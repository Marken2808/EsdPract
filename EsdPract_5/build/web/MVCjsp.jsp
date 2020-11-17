<%-- 
    Document   : MVCjsp
    Created on : 17-Nov-2020, 11:23:07
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
        <h1> The list of Projects:</h1>
        <p>
        <% 
            String details = (String) request.getAttribute("data") ;
            out.print(details);
        %>

    </body>
</html>
