<!DOCTYPE html>
<html th:replace="~{fragments/main :: layout(~{::title}, ~{::#content}, ~{::link}, ~{::script})}">
<head>
<meta charset="ISO-8859-1">
<title>Vehicles</title>
<link href="/css/fontawesome-all.css" rel="stylesheet">
<link href="/css/bootstrap-table.min.css" rel="stylesheet">
</head>
<body>
	<div id="content">
		<div class="d-flex justify-content-between mt-3">
			<h1 class="mb-4">Vehicles</h1>
		
			<div>
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
					Add vehicle
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
					<th data-sortable="true">Vehicle ID</th>
					<th data-sortable="true">Model Name</th>
					<th data-sortable="true">Brand Name</th>
					<th data-sortable="true">Type</th>
					<th data-sortable="true">Plate number</th>
					<th data-sortable="true">Color</th>
					<th data-sortable="true">Status</th>
				</tr>
			</thead>
			<tbody>
				<tr th:each="vehicle : ${ vehicleList }">
					<td th:text="${ vehicle.vehicleId }"></td>
					<td th:text="${ vehicle.model.name }"></td>
					<td th:text="${ vehicle.model.brand.name }"></td>
					<td th:text="${ vehicle.type }"></td>
					<td th:text="${ vehicle.platenumber }"></td>
					<td th:text="${ vehicle.color }"></td>
					<td th:text="${ vehicle.status }"></td>
				</tr>
			</tbody>
		</table>
		
		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Add vehicle</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<form action="#" th:action="@{/vehicles/save}" th:object="${vehicle}" method="post">
						<div class="modal-body">
							<div class="mb-3">
								<label for="color">Color</label>
								<input type="text" class="form-control" th:field="*{color}" id="color" maxlength="45" required="true">
							</div>
							
							<div class="mb-3">
								<label for="status">Status</label>
								<select class="form-control" th:field="*{status}" id="status" required="true">
									<option value="1">Available</option>
									<option value="0">Not Available</option>
								</select>
<!-- 								<input type="number" class="form-control" th:field="*{status}" id="status" max="5" required="true"> -->
							</div>
							
							<div class="mb-3">
								<label for="platenumber">Plate number</label>
								<input type="text" class="form-control" th:field="*{platenumber}" id="platenumber" maxlength="45" required="true">
							</div>
							
							<div class="mb-3">
								<label for="type">Type</label>
								<select class="form-control" th:field="*{type}" id="type" required="true">
									<option value="1">Sedan</option>
									<option value="2">SUV</option>
									<option value="3">Motorcycle</option>
									<option value="4">Bicycle</option>
								</select>
<!-- 								<input type="number" class="form-control" th:field="*{type}" id="type" max="5" required="true"> -->
							</div>
							
							<div class="mb-3">
								<label for="modelId">Model ID</label>
								<select class="form-control" th:field="*{model}" id="modelId" required="true">
									<option th:each="model : ${ modelList }" th:value="${ model.modelId }" th:text="${ model.name }"></option>
								</select>
<!-- 								<input type="number" class="form-control" th:field="*{model}" id="modelId" required="true"> -->
							</div>
						
						</div>
						
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary" id="btnSave">
								Save changes
							</button>
						</div>
						
<!-- 						<button class="btn btn-primary" type="submit">Save</button> -->
					</form>
				</div>
			</div>
		</div>
		
		<!-- Flexbox container for aligning the toasts -->
		<div class="toast-container" aria-live="polite">
			<div class="toast d-flex align-items-center" role="alert" aria-live="assertive" aria-atomic="true" data-delay="8000" data-animation="true">
				<div class="toast-header px-4 py-3" style="font-size: 18px">
					<div class="text-success pr-5">
						Vehicle created successfully.
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
	
		var newActiveTab = document.getElementById("menuVehicles");
		newActiveTab.classList.add("active");
		newActiveTab.setAttribute("aria-current", "page");
	</script>
	<script src="/js/jquery.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/bootstrap-table.min.js"></script>
	<script src="/js/vehicle.js" type="text/javascript"></script>
</body>
</html>