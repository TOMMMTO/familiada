<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="pl-PL">
<body>
<h2>${question}</h2>
<table border="1">
    <thead>
    <tr>
        <th>Numer pytania</th>
        <th>Odpowiedź</th>
        <th>Liczba punktów</th>
    </tr>
    </thead>
    <tr>
        <td>1</td>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
    <tr>
        <td>2</td>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
    <tr>
        <td>3</td>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
    <tr>
        <td>4</td>
        <td>${answer}</td>
        <td>${points}</td>
    </tr>
</table>

</body>
</html>