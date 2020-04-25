<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="ActionController" method="post">
       <table>
          <tr> 
             <td> first name</td>
              <td><input type="text" name="fname"></td>
          </tr>
          <tr> 
             <td> last name </td>
             <td><input type="text" name = "lname"></td>
          </tr>
          <tr> 
             <td>Email </td>
             <td><input type="text" name = "email"></td>
          </tr>
          <tr> 
             <td>Password</td>
             <td> <input type="text" name="pass"></td>
          </tr>
          <tr>
           <td><input type ="submit" value="Register" name="action"></td>
           </tr>
       </table>
   </form>
</body>
</html>