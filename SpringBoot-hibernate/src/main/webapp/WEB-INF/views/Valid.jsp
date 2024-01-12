<html>
<body bgcolor="green">
<form action="./addEmp">
Enter Employee ID:<input type="text" name="eid"/>
Enter Employee Name:<input type="text" name="ename"/>
Enter Employee Salary:<input type="text" name="esal"/>
<button type="submit"> Submit</button>
</form>
<hr>
<form action="./updateEmp" method="post">
Enter Employee ID:<input type="text" name="eid"/>
Enter Employee Name:<input type="text" name="ename"/>
Enter Employee Salary:<input type="text" name="esal"/>
<button type="submit"> update Employee</button>
</form>
<hr>
<form action="./deleteEmp" method="post">
Enter Employee ID:<input type="text" name="eid"/>
<button type="submit"> delete Employee</button>
</form>
<hr>
<form action="./selectAll">
<button type="submit"> SelectAll Employee</button>
</form>
</body>
</html>