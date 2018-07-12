<html>
<body>
<h2>This is create form!</h2>
<form:form modelAttribute="accountCreateForm">
	<span>名前</span><input type="text" name="name" /><br>
	<span>TEL</span><input type="text" name="tel" /><br>
	<span>誕生日</span><input name="dateOfBirth" type="date" /><br>
	<span>E-Mail</span><input name="email" type="email" /><br><br>
	<form:button name="return">戻る</form:button>
	<form:button name="confirm">確認</form:button>
</form:form>
</body>
</html>
