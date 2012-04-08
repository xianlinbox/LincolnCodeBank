<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Hello World with Spring 3 MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
    </head>
    <body>
        <h1>Registration Form</h1><br />
        <form:form commandName="User">
            <table>
                <tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
                <tr><td>Name : </td><td><form:input path="name" /></td></tr>
                <tr><td>Age : </td><td><form:input path="age" /></td></tr>
                <tr><td>Sex : </td><td><form:select path="sex">
                        <form:option value="Male"/>
                        <form:option value="Female"/>
                    </form:select></td></tr>
                <tr><td colspan="2"><input type="submit" value="Save Changes" /></td></tr>
            </table>
        </form:form>
    </body>
</html>
