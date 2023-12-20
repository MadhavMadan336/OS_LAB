<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Authentication</title>
</head>
<body>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform a simple authentication check (replace this with your actual authentication logic)
        if ("ram".equals(username) && "1234".equals(password)) {
            // Successful login, redirect to welcome page
            response.sendRedirect("welcome.jsp");
        } else {
            // Wrong authentication, display error message
            out.println("Wrong username or password. Please try again.");
        }
    %>
</body>
</html>
