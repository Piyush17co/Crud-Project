<%@page import="com.Dao.StudentDao"%>
<%@page import="com.Bean.StudentBean"%>
<%@page import="java.util.List"%>
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
    List<StudentBean> list = StudentDao.getAllStudent();
%>
<table border ="1" Width = "100%" cellpadding=5 cellspacing=5 >
   <tr>
        <th>ID</th>
        <th>FName</th>
        <th>LName</th>
        <th>Email</th>
        <th>Edit</th>
        <th>Delete</th>
   </tr>
   <%
      for(StudentBean s : list)
      {
   %>
   <tr>
     <td> <%= s.getId() %> </td>
     <td> <%= s.getFname() %> </td>
     <td> <%= s.getLname() %> </td>
     <td> <%= s.getEmail() %> </td>
     <td>
         <form name ="edit" method ="post" action ="ActionController">
              <input type = "hidden" name = "id" value = "<%= s.getId() %>">
              <input type = "submit" name ="action"  value ="edit">
         </form>
     </td>
      <td>
         <form name ="Delete" method ="post" action ="ActionController">
              <input type = "hidden" name = "id" value = "<%= s.getId() %>">
              <input type = "submit" name ="action"  value ="delete">
         </form>
     </td>
   </tr>
   <%
      }
   %>
</table>
</body>
</html>