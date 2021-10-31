var activeTab = document.getElementsByClassName("active");
activeTab.item(0).classList.remove("active");
activeTab.item(0).removeAttribute("aria-current");

var newActiveTab = document.getElementById("menuBrand");
newActiveTab.classList.add("active");
newActiveTab.setAttribute("aria-current", "page");