<%--
  Created by IntelliJ IDEA.
  User: sartori
  Date: 09/04/17
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Blog do Nicolas">
    <jsp:body>
        <div class="card">
            <div class="container">
                <h3 class="card-title">Santo Nicolas está em toda a parte, não há como nega-lo apenas adora-lo</h3>
                <form id="formValidate" class="card-content" action="blog" method="POST">
                    <div class="row">
                        <div class="input-field col s12">
                            <input class="validate" id="title" data-length="45" type="text" name="title" placeholder="Titulo da adoração"/>
                            <label for="title" data-success="Agora sim" class="active"></label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="content" name="content" data-length="240" class="materialize-textarea validate" placeholder="Conteúdo da adoração"></textarea>
                            <label for="content" data-success="Agora sim" class="active"></label>
                        </div>
                    </div>
                    <p>
                        <button type="submit" class="waves-effect waves-light btn green darken-3">Publicar</button>
                    </p>
                </form>
            </div>
        </div>
    </jsp:body>
</t:template>
