<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>


<form method="POST" action="/thirdPlace" modelAttribute="thirdPlace">
    <section id="thirdPlace">
        <script language="JavaScript">

            function image() {
            };

            image = new image();
            number = 0;

            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania plakatu niezapomianej grupy Modern Talking!</b>" +
                "<a><img src='https://retro.pewex.pl/uimages/services/pewex/i18n/pl_PL/201307/1375251820_by_grzegorz197308_500.jpg?1377279059' width=\"700\" height=\"550\"> </a>"
            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania Tamagotchi!</b>" +
                "<a><img src='https://d2skuhm0vrry40.cloudfront.net/2013/articles/1/5/5/5/6/4/0/136060278877.jpg/EG11/resize/480x-1/quality/75/format/jpg' width=\"250\" height=\"250\"> </a>"
            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania kasety VHS!</b>" +
                "<a><img src='https://sklepwideo.pl/images/thomson_adapter_vhsc.jpg' width=\"300\" height=\"200\"> </a>"

            increment = Math.floor(Math.random() * number);

            document.write(image[increment]);

        </script>
    </section>

</form>

</body>
</html>