function changeColor1(element) {
    const change = element
    change.style.backgroundColor = "#c2c3c4";
}
function changeColor2(element) {
    const change = element
    change.style.backgroundColor = "#2b4bf9";
}

function changeDiv() {
    const nig = document.querySelector(".second_ChangeedSec");
    nig.style.zIndex = '-1';
    console.log("1");
    
}

function ChangeDiv2() {
    const Div = document.querySelector(".second_ChangeedSec");
    Div.style.zIndex = '3';
        console.log("2");
}
let x = 0;
function AddNewDiv(){
    const array = [".First", ".second",".third"];
    if (x >= 3){
        x = 0;
    }
    const c =  document.querySelector(array[x]);
    c.style.display = "block";
    console.log(x);
    x ++ ;
}

function changeheader() {
    const header = document.querySelector(".header");
    console.log(window.scrollY );
    
    if (window.scrollY > 520) {
        header.classList.add('scrolled');
    }
    if (window.scrollY < 520){
        header.classList.remove('scrolled');
    }
}
