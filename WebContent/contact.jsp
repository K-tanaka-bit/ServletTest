<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問合せ</title>
</head>
<body>
<h1>お問合せ</h1>
	<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
	%>
	<%=(String) request.getAttribute("message")%>
	<%
		}
	%>
<form action="contact-1" method="post">
*氏名：<input type="text" name="name"><hr>
会社：<input type="text" name="company"><hr>
*メールアドレス：<input type="text" name="mail"><hr>
*お問合せ内容：<textarea cols="40" rows="5" name="contents"></textarea><hr>
メルマガ種類：<input type="checkbox" name="magazine" value="総合案内">総合案内
<input type="checkbox" name="magazine" value="セミナー案内">セミナー案内
<input type="checkbox" name="magazine" value="求人採用案内">求人採用案内<hr>
資料請求希望：<input type="radio" name="document" value="yes">Yes
			<input type="radio" name="document" value="no">No<hr>
<input type ="submit" value="送信">
</form>

</body>
</html>