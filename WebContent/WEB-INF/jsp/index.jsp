
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="stripes"
	uri="http://stripes.sourceforge.net/stripes.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Palindrome generator</title>
<link href="styles.css" rel="stylesheet">
</head>
<body style="text-align: center">
	<h1>Palindrome generator</h1>
	</br>
	<stripes:form beanclass="pl.jg.action.PalindromActionBean">
		<h3>
			Please enter a word:
			</h1>
			<h3>
				<stripes:text name="word" />
			</h3>
			</br>
			<h3>${actionBean.message}</h3>
			<h2>${actionBean["palindromeWord"]}</h2>
	</stripes:form>
	<stripes:link beanclass="pl.jg.action.DateActionBean">
		Show today's day
	</stripes:link>
</body>
</html>