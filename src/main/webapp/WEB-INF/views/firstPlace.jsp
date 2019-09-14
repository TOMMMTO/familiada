<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>


<form method="POST" action="/firstPlace" modelAttribute="firstPlace">
    <section id="firstPlace">
         <script language="JavaScript">

            function image() {
            };

            image = new image();
            number = 0;

            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania biletu lotniczego do Radomia!</b>" +
                "<a><img src='https://notatnikpodroznika.pl/wp-content/uploads/2018/05/pass-2836251_640.png' width=\"650\" height=\"350\"></a>"
            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania biletu autokarem do Ciechocinka!</b>" +
                "<a><img src='http://archiwum.szynwald.pl/images/stories/bilety-pks/szynwald-biletpks3.jpg' width=\"250\" height=\"650\"></a>"
            image[number++] = "<b>Gratulujemy Zwycięzcy wygrania wyprawy dookoła Podlasia żubrem!</b>" +
                "<a><img src='https://d-art.ppstatic.pl/kadry/k/r/1/56/28/5cbdacd7dd54c_o_large.jpg' width=\"1000\" height=\"700\"></a>"

            increment = Math.floor(Math.random() * number);

            document.write(image[increment]);

        </script>
    </section>

</form>
</body>
</html>