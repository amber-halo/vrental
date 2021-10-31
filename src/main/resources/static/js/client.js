/* 

Using the RandomUser Generator API (open-source).
https://randomuser.me/

*/

$("#btnSave").click(function(e) {
	$firstname = $("#firstname").val();
	$lastname = $("#lastname").val();
	$phone = $("#phone").val();
	
	if ($firstname != "" && $lastname != "" && $phone != "") {
		$.ajax({
			url: 'https://randomuser.me/api/?inc=login',
			dataType: 'json',
			success: function(data) {
				// console.log(data);
				
				let $username = data.results[0].login.username;

				$.ajax({
					url: "/clients/save",
					type: "POST",
					data: JSON.stringify({ firstname: $firstname, lastname: $lastname, username: $username, phone: $phone }),
					processData: false,
					contentType: "application/json",
					success: function() {
						$("#exampleModal").modal("toggle");
						$(".toast").toast("show");
					}
				});
				
			},
			error: function(error) {
				console.log(error);
			}
		});

	} else {
		alert("Pelase, fill the fields.");
	}
});

$("#btnTest").click(function (e) {
	$(".toast").toast("show");
});