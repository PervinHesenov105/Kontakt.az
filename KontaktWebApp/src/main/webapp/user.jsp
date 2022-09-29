<%-- 
    Document   : user
    Created on : Sep 23, 2022, 7:52:46 PM
    Author     : Perfect
--%>

<%@page import="Config.Context"%>
<%@page import="java.util.List"%>
<%@page import="entity.Product"%>

<%@page import="daoInter.ProductDaoInter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           ProductDaoInter pdao = Context.instanceProductDao();
            Product u = pdao.getProductById(1);
        
            
            out.println(u);
            
            %>
        
    </body>
</html>
