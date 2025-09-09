var likes = [9,12,9];
var names = ["Neil" ,"Nichole","Jim"];

function addLike(num){
document.getElementById(names[num]).innerText = likes[num] ++;
}