<%-- 
    Document   : UserRegistrationForm
    Created on : Sep 2, 2020, 1:49:37 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="registrationForm.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class = "container">
            <h3>User Registration Form</h3>
        <form name="Register" action="UserRegistration" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Student Name: </td>
                        <td><input type="text" name="stdName" value="" size="50" class = "userInput" /></td>
                    </tr>
                    <tr>
                        <td>Student ID : </td>
                        <td><input type="text" name="stdID" value="" size="50" class = "userInput" /></td>
                    </tr>
                    <tr>
                        <td>Email : </td>
                        <td><input type="text" name="stdEmail" value="" size="50" class = "userInput" /></td>
                    </tr>
                    <tr>
                        <td>Password : </td>
                        <td><input type="password" name="stdPass" value="" size="50" class = "userInput" /></td>
                    </tr>
                    <tr>
                        <td>Address : </td>
                        <td><input type="text" name="stdAdd" value="" size="50" class = "userInput" /></td>
                    </tr>
                    <tr>
                        <td>Phone No : </td>
                        <td><input type="text" name="stdPNO" value="" class = "userInput" /></td>
                    </tr>
                    <tr>
                        <td>Gender : </td>
                        <td><select name="stdGender" class = "userInput">
                                <option>Male</option>
                                <option>Female</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Date of Birth : </td>
                        <td><input type="text" name="stdDOB" placeholder="dd/mm/yyyy" size="50" class = "userInput"/></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Submit" name="submit" class ="registerbtn" />
        </form>
            </div>
    </body>
</html>
