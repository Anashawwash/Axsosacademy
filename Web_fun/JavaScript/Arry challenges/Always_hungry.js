
function hungry(arry){

    for (var i = 0 ; i < arry.length ; i ++){
        if ( arry[i] == "food" ){
            for( var j = 0 ; j < arry.length ; j ++){
                if (arry[j] == "food"){
                    console.log("yummy");
                }
            }
            return 0 ;
        }
    }   
    console.log("I'm hungry")


}
var test1 = [4, 1, 5, 7, 2] ;
var test2 = [3.14, "food", "pie", true, "food"];
hungry(test2);