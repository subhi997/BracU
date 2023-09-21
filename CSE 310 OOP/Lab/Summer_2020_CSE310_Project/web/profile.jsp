<%-- 
    Document   : profile
    Created on : Sep 2, 2020, 2:29:04 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//Http 1.1
            response.setHeader("Pragma", "no-cache");//Http 1.0
            response.setHeader("Expires", "0");//Proxies
            if (session.getAttribute("email") == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        Hello ${email}
        <form action = "logout" mothod = "POST">
            <input type = "submit" value = "Logout">
        </form>
    </body>
</html>
