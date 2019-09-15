<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<body>
<div>

    <h3>Please login</h3>

    <form name="adminLoginForm"
          action="<c:url value="/admin" />" method="POST">

        <table>
            <tr>
                <td>User:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td colspan="2"><td>
                <a href="/adminPanel">Log In</a>
            </tr>
        </table>

    </form>
</div>

</body>
</html>