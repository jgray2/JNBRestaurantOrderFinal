<%-- 
    Document   : index
    Created on : Feb 2, 2013, 5:05:13 PM
    Author     : Jenni Burgmeier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurant Order</title>
    </head>
    <body>
        <p>Select items ordered below:</p>
        <form id="form" name="form" method="POST" action="FwdControl.do">
            Entree:<br>
            <input type="checkbox" name="entree" value="Steak 19.95">12 oz. Tenderloin Steak<br>
            <input type="checkbox" name="entree" value="Chicken 12.95">Chicken Marsala<br>
            <input type="checkbox" name="entree" value="Lobster 24.95">Lobster Tail<br>
            <input type="checkbox" name="entree" value="Shrimp 18.95">Shrimp Scampi<br><br>
            Side:<br>
            <input type="checkbox" name="side" value="Salad 4.95">Caeser's Salad<br>
            <input type="checkbox" name="side" value="Soup 3.50">Chicken Noodle Soup<br><br>
            Drink:<br>
            <input type="checkbox" name="drink" value="Soda 1.95">Pepsi<br>
            <input type="checkbox" name="drink" value="Beer 3.50">Corona<br>
            <input type="checkbox" name="drink" value="Water 0">Water<br>
            <input id="submit" name="Submit" type="submit" value="submit">
        </form>
    </body>
</html>
