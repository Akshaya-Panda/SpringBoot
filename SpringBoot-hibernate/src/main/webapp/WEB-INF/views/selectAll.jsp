<%@page import="java.util.*"%>
<%@page import="com.example.mvc.hibernate.bean.EmployeeBean"%>
<html>
<body bgcolor="pink">

<%ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)request.getAttribute("obj");%>
<table border="4">
<tr><th>Employee ID</th><th>EmployeeName</th><th>Employee Salary</th></tr>
<%for(EmployeeBean eb:al){%>
<tr><td><%=eb.getEid()%></td><td><%=eb.getEname()%></td><td><%=eb.getEsal()%></td></tr>
<%}%>
</table>
</body>
</html>