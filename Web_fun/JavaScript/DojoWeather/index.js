function printLoding() {
    alert("loading weather Report ")
}

function rmDiv() {
    var div = document.querySelector(".footer");
    div.remove();
}

function changeTo(element) {
    console.log(element.innerText)
    console.log(element.value)

    const array = document.querySelectorAll(".converter")
    if (element.value == "C") {
        for (var i = 0; i < array.length; i++) {
            var end_val = parseInt(array[i].textContent);
            var last = (end_val - 32) * 5 / 9;
            array[i].textContent = Math.round(last) + "℃"
        }


    }
    else {
        const array = document.querySelectorAll(".converter");
        for (var i = 0; i < array.length; i++) {
            var end_val = parseInt(array[i].textContent);
            var last = (end_val * 9 / 5) + 32;
            array[i].textContent = Math.round(last) + "F"
        }
    }
}

