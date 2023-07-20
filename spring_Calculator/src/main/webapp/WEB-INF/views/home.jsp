<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
        crossorigin="anonymous">
    </head>
    <center>
    <body>
        <h1>Calculator App!</h1>
        <p>This is the homepage!</p>
        
        <form action="app" method="post">
  <div class="form-group">
     <input type="number" name="num1" class="form-control" style="width:180px"  placeholder="Enter number 1"  >
   </div>
  <div class="form-group">
     <input type="number"  name="num2" class="form-control" style="width:180px" placeholder="Enter number 2">
  </div>
  <select name="options" id="options">
  <option value="add">Add</option>
  <option value="subtract">Subtract</option>
  <option value="multiply">Multiply</option>
  <option value="divide">Divide</option>
</select>
<input type="submit" class="btn btn-primary" value="Submit">

 </form>
       
    </body>
</html>
