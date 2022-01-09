<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Login</title>
</head>
<body>

<div id="content" style="margin: 0 auto; width: 100%;">
    <div class="text-center">
        <p class="h1" style="padding-top: 20px;">Login</p>
    </div>

    <g:if test="${flash.failure}">
        <div id="message" class="alert alert-danger" role="alert" style="margin: 0 auto;width: 350px; margin-top: 15px; margin-bottom: 15px;">
            ${flash.failure}
        </div>
    </g:if>

    <g:form controller="user" action="auth" method="POST" style="margin: 0 auto;width: 350px;">
        <div class="form-group">
            <label for="username">Username</label>
            <g:textField name="username" class="form-control" />
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <g:passwordField name="password" class="form-control" />
            <small id="emailHelp" class="form-text text-muted">A senha correta é "secret"</small>
        </div>

        <g:submitButton name="Enviar" class="btn btn-primary" />
    </g:form>
</div>

</body>
</html>
