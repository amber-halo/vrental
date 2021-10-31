<!DOCTYPE html>
<html th:fragment="layout (title, content, styles, scripts)">
<head>
<meta charset="ISO-8859-1">
<title th:replace="${ title }">Test Title</title>
<link href="/css/bootstrap4.min.css" rel="stylesheet">
<link th:replace="${ styles }">
<style type="text/css">

	.toast-container {
		position: fixed;
		left: 20px;
		bottom: 20px;
	}

	.toast:not(.showing):not(.show) {
		display: none !important;
	}

</style>
</head>
<body>
	<div class="container">
		<header th:replace="~{fragments/menu :: menu}"></header>
		
		<div th:replace="${ content }"></div>
	</div>
	
	<script th:replace="${ scripts }"></script>
</body>
</html>