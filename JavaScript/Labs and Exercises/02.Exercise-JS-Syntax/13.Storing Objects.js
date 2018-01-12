function storingObjects(arr) {
    let array = [];
    for (let i = 0; i < arr.length; i++) {
        let student = arr[i];
        let split = student.split(" -> ");
        let obj = {name: split[0], age: split[1], grade: split[2]};
        array.push(obj);
    }
    for (let i = 0; i < array.length; i++) {
        console.log(`Name: ${array[i].name}`);
        console.log(`Age: ${array[i].age}`);
        console.log(`Grade: ${array[i].grade}`);
    }
}

storingObjects(["Pesho -> 13 -> 6.00", "Ivan -> 12 -> 5.57", "Toni -> 13 ->4.90"])