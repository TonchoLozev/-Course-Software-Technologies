function match(arr) {

    let text = arr.join(",")
    let spliting = text.split(/\W+/);
    let nonEmpty = spliting.filter(w => w.length > 0);
    let isUpper = nonEmpty.filter(isUpperCase);
    console.log(isUpper.join(", "))

    function isUpperCase(str) {
        return str === str.toUpperCase();
    }
}

match(['We start by HTML, CSS, JavaScript, JSON and REST.\n' +
'Later we touch some PHP, MySQL and SQL.\n' +
'Later we play with C#, EF, SQL Server and ASP.NET MVC.\n' +
'Finally, we touch some Java, Hibernate and Spring.MVC.'])