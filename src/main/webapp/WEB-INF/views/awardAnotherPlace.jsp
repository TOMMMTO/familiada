<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>

<form method="POST" action="/awardAnotherPlace" modelAttribute="awardAnotherPlace">
    <section id="awardAnotherPlace">
        <b>
            <font size="10">
                Gratulujemy zajęcia miejsca na naszej tablicy Zwycięzców!
            </font>
        </b>
        <br/>
        <b>
            <font size="10">
                Dla Was również mamy nagrodę!
            </font>
        </b>
        <br/>
        <a href="/anotherPlace">
            <img src="https://i.wpimg.pl/730x0/m.gadzetomania.pl/prezent-4578418bbc81d59145a1eb5a.jpg" width="300" height="360" />
        </a>

    </section>
</form>

</body>
</html>