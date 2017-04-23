<%--
  Created by IntelliJ IDEA.
  User: sartori
  Date: 08/04/17
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template title="Login">
    <jsp:body>
        <h1>Login</h1>

        <span>${message}</span>

        <form id="formValidate" action="login" method="POST">
            <div class="row">
                <div class="input-field col s12">
                    <input id="username" type="text" name="username" />
                    <label for="username" class="active">Usuário</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <input id="password" type="password" name="password" />
                    <label for="password" class="active">Senha</label>
                </div>
            </div>
            <p>
                <button type="submit" class="waves-effect waves-light btn green darken-3">Enviar</button>
            </p>
        </form>
    </jsp:body>
</t:template>