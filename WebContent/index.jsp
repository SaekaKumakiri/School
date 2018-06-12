<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='../css/fullcalendar.min.css' rel='stylesheet' />
<link href='../css/fullcalendar.print.min.css' rel='stylesheet' media='print' />
<script src='../lib/moment.min.js'></script>
<script src='../lib/jquery.min.js'></script>
<script src='../js/fullcalendar.min.js'></script>
<script src='../js/ja.js'></script>
<title>参加申請</title>
</head>

<script>
    $(document).ready(function() {
        $('#calendar').fullCalendar({
            events: {
                url : '/servlet/CalendarServlet'
            }
        });
    });
</script>

<style>
  body {
    margin: 40px 10px;
    padding: 0;
    font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
    font-size: 14px;
  }

  #calendar {
    max-width: 1000px;
    margin: 0 auto;
  }
</style>
</head>
<body>
  <div id='calendar'></div>
</body>
</html>