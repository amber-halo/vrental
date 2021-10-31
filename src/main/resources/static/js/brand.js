$("#btnSave").click(function(e) {
	$name = $("#name").val();
	
	if ($name != "") {
		$.ajax({
			url: "/brands/save",
			type: "POST",
			data: JSON.stringify({ name: $("#name").val() }),
			processData: false,
			contentType: "application/json",
			success: function() {
				$("#exampleModal").modal("toggle");
				$(".toast").toast("show");
			}
		});
	} else {
		alert("Pelase, fill the fields.");
	}
});

$("#btnTest").click(function (e) {
	$(".toast").toast("show");
});