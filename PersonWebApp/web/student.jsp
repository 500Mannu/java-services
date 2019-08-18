<%-- 
    Document   : student
    Created on : Aug 18, 2019, 11:49:31 AM
    Author     : Manny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student details</title>
    </head>
    <body>
        <%
            String idno = (String)request.getAttribute("idno");
            int age = (Integer)request.getAttribute("age");
            String gender = (String)request.getAttribute("gender");
            String status = (String)request.getAttribute("status");
            String dob = (String)request.getAttribute("dob");
        %>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>ID number</td>
                <td><%=idno%></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><%=age%></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><%=gender%></td>
            </tr>
            <tr>
                <td>Date of birth</td>
                <td><%=dob%></td>
            </tr>
            <tr>
                <td>Citizenship status</td>
                <td><%=status%></td>
            </tr>
        </table>
        <p><a href="addUserDetails.html">Back</a></p>
    </body>
</html>
