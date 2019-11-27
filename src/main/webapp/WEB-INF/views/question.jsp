<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
        <td><input hidden type="text" value="${answer1}" id="answerOne"/></td>
        <td><input hidden type="text" value="${answer2}" id="answerTwo"/></td>
        <td><input hidden type="text" value="${answer3}" id="answerThree"/></td>
        <td><input hidden type="text" value="${answer4}" id="answerFour"/></td>
        <td><input id="userAnswer" type="text" onkeyup="this.value = this.value.toUpperCase();"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Check" onclick="checkAnswer()"/></td>
    </tr>
    <script>
        function checkAnswer() {
            var inputValue = document.getElementById("userAnswer").value;
            var firstAn = document.getElementById("answerOne").value.toUpperCase();
            var secondAn = document.getElementById("answerTwo").value.toUpperCase();
            var thirdAn = document.getElementById("answerThree").value.toUpperCase();
            var fourthAn = document.getElementById("answerFour").value.toUpperCase();
            if (inputValue == firstAn) {
                alert("OK1");
            } else if (inputValue == secondAn) {
                alert("OK2");
            } else if (inputValue == thirdAn){
                alert("OK3");
            } else if (inputValue == fourthAn){
                alert("OK4");
            } else {
                alert("NOPE");
            }
        }
    </script>
</table>
</body>
</html>
