function fibonacci(n){
    var numbers = [];
    numbers[0]= 0 ;
    numbers[1]= 1 ;
    console.log(numbers[0])
    console.log(numbers[1])
    for (var i = 2 ; i < n ; i++){
        numbers[i] = numbers[i-1] + numbers[i-2]
        console.log(numbers[i]);
    }
}


var times = 10 ;
fibonacci(times);