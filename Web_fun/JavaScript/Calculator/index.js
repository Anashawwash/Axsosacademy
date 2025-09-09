let tureCurent = 0;
let curent = "";
var first_val = 0;
let op = ""
function press(num) {
    curent += num;
    tureCurent += num;
    document.getElementById('display').innerText = curent;
}
function clr() {
    document.getElementById('display').innerText = "";
    curent = "";
}

function setOP(string) {
    if (string == "+") {
        first_val = parseInt(curent);
        op = "+"
        curent = "";
        document.getElementById('display').innerText = curent;
    }
    else if (string == "*") {
        first_val = parseInt(curent);
        op = "*"
        curent ="" ;
        document.getElementById('display').innerText = "*";
    }
    else {
        first_val = parseInt(curent);
        op = "/"
        curent = "";
        document.getElementById('display').innerText = "/";
    }

}

function calculate() {
    if ( op == "+") {
        var sec_val = parseInt(curent);
        var last_val = first_val + sec_val;
        document.getElementById('display').innerText = last_val;
    }
    else if (op == "*"){
        var sec_val = parseInt(curent);
        var last_val = first_val * sec_val;
        document.getElementById('display').innerText = last_val;
    }
    else {
        var sec_val = parseInt(curent);
        var last_val = first_val / sec_val;
        document.getElementById('display').innerText = last_val;
    }

}
