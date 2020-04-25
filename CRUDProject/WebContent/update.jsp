<%@page import="com.Bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
      StudentBean s = (StudentBean)request.getAttribute("s");
   %>
   <form name = "frm" method ="post" action = "ActionController">
     <table>
       <tr>
          <td> <input type="hidden" name ="id" value ="<%= s.getId()%>"></td>
       </tr>
       <tr>
           <td> First name </td>
          <td> <input type="text" name ="fname" value ="<%= s.getFname()%>"></td>
       </tr>
       <tr>
          <td> last name </td>
          <td> <input type="text" name ="lname" value ="<%= s.getLname()%>"></td>
       </tr>
       <tr>
           <td> Email </td>
          <td> <input type="text" name ="email" value ="<%= s.getEmail()%>"></td>
       </tr>
       <tr>
           <td><input type ="submit" value="update" name="action"></td>
           </tr>
     </table>
   </form>
</body>
</html>