<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="pl-PL">
<body>
<h2>${question}</h2>
<h3>${answer1}</h3>
<h3>${answer2}</h3>
<h3>${answer3}</h3>
<h3>${answer4}</h3>
<table border="1">
    <thead>
    <tr>
        <th>Odpowiedź</th>
        <th>Liczba punktów</th>
    </tr>
    </thead>
    <tr>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
    <tr>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
    <tr>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
    <tr>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
</table>
<table>
    <tr>
        <td><input name="userAnswer"/> </td>
    </tr>
    <tr>
        <td><input type="submit" value="Odpowiedz"/></td>
    </tr>
</table>
<%--<form:form method="post" modelAttribute="question">--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <td><form:label path="answer.answer">Answer</form:label></td>--%>
<%--            <td><form:input path="answer.anwer"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><input type="submit" value="Odpowiedz"></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>
</body>
</html>