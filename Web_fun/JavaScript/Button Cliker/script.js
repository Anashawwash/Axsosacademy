function changeText(){
    var x = document.querySelector("#login-btn");
    if(x.innerText == "Login"){
        x.innerText = "Logout";
    }else{
        x.innerText = "Login";
    }
}

function doAlert(element){
    alert("ninja was clicked");
}

function deleteButton(element){
    element.style.display = "none"
}