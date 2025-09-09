function cutoOff(arr,num){
    var sum = [];
    for (var i = 0 ; i < arr.length; i ++)
    {
        if (arr[i] > num){
            sum[i] = arr[i] ;
        }
    }

}
var big = 5;
var result =[6, 8, 3, 10, -2, 5, 9];
cutoOff(result,big)