function changto1(element) {
    element.style.color = "white";
}

function changto2(element) {
    element.style.color = "#f6501c";
}
let count = 0;
function backchange(x) {
    const array = ['/images/slide-01.jpg', '/images/slide-02.jpg', '/images/slide-03.jpg'];
    if (count >= array.length) {
        count = 0;
    }
    const y = document.querySelector(".fisrt_sec");
    y.style.backgroundImage = `url("${array[count]}")`;
    count++;
}

function changeheader() {
    const header = document.querySelector(".header");
    console.log(window.scrollY );
    
    if (window.scrollY > window.innerHeight) {
        header.classList.add('scrolled');
    }
    if (window.scrollY < window.innerHeight){
        header.classList.remove('scrolled');
    }
}