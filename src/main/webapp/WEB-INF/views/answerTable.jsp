<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
    <section id="tables">

        <table border="1">
            <thead>
            <tr> <!-- table row-->
                <th>${randomQuestion.question}</th>
            </tr>
            </thead>
        </table>
        <table border="1">
            <thead>
            <tr>
                <th>Odpowiedź</th>
                <th>Liczba punktów</th>
            </tr>
            </thead>
            <c:forEach var="answer" items="${answersForQuestion}">
                <tr>
                    <td>${correct && answer.id == id ? answer.answer : ""}</td>
                    <td>${correct && answer.id == id ? answer.points : ""}</td>
                    </tr><br>
            </c:forEach>
        </table>

    </section>

</body>
</html>