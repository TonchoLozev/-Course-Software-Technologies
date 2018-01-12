function storingObjects(arr) {
    let array = [];
    for (let i = 0; i < arr.length; i++) {
        let str = JSON.parse(arr[i]);
        array.push(str);
    }
    for (let i = 0; i < array.length; i++) {
        console.log(`Name: ${array[i].name}`);
        console.log(`Age: ${array[i].age}`);
        console.log(`Date: ${array[i].date}`);
    }
}

storingObjects([{"name":"Gosho","age":10,"date":"19/06/2005"},
    {"name":"Tosho","age":11,"date":"04/04/2005"}]);