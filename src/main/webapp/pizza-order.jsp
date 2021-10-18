<%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/15/21
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Order A Pizza!</title>
</head>
<body>
<form action="/pizza-order" method="post">

	<label for="size">Choose a size:</label>
	<select name="size" id="size">
		<option value="small">Small</option>
		<option value="medium">Medium</option>
		<option value="large">Large</option>
		<option value="x-large">Extra Large</option>
	</select><br>

  <label for="crust">Choose a crust:</label>
  <select name="crust" id="crust">
	<option value="thin">Thin</option>
	<option value="brick-oven">Brick Oven</option>
	<option value="pan">Pan Crust</option>
	<option value="deep-dish">Deep Dish</option>
  </select><br>

  <label for="sauce">Choose a sauce:</label>
  <select name="sauce" id="sauce">
	<option value="tomato">Tomato</option>
	<option value="marinara">Marinara</option>
	<option value="alfredo">Alfredo</option>
  </select><br>

  <p>Choose your toppings:</p><br>
  <input type="checkbox" id="chicken" name="toppings" value="chicken">
  <label for="chicken"> Chicken</label><br>
  <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
  <label for="pepperoni"> Pepperoni</label><br>
  <input type="checkbox" id="sausage" name="toppings" value="sausage">
  <label for="sausage"> Sausage</label><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>
