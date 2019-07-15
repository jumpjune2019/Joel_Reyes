Joel Reyes
Arrow function expression is a syntactically compact alternative to a regular function expression. Arrow functions make our code more concise, and simplify function scoping and the this keyword. They are a one line mini functions. By using arrow functions, we avoid having to type the function keyword, return keywork and curly brackets, since is implicit in arrow functions.

// regular function
function funcName(params) {
    return params + 2;
  }
 console.log(funcName(2));
 //Using Arrow function
 var funcNameWithArrow = (params) => params + 2
 console.log(funcNameWithArrow(2));

 //*************************************************** */
const smartPhones = [
    { name:'iphone', price:649 },
    { name:'Galaxy S6', price:576 },
    { name:'Galaxy Note 5', price:489 }
  ];

  //regurlar function 
var prices = smartPhones.map(function(smartPhone) {
    return smartPhone.price;
  });
  
  console.log(prices); // [649, 576, 489]

  //using arrow function
const pricesWithArrow = smartPhones.map(smartPhone => smartPhone.price);
console.log(prices); // [649, 576, 489]

Pros:
•	Shorter syntax
•	Avoid having to type the function keyword, return keywork and curly brackets.
•	No biding of this keyword. 
Cons:
•	Ill-suited for methods
•	They can not be used as constructors. 
•	They can be confusing. 

