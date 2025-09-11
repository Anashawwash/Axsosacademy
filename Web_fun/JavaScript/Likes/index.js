
function addLike(num){
    var likesAcc = document.getElementById(num).innerText
    likesAcc ++ ;
    document.getElementById(num).innerText = likesAcc;
}