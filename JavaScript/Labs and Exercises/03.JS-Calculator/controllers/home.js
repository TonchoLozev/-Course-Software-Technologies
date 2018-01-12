const Calculator = require('../models/Calculator');
module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
        let calcBody = req.body;
        let calcParams = calcBody['calculator'];

        let calculator = new Calculator();
        calculator.leftOperand = Number(calcParams.leftOperand);
        calculator.operator = calcParams.operator;
        calculator.rightOperand = Number(calcParams.rightOperand);

        let result = calculator.calcResult();

        res.render('home/index', {'calculator': calculator, 'result': result})
    },
};