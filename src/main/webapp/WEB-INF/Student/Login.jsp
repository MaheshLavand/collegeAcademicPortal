<%@page import="java.awt.Font"%>
<form action="checkLogin">
	User Name <input type="text" name="username"><br> <br>
	Password <input type="text" name="password"><br> <br>
	<input type="submit">
</form>

<%
if (request.getAttribute("msg") != null) {
	if (request.getAttribute("msg").equals("Login Susscessfully!!!")) {
%>
<font color="green"> <%
 out.println(request.getAttribute("msg"));
 %>
</font>


<%
} else {
%>
<font color="red"> <%
 out.println(request.getAttribute("msg"));
 %>
</font>
<%
}
}
%>
