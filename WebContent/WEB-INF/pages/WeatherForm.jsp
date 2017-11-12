<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
#main{
	float: left;
    margin-left: 30%;
}
</style>
</head>

<body>
	<div id="main">
		<h2>Weather By City</h2>
		<spring:url var="action" value='/weather/retrieve/json' />
		<form:form method="POST" commandName="weather" action="${action}">
			<form:errors path="*" cssClass="errorblock" element="div" />
			<table>
				<tr>
					<td>City :</td>
					<td><form:input path="city" /></td>
					<td><form:errors path="city" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" /></td>
				</tr>
			</table>
		</form:form>
		<c:if test="${not empty weather.city}">
			<table border="5" width="50%" cellpadding="4" cellspacing="3">
				<tr>
					<th colspan="5" align="center"><br>
						<h3>Weather Stats by ZIP</h3>
					</th>
				</tr>
				<tr>
					<th>City</th>
					<th>Updated time</th>
					<th>Weather</th>										
					<th>Temperature(C)</th>
					<th>Wind</th>					
				</tr>
				<tr align="center">
					<td>${weather.city}</td>
					<td>${weather.observationTime}</td>					
					<td>${weather.weather}</td>					
					<td>${weather.currentTempC}</td>
					<td>${weather.windKPH}</td>														
				</tr>
			</table>
		</c:if>
	</div>
</body>
</html>
