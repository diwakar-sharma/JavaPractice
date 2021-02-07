<%@ page import="java.util.*,java.io.*"%> <!-- this is Directive -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Practice</title>
</head>
<body>


<%
int coe = 5; // This is declared inside service method 
%>



<%! //THIS IS DECLARATION NOT SCRIPLET THAT IS WHY USED "!" HERE. This is declared outside service method   
int ver = 6 ;//This is veriable declaration    

public int getSUM(int a, int b){//This is method declaration 
	return (a+b);
}
%>

<% //This is scriplet since this is java code then we can also use java comment
for(int i=0;i<5;i++){
	out.println("var:"+i+"</br>");
}
%>
</br>
<%="THIS IS JSP EXPRESSION" %>
</br>
<%=getSUM(5,6)%>
</body>
</html>