<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>Login</title>
</head>
<body>
	<div class="body">
		<g:form name="formLogin" url="[action:'login',controller:'usuario']">
			<div style="margin-left : 20px;margin-top:20px;">
				Login:<input type="text" name="login" />
				</br>
				</br>
					senha:<input type="password" name="senha" />
				</br>
				</br>
				<input type="submit" value="Entrar" />
			</div>
		</g:form>
	</div>
</body>
</html>