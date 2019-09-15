<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>


<form method="POST" action="/secondPlace" modelAttribute="secondPlace">
    <section id="secondPlace">
        <script language="JavaScript">

            function image() {
            };

            image = new image();
            number = 0;

            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania książki kucharkiej Magdy Gessler!</b>" +
                "<a><img src='https://ecsmedia.pl/c/kuchenne-rewolucje-nowe-przepisy-magdy-gessler-w-iext43857721.jpg' width=\"350\" height=\"450\"> </a>"
            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania Walkman'a!</b>" +
                "<a><img src='https://www.designboom.com/wp-content/uploads/2019/07/walkman-40-year-anniversary-designboom-600.jpg' width=\"400\" height=\"550\"> </a>"
            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania Game Boy'a!</b>" +
                "<a><img src='https://ocs-pl.oktawave.com/v1/AUTH_2887234e-384a-4873-8bc5-405211db13a2/spidersweb/2019/07/nintendo-game-boy-2.jpg' width=\"450\" height=\"600\"> </a>"

            increment = Math.floor(Math.random() * number);

            document.write(image[increment]);

        </script>
    </section>

</form>

</body>
</html>