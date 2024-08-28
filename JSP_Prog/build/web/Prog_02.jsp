<%-- 
    Document   : Prog_02
    Created on : 28-Nov-2023, 12:15:20 pm
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
            java.util.Date date=new java.util.Date();
            out.println("<h2>"+"current Date and Time :"+date.toString()+"</h2>");
            out.close();
        %>
    </body>
</html>
