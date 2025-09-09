function reverse(arr){
    var result = [];
    for ( var i = arr.length - 1 ; i >= 0  ; i--){
        result.push(arr[i])
    }
}

var test = reverse(["a", "b", "c", "d", "e"]);
