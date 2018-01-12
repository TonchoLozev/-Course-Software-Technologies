function line(arr) {
    let loops = Number(arr.length);
    for (let i = 0; i < loops; i++) {
        if(arr[i]=="Stop"){
            break;
        }
        else{
            console.log(arr[i]);
        }
    }
}

line(["line 1", "line 2", "line 3", "line 4"]);