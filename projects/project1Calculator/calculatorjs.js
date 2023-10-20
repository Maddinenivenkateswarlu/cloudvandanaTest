
let display = "";
const dataElement = document.getElementById("data");

function number(val) {
  display += val;
  dataElement.value += val;
}

function operation(val) {
  dataElement.value += val;
}

function calculate() {
  const p = dataElement.value;
  if (p !== null) {
    display = eval(p);
  }
  console.log(p);
  dataElement.value = display;
}

function clear() {
  dataElement.value = "";
  display = "";
}
