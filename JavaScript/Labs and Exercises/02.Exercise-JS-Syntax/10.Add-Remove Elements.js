function addRemove(arr) {
    let array = [];
    for (let i = 0; i < arr.length; i++) {

        let input = arr[i];
        let split = input.split(" ");
        let command = split[0];
        let element = split[1];

        if (command === "add") {
            array.push(element)
        }
        else if (command === "remove") {
            if (element < array.length && element >= 0) {
                array.splice(element, 1)
            }
        }
    }
    for (let i = 0; i < array.length; i++) {
        console.log(array[i]);
    }
}

addRemove(["add 3", "add 5", "remove 1", "add 2"])