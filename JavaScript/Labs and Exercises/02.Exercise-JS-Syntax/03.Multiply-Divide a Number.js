function multiplyDivide(arr) {
    let number1 = Number(arr[0]);
    let number2 = Number(arr[1]);
    let sum = 0;

    if (number1 <= number2) {
        sum = number1*number2;
    }
    else{
        sum = number1/number2;
    }
    console.log(sum);
}
multiplyDivide(["3", "2"])