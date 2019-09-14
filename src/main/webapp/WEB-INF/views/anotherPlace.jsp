<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>

<form method="POST" action="/anotherPlace" modelAttribute="anotherPlace">

    <section id="anotherPlace">
        <b>
            <font size="8">
                Nie ma nic cenniejszego niż uśmiech Karola!
            </font>
        </b>
        <br/>
        <a>
            <img src="https://s3.party.pl/tvshow/karol-strasburger-w-teleturnieju-familiada-w-szarym-garniturze-297732-MT.jpg" width="800" height="700">
        </a>
    </section>
</form>

</body>
</html>