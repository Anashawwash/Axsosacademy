console.log("page loaded...");


function changeUsername() {
    document.querySelector(".name").innerText = "I dont think you will see this";
}

function accept(className) {
    var delet = document.querySelector("." + className);
    delet.remove();
    var lessOne = document.querySelector(".badge").innerText;
    lessOne--;
    document.querySelector(".badge").innerText = lessOne ;

    var  addOne = document.querySelector(".sec-badge").innerText;
    addOne ++;
    document.querySelector(".sec-badge").innerText = addOne;
}


function removeCard(className){
    var delet = document.querySelector("." + className);
    delet.remove();
    var lessOne = document.querySelector(".badge").innerText;
    lessOne--;
    document.querySelector(".badge").innerText = lessOne ;
}