<%--
  Created by IntelliJ IDEA.
  User: RAZON'S PC
  Date: 3/9/2022
  Time: 8:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP - Login Form</title>
  </head>
  <body>
  <form action ="hello" method="GET">
    UserName: <input type = "text" name = "userName" placeholder = "UserName"><br>
    Password :<input type = "password" name = "password" placeholder="Password">
    <input type="radio" name ="gender" value ="male">Male
    <input type ="radio" name ="gender" value = "female">Female
    <select name ="course" class ="dropdown">
      <option value ="JAVA">Java</option>
      <option value ="JS">Js</option>
      </option>
    </select>
      <input type="checkbox" name ="bike" value="Bike">Bike
      <input type="checkbox" name="bike" value = "Car">Car
      <input type ="submit" value ="Submit">
  </form>


  </body>
</html>
