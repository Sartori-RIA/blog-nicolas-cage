<%--
  Created by IntelliJ IDEA.
  User: sartori
  Date: 08/04/17
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>

<li><a href="/">Inicio</a></li>
<c:if test="${isLoggedIn}">
    <li><a href="logout">Logout</a></li>
    <li><a href="blog-form">Publique algo</a></li>
</c:if>

<c:if test="${isLoggedIn == null}">
    <li><a href="login.jsp">Login</a></li>
</c:if>
