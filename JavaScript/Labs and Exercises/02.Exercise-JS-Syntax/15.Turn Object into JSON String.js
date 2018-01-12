function storingObjects(arr) {
    let obj = {};
    for (let i = 0; i < arr.length; i++) {
        let element = arr[i];
        let splitElement = element.split(" -> ");
        let key = splitElement[0];
        let value = splitElement[1];
        if(!Number.isNaN((Number(value)))){
            value = Number(value);
        }
        obj[key] = value;
    }
    let str = JSON.stringify(obj);
    console.log(str);
}

storingObjects(["name -> Angel", "surname -> Georgiev", "age -> 20", "grade -> 6.00", "date -> 23/05/1995", "town -> Sofia"]);