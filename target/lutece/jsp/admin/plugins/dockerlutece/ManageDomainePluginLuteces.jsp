<jsp:useBean id="managedomainedockerluteceDomainePluginLutece" scope="session" class="fr.paris.lutece.plugins.dockerlutece.web.DomainePluginLuteceJspBean" />
<% String strContent = managedomainedockerluteceDomainePluginLutece.processController ( request , response ); %>

<%@ page errorPage="../../ErrorPage.jsp" %>
<jsp:include page="../../AdminHeader.jsp" />

<%= strContent %>

<%@ include file="../../AdminFooter.jsp" %>
