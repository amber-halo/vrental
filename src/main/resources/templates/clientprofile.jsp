<!DOCTYPE html>
<html th:replace="~{fragments/main :: layout(~{::title}, ~{::#content}, ~{::link}, ~{::script})}">
<head>
<meta charset="ISO-8859-1">
<title>Clients</title>
<link href="/css/fontawesome-all.css" rel="stylesheet">
<link href="/css/bootstrap-table.min.css" rel="stylesheet">
</head>
<body>
	<div id="content">
	
		<div class="d-flex justify-content-between mt-3">
			<h1 class="mb-4">Clients</h1>
		
			<div>
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
					Add client
				</button>
			</div>
			
<!-- 			<button id="btnTest">Open</button> -->
		</div>
		
		<div id="toolbar">
			
		</div>

		<table 
			data-toggle="table"
			data-toolbar="#toolbar"
			data-search="true"
			data-search-highlight="true"
			data-pagination="true"
			data-page-list="[5, 10, 25, 50, 100, all]"
		>
			<thead>
				<tr>
					<th data-sortable="true">Client ID</th>
					<th data-sortable="true">First Name</th>
					<th data-sortable="true">Last Name</th>
					<th data-sortable="true">User Name</th>
					<th data-sortable="true">Phone</th>
				</tr>
			</thead>
			<tbody>
				<tr th:each="client : ${ clientList }">
					<td th:text="${ client.clientId }"></td>
					<td th:text="${ client.firstname }"></td>
					<td th:text="${ client.lastname }"></td>
					<td th:text="${ client.username }"></td>
					<td th:text="${ client.phone }"></td>
				</tr>
			</tbody>
		</table>
		
		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Add client</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<form action="#" th:action="@{/clients/save}" th:object="${client}" method="post">
						<div class="modal-body">
							<div class="mb-3">
								<label for="firstname">First name</label>
								<input type="text" class="form-control" th:field="*{firstname}" id="firstname" maxlength="45" required="true">
								<p class="alert alert-danger" th:if="${#fields.hasErrors('firstname')}" th:errors="*{firstname}"></p>
							</div>
					
							<div class="mb-3">
								<label for="lastname">Last name</label>
								<input type="text" class="form-control" th:field="*{lastname}" id="lastname" maxlength="45" required="true">
							</div>
					
							<div class="mb-3">
								<label for="phone">Phone</label>
								<input type="text" class="form-control" th:field="*{phone}" id="phone" maxlength="11" required="true">
							</div>
							
<!-- 							<button class="btn btn-primary" type="submit">Guardar</button> -->
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary" id="btnSave">
								Save changes
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		
		<!-- Flexbox container for aligning the toasts -->
		<div class="toast-container" aria-live="polite">
			<div class="toast d-flex align-items-center" role="alert" aria-live="assertive" aria-atomic="true" data-delay="8000" data-animation="true">
				<div class="toast-header px-4 py-3" style="font-size: 18px">
					<div class="text-success pr-5">
						Client created successfully.
					</div>
<!-- 					<small>Just now</small> -->
					<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				
			</div>
		</div>
	
	</div>
	
	<script type="text/javascript">
		var activeTab = document.getElementsByClassName("active");
		activeTab.item(0).removeAttribute("aria-current");
		activeTab.item(0).classList.remove("active");

		var newActiveTab = document.getElementById("menuClients");
		newActiveTab.classList.add("active");
		newActiveTab.setAttribute("aria-current", "page");
	</script>
	<script src="/js/jquery.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/bootstrap-table.min.js"></script>
	<script src="/js/client.js" type="text/javascript"></script>
</body>
</html>