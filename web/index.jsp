<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/1/2020
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  </head>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/display-discount">
    <input class="form-control form-control-lg" type="number" placeholder="list price" name="price">
    <input class="form-control" type="number" placeholder="discount percent" name="discount">
    <input class="form-control form-control-sm" type="text" placeholder="description" name="description">
    <button type="submit" id="submit" >calculation</button>
  </form>

  </body>
</html>
