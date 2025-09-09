function avarage(arr){
    var sum = 0 ;
    var avg = 0 ;
    var better = 0 ;
    for (var i = 0 ; i < arr.length ; i ++){
        sum += arr[i]
    }
    avg = sum / arr.length;

    for ( var i = 0 ; i < arr.length ; i ++){
        if (arr[i] > avg){
            better += 1 ;
        }
    }
    console.log(better);
}


var result = avarage([6, 8, 3, 10, -2, 5, 9]);

