

//Template literal samples:
// The old way
var myMultiString = 'Some text that I want\nOn two lines!';
console.log(myMultiString);
// Using Template
var myMultiString2= `This will be
on two lines!`;
console.log(myMultiString2);

//using template literals to return content dynamicaly . 
let person = {
  firstName: `Ryan`,
  lastName: `Christiani`,
  sayName() {
      return `Hiiiiiii
       My name is ${this.firstName} ${this.lastName}`;
  }
};

console.log(person.sayName());

/**************************************************************** */
//creating a symbol demostrating is always unique 

let symbol1 = Symbol("symbol1");
let symbol2 = Symbol("symbol2");
// the outcome will be false even if both symbols are described with the same name. 
console.log(symbol1 === symbol2);

/***************************************************************** */
//using dectructuring to Reassign array elements to q r and rest.
const [q,r,...f]=[1,2,3,4,5];
//q and r
console.log(q,r);
//rest
console.log(f);
//****************************************************************** */