
document.querySelector("nav-bar").style.display = "flex";
document.getElementById("home").style.display = "block";
document.getElementById("about").style.display = "none";
document.getElementById("gallery").style.display = "none";
document.getElementById("contact").style.display = "none";



document.getElementById("home").addEventListener("click", function () {
  document.getElementById("home").style.display = "block";
  document.getElementById("about").style.display = "none";
  document.getElementById("gallery").style.display = "none";
  document.getElementById("contact").style.display = "none";
});


document.getElementById("about").addEventListener("click", function () {
  document.getElementById("home").style.display = "none";
  document.getElementById("about").style.display = "block";
  document.getElementById("gallery").style.display = "none";
  document.getElementById("contact").style.display = "none";
});


document.getElementById("gallery").addEventListener("click", function () {
  document.getElementById("home").style.display = "none";
  document.getElementById("about").style.display = "none";
  document.getElementById("gallery").style.display = "block";
  document.getElementById("contact").style.display = "none";
});


document.getElementById("contact").addEventListener("click", function () {
  document.getElementById("home").style.display = "none";
  document.getElementById("about").style.display = "none";
  document.getElementById("gallery").style.display = "none";
  document.getElementById("contact").style.display = "block";
});