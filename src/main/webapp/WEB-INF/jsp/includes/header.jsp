<%@ page
   language="java"
   contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib
   prefix="b"
   uri="http://bootstrapjsp.org/"%>
<%@ taglib
   prefix="c"
   uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib
   prefix="f"
   uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib
   prefix="shiro"
   uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html>
<html
   lang="pt-BR"
   ng-app="WebApp">
<head>
<!-- meta -->
<meta charset="UTF-8">
<meta
   name="viewport"
   content="width=device-width, initial-scale=1" />
<meta
   http-equiv="X-UA-Compatible"
   content="IE=edge">
<meta
   name="description"
   content="">
<meta
   name="author"
   content="Thiago Monteiro">
<!-- /meta -->
<!-- css -->
<link
   href="https://fonts.googleapis.com/css?family=Archivo+Black"
   rel="stylesheet" />
<link
   type="text/css"
   rel="stylesheet"
   href="/marmitas/webjars/jquery-ui/1.12.1/jquery-ui.min.css"
   media="screen" />
<link
   type="text/css"
   rel="stylesheet"
   href="/marmitas/webjars/bootstrap/3.3.5/dist/css/bootstrap.min.css" />
<link
   type="text/css"
   rel="stylesheet"
   href="/marmitas/webjars/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
   type="text/css"
   href="/marmitas/webjars/ionicons/2.0.1/css/ionicons.min.css"
   rel="stylesheet"
   media="screen" />
<link
   type="text/css"
   href="/marmitas/static/css/webapp.css"
   rel="stylesheet"
   media="screen" />
<!-- /css -->
<!-- js -->
<script src="/marmitas/webjars/jquery/3.2.1/dist/jquery.min.js"></script>
<script src="/marmitas/webjars/jquery-ui/1.12.1/jquery-ui.min.js"></script>
<script src="/marmitas/webjars/angularjs/1.5.7/angular.min.js"></script>
<script src="/marmitas/webjars/angular-i18n/1.5.7/angular-locale_pt-br.js"></script>
<script src="/marmitas/webjars/angular-messages/1.5.7/angular-messages.min.js"></script>
<script src="/marmitas/webjars/github-com-candreoliveira-ngMask/3.0.16/dist/ngMask.min.js"></script>
<script src="https://cdn.rawgit.com/alertifyjs/alertify.js/v1.0.10/dist/js/ngAlertify.js"></script>
<script src="/marmitas/webjars/bootstrap/3.3.5/dist/js/bootstrap.min.js"></script>
<script src="/marmitas/bootstrapjsp/bootstrap.jsp.min.js"></script>
<script src="/marmitas/static/js/webapp.js"></script>
<script src="/marmitas/static/js/paginacao.js"></script>
<script src="/marmitas/static/js/angular/apps/apps.js"></script>
<script src="/marmitas/static/js/angular/services/services.js"></script>
<!-- /js -->
<!-- favicon -->
<link
   rel="icon shortcut"
   type="image/ico"
   href="/marmitas/static/imagens/favicon.ico" />
<!-- /favicon -->
<title>marmitas</title>
</head>
<body>
   <!-- navbar -->
   <nav
      class="navbar navbar-inverse navbar-fixed-top"
      role="navigation">
      <div class="container-fluid">
         <div class="navbar-header">
            <a
               class="navbar-brand cabecalho"
               href="/marmitas/">marmitas</a>
            <a
               href="http://www.goias.gov.br/"
               target="_blank"> <img
               id="goias"
               src="/marmitas/static/imagens/goias.png" />
            </a>
         </div>
         <shiro:authenticated>
            <form class="navbar-form navbar-right">
               <b:formgroup>
                  <div class="dropdown">
                     <button
                        class="btn btn-default dropdown-toggle"
                        type="button"
                        data-toggle="dropdown">
                        <i class="fa fa-user"></i>&nbsp;
                        <shiro:principal />
                        <span class="caret"></span>&nbsp;
                     </button>
                     <ul class="dropdown-menu">
                        <li style="text-align: right"><a
                           href="/marmitas/logout"
                           style="color: black;"> <i class="fa fa-sign-out"></i>&nbsp;Sair
                        </a></li>
                     </ul>
                  </div>
               </b:formgroup>
            </form>
         </shiro:authenticated>
      </div>
   </nav>
   <!-- /navbar -->