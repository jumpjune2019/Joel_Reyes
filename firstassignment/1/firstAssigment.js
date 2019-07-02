console.log("Hello! your JS is loading just fine!!"); 
//variables
var userName =document.getElementById("userName");
	

//function calls
userName.innerHTML = "User: "+ onLoadPage();



//functions
function onLoadPage(){

  var person = prompt("Please enter your Name:", "Mister I don't Know my Name");
  
  return person;
}

function displayForm(){
	
	alert( document.getElementById("userName").innerHTML 
			+"\n Date of birth: " + document.forms[0].elements[0].value 
			+"\n City:  "+ document.forms[0].elements[1].value //https://www.youtube.com/watch?v=8yiZ6tKHX0A 
			+"\n State: "+  document.forms[0].elements[2].value
			+"\n Zip: "+ document.forms[0].elements[3].value
			+"\n Hobby: "+ document.forms[0].elements[4].value
			);
	
	//******************************************************************************
	var birthday= document.forms[0].elements[0].value;	
	var splittedDate = splitDate(birthday);
	var day = splittedDate[1];
	var month = splittedDate[2];
	console.log(typeof day);
	
	alert("Zodiac: " + getZodiacSign(day, month));

	}


function getZodiacSign(day, month){
	var sign = "";
	if((month == 1) && (day <= 20) || (month == 12) && (day >=22)) {
			sign = "capricorn";
	     return sign;
	  } else if ((month == 1) && (day >= 21) || (month == 2) && (day <= 18)) {
		  sign = "aquarius";
		  return sign;
	  } else if((month == 2) && (day >= 19) || (month == 3) && (day <= 20)) {
		  sign = "pisces";
		  return sign;
	  } else if((month == 3) && (day >= 21) || (month == 4) && (day <= 20)) {
		  sign = "aries";
		  return sign;
	  } else if((month == 4) && (day >= 21) || (month == 5) && (day <= 20)) {
		  sign = "taurus";
		  return sign;
	  } else if((month == 5) && (day >= 21) || (month == 6) && (day <= 20)) {
		  return sign;
	    
	  } else if((month == 6) && (day >= 21) || (month == 7) &&( day <= 22)) {
		  sign = "cancer";
		  return sign;
	  } else if((month == 7 )&&( day >= 23) || (month == 8) && (day <= 23)) {
		  sign = "leo";
		  return sign;
	  } else if((month == 8) &&( day >= 24) || (month == 9) &&( day <= 23)) {
		  sign = "virgo";
		  return sign;
	  } else if((month == 9 )&& (day >= 24) || (month == 10) &&( day <= 23)) {
		  sign = "libra";
		  return sign;
	  } else if((month == 10) && (day >= 24) || (month == 11 )&&( day <= 22)) {
		  sign = "scorpio";
		  return sign;
	  } else if((month == 11 )&& (day >= 23) || (month == 12) &&( day <= 21)) {
		  sign = "sagittarius";
	    return sign;
	  }
}

function splitDate(birthday){
	var result = birthday.split('-');
	return result;
}

