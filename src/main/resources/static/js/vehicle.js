$("#btnSave").click(function(e) {
	$color = $("#color").val();
	$status = $("#status").val();
	$platenumber = $("#platenumber").val();
	$type = $("#type").val();
	$modelId = $("#modelId").val();

	
	if ($color != "" && $platenumber != "") {
		$.ajax({
			url: "/vehicles/save",
			type: "POST",
			data: JSON.stringify({ color: $color, status: $status, platenumber: $platenumber, type: $type, model: { modelId: $modelId } }),
			processData: false,
			contentType: "application/json",
			success: function() {
				$("#exampleModal").modal("toggle");
				$(".toast").toast("show");
			},
			error: function(error) {
				alert("Error saving model.");
				console.log(error);
			}
		});
		// console.log("hola");
	} else {
		alert("Pelase, fill the fields.");
	}
});

$("#btnTest").click(function (e) {
	$(".toast").toast("show");
});