<%-- 
    Document   : Prog_05
    Created on : 28-Nov-2023, 12:21:40 pm
    Author     : maham
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
            String name=request.getParameter("uname");
            out.print("Welcome "+name);
        %>
    </body>
</html>
