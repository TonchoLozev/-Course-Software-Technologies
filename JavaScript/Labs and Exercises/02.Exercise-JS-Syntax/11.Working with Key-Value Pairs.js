function workWitheyValue(arr) {
    let obj = [];
    let key = arr[arr.length - 1]
    for (let i = 0; i < arr.length - 1; i++) {
        let pair = arr[i];
        let split = pair.split(" ");
        let key = split[0];
        let value = split[1];
        if (!obj.hasOwnProperty(key)) {
            obj[key] = value;
        }
        else {
            obj[key] = value
        }
    }
    if(obj[key]!=undefined){
        console.log(obj[key])
    }
    else{
        console.log("None")
    }
}

workWitheyValue(["key value", "key eulav", "test tset", "key"])