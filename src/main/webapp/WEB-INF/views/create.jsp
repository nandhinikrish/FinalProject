<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Add an object to a model attribute -->
<form:form  action="doAdd"  modelAttribute="custo">

	<table>
	<tr>
		<td><form:label path="fname">FirstName</form:label></td>
		<td><form:input path="fname" /></td> 
	</tr>

	<tr>
		<td><form:label path="lname">LastName</form:label></td>
		<td><form:input path="lname" /></td> 
	</tr>
	
	
	<tr>
		<td><form:label path="age">age</form:label></td>
		<td><form:input path="age" /></td> 
	</tr>
	
	
	<tr>
		<td><form:label path="city">city</form:label></td>
		<td><form:input path="city" /></td> 
	</tr>
	
	<tr>
		<td><form:label path="occupation">occupation</form:label></td>
		<td><form:input path="occupation" /></td> 
	</tr>
	
	
	<%-- <tr>
		<td><form:label path="Email">email</form:label></td>
		<td><form:input path="Email" /></td>
	</tr>
	 --%>
	
	<tr>
		<td><form:label path="cno">contactnumbr</form:label></td>
		<td><form:input path="cno" /></td>
	</tr>
	
	<tr>
	
	<td><form:label path="gender">Gender</form:label></td>
  <td>   Male<form:radiobutton path="gender" value="M"/>  
    Female<form:radiobutton path="gender" value="F"/>  </td>
 
 </tr>
 
 
   
       <tr>
       <td>
       AccountType:</td>
       <td>
       <select name="acctype">  
        <option value="savings" label="savings"/>  
        <option value="current" label="current"/>  
        <option value="recurring" label="recurring"/>  
   
        <select>
        </td>
        </tr>
	<tr>
	<td colspan="2">
 		
 
			<input type="submit" value="proceed"/>
			<input type="submit" value="clear"/>
		</td>
	</tr>
	
	</table>
	</form:form>
</body>
</html>