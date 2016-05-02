<jsp:useBean id="manageplugindockerlutecePluginLutece" scope="session" class="fr.paris.lutece.plugins.dockerlutece.web.PluginLuteceJspBean" />
<% String strContent = manageplugindockerlutecePluginLutece.processController ( request , response ); %>

<%@ page errorPage="../../ErrorPage.jsp" %>
<jsp:include page="../../AdminHeader.jsp" />

<%= strContent %>

<%@ include file="../../AdminFooter.jsp" %>
