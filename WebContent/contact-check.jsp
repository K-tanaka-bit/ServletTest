<%@page import="model.ContactBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問合せ確認</title>
</head>
<body>
<%ContactBean c = (ContactBean) session.getAttribute("c"); %>


<h1>お問合せ確認</h1>
氏名:<%=c.getName() %><hr>
会社:<%=c.getCampany() %><hr>
メールアドレス:<%=c.getMail() %><hr>
お問い合わせ内容:<%=c.getContents() %><hr>
メルマガ種類:<%=c.getMagazine() %><hr>
資料請求希望:<%=c.getDocument() %><hr>
<%if(c.getDocument().equals("yes")){ %>
この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。
<a href="">こちらからダウンロード</a>
<%}else{ %>

<%} %>
</body>
</html>