<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Blog do Nicolas">
	<jsp:body>

        <h1>Ultima publicação</h1>
		<div class="row">				
		<div class="card col s12">
            <div class="card-content">                       
                <h4 class="center">${bean.title}</h4>
                <p>${bean.content}</p>

                <fmt:formatDate value="${bean.date}" var="formattedDate"
						type="date" pattern="dd/MM/yyyy" />             
                
                <span>${formattedDate }</span>
            </div>                               
        </div>
        </div>
        
        <h1>Publicações Anteriores</h1>

        <!-- aviso de vazio -->
        <c:if test="${empty beans}">
        <div class="row">
            <div class="col s12 center-align">
                <i class="fa fa-5x fa-frown-o"></i>
                <h5 class="utf-info">Não há publicações</h5>
            </div>
        </div>
        </c:if>
        <!-- aviso de vazio -->
        
        <!-- lista de resultados anteriores -->
        <c:if test="${not empty beans}">
        <div class="row">
        <c:forEach var="bean" items="${beans}" varStatus="status">       
        
	        <div >
		        <div class="card">
		        	<fmt:formatDate value="${bean.date}" var="formattedDate"
						type="date" pattern="dd/MM/yyyy" />

		            <div class="card-content">                       
		                <h4> ${bean.title}</h4>
		                <p>${bean.content}</p>
		                <span>${formattedDate }</span>
		            </div>                               
		        </div>        
	        </div>
                
        </c:forEach>        
        </div>
        </c:if>
        <!-- lista de resultados anteriores -->  
	</jsp:body>
</t:template>