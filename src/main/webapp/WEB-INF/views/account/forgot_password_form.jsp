<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<base href="${pageContext.servletContext.contextPath}">
<title>Quên mật khẩu</title>
</head>
<body>
	<div class="container text-center">
		<h2>Quên mật khẩu</h2>
	</div>
	<form action="${pageContext.request.contextPath}/forgot_password" method="POST"
		style="max-width: 350px; margin: 0 auto;">
		<div class="border border-sencondary rounded p-3">
			<div>
				<p>Chúng tôi sẽ gửi đường dẫn đặt lại mật khẩu đến mail của bạn.</p>
			</div>

			<p>
				<input type="email" name="email" class="form-control" placeholder="Enter your e-mail"
					required autofocus />
			</p>
			<p class="text-center">
				<input type="submit" value="Send" class="btn btn-primary"/>
			</p>
		</div>
	</form>
</body>
</html>