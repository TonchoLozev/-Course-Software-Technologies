function setValues(arr) {
    let length = arr[0];
    let array = [];
    for (let i = 0; i < length - 1; i++) {
        array.push(array[i] = 0);
    }
    arr.splice(0, 1)
    for (let i = 0; i < arr.length; i++) {
        let manipulation = arr[i];
        let split = manipulation.split(" - ");
        let index = split[0];
        let value = split[1];
        array[index] = value;
    }
    for (let i = 0; i < array.length; i++) {
        console.log(array[i]);
    }
}

setValues(["5", "0 - 3", "3 - -1", "4 - 2"])