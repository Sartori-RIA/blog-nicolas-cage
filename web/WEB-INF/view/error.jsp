<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Error!!">
	<jsp:body>
		<h2>Ooops!! Alguma coisa muito errada aconteceu!</h2>
		<p>Pedimos desculpas! A culpa não é sua, é nossa! A falha é nossa e em breve iremos corrigi-la!</p>
		<p>
			<strong>Mensagem de Erro: </strong>
			${errorBean.message} 
		</p>
		<div class="row">
			<div class="col s12 center">
				<img class="img-responsive" src="resources/img/erro.png" height="500px" alt="nicolas cage">
			</div>
		</div>
	</jsp:body>
</t:template>