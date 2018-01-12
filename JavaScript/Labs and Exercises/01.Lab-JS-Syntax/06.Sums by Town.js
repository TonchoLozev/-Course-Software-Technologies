function calcSumByTowns(arr) {
    let objects = arr.map(JSON.parse);
    let sum = {};
    for (let obj of objects) {
        if (obj.town in sum) {
            sum[obj.town] += obj.income;
        }
        else {
            sum[obj.town] = obj.income;
        }
    }
    let towns = Object.keys(sum).sort();
    for(let town of towns){
        console.log(`${town} -> ${sum[town]}`)
    }
}

calcSumByTowns([
    '{"town":"Sofia","income":200}',
    '{"town":"Varna","income":120}',
    '{"town":"Pleven","income":60}',
    '{"town":"Varna","income":70}'
]);