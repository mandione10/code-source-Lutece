<%@ page errorPage="../../ErrorPage.jsp" %>

<jsp:include page="../../AdminHeader.jsp" />

<jsp:useBean id="managedomainedockerlutece" scope="session" class="fr.paris.lutece.plugins.dockerlutece.web.ManageDomaineDockerluteceJspBean" />

<% managedomainedockerlutece.init( request, managedomainedockerlutece.RIGHT_MANAGEDOMAINEDOCKERLUTECE ); %>
<%= managedomainedockerlutece.getManageDomaineDockerluteceHome ( request ) %>

<%@ include file="../../AdminFooter.jsp" %>
