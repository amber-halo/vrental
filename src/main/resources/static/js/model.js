$("#btnSave").click(function(e) {
	$name = $("#name").val();
	$brandId = $("#brandId").val();

	if ($name != "") {
		$.ajax({
			url: "/models/save",
			type: "POST",
			data: JSON.stringify({ name: $name, brand: { brandId: $brandId } }),
			processData: false,
			contentType: "application/json",
			success: function() {
				$("#exampleModal").modal("toggle");
				$(".toast").toast("show");
			},
			error: function() {
				alert("Error saving model.");
			}
		});
	} else {
		alert("Pelase, fill the fields.");
	}
});

$("#btnTest").click(function (e) {
	$(".toast").toast("show");
});