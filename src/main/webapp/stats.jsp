<%--
  Created by IntelliJ IDEA.
  User: freeemahn
  Date: 30.06.15
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistics of server</title>
</head>
<body>
<jsp:useBean id="stats" class="com.freemahn.Statistics"/>
<% long onlineTime = (System.currentTimeMillis() - stats.getCreationTime()) / 1000 + 1; %>
<table border="1">
    <caption>Requests count</caption>
    <tr>
        <th>Request Type</th>
        <td>All time</td>
        <td>Per second</td>
    </tr>
    <tr>
        <td>
            Get
        </td>
        <td>
            <%= stats.getGetCount()%>
        </td>
        <td>
            <%= stats.getGetCount() / onlineTime%>
        </td>
    </tr>
    <tr>
        <td>
            Add
        </td>
        <td>
            <%= stats.getAddCount()%>
        </td>
        <td>
            <%= stats.getAddCount() / onlineTime%>
        </td>
    </tr>
</table>

<form action="zeroStats" method="post">
    <input type="submit" name="btn1" value="Zero request count" />
</form>

Online time =  <%= onlineTime%>

</body>
</html>