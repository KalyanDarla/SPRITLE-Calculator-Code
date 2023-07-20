<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

 <c:if test="${sum!=null}" >
 <h3>The Addition Value  is ${sum}</h3> 
  </c:if>
  
<c:if test="${subtract!=null}" >
 <h3>The Subtract Value  is ${subtract}</h3> 
 </c:if>
 
<c:if test="${multiply!=null}" >
 <h3>The Multiply Value  is ${multiply}</h3> 
  </c:if>
  
<c:if test="${divide!=null}" >
 <h3>The Value  is ${divide}</h3> 
 </c:if>
  
        

</body>
</html>