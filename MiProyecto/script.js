var b = document.getElementById('b')
var eti = 0;
var holas = ["Eres", "lo", "mejor", "mi", "amor"];
b.onclick = function () {
  // body...
  if (eti < holas.length) {
    cambiar(holas[eti]);
    eti++;
  }else{
    eti = 0;
    cambiar(holas[eti]);
    eti++;
  }
}

function cambiar(msj) {
  // body...
  var p = document.getElementById('p')
  p.innerHTML = msj
}
