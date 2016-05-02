<%@ page errorPage="../../ErrorPage.jsp" %>

<jsp:include page="../../AdminHeader.jsp" />

<jsp:useBean id="manageplugindockerlutece" scope="session" class="fr.paris.lutece.plugins.dockerlutece.web.ManagePluginDockerluteceJspBean" />

<% manageplugindockerlutece.init( request, manageplugindockerlutece.RIGHT_MANAGEPLUGINDOCKERLUTECE ); %>
<%= manageplugindockerlutece.getManagePluginDockerluteceHome ( request ) %>

<%@ include file="../../AdminFooter.jsp" %>
