
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Add Users using ajax</title>
        <script src="/SpringMVCDemo/js/jquery.js"></script>
        <script type="text/javascript">
        function doAjaxPost() {
        // get the form values
        var name = $('#name').val();
        var age = $('#age').val();
        var sex = $('#sex').val();

        $.ajax({
        type: "POST",
        url: "/SpringMVCDemo/addUser.htm",
        data: "name=" + name + "&age=" + age +"&sex=" + sex,
        success: function(response){
        if(response.status == "SUCCESS"){
               $('#info').html("User has been added successfully.");
        } else {
               $('#info').html("There is some error occured when transfer data.");
        }
        },
        error: function(e){
        alert('Error: ' + e);
        }
        });
        }
        </script>
    </head>
    <body>
        <h1>Add Users using Ajax ........</h1>
        <table>
            <tr><td>Enter your name : </td><td> <input type="text" id="name"><br/></td></tr>
            <tr><td>Age : </td><td> <input type="text" id="age"><br/></td></tr>
            <tr><td>Sex : </td><td> <input type="text" id="sex"><br/></td></tr>
            <tr><td colspan="2"><input type="button" value="Add Users" onclick="doAjaxPost()"><br/></td></tr>
            <tr><td colspan="2"><div id="info" style="color: green;"></div></td></tr>
        </table>
        <a href="/SpringMVCDemo/showUsers.htm">Show All Users</a>
    </body>
</html>
