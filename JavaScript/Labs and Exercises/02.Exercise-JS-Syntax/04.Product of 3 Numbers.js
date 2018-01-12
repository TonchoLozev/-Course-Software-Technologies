function productOfThree(arr) {
    let array = arr.slice().map(Number);
    let count = 0;
    for (let i = 0; i < 3; i++) {
        if (array[i] < 0) {
            count++;
        }
    }
    if (count % 2 === 0) {
        console.log("Positive");
    }
    else{
        console.log("Negative");
    }
}

productOfThree(["5", "4", "3"]);