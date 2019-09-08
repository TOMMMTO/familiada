<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<body>

<form name='loginForm'
      action="<c:url value='/login'/>" method='POST'>

    <h2>Podaj imię: </h2>
    <td><input class=type='text' name='username'></td>
    <a href="/users">Dołącz do gry!</a>
    <a href="/admin">Panel administracyjny</a>

</form>
</body>
</html>