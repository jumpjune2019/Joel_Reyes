window.addEventListener("load", init, false);
function init() {
	
	var xhr = new XMLHttpRequest();
	
	xhr.successCallBack = function() {

		function flexible() {
			console.log(this.name);
		}

		// I am an array, if I can be parsed correctly
		var arrayData = JSON.parse(xhr.responseText);

		var flexArrFuncs = [];
		var length = arrayData.data.length;
		var x;
		
		//document.getElementsByTagName("H1")[0].setAttribute("class", "democlass");
		//element.setAttribute("style", "background-color: red;");

		// assigning dynamically
		for(x = 0; x < length; x++) {
			flexArrFuncs.push(flexible.bind(arrayData.data[x]));
			
		}
		
//*************************************************************************************
var outerContainer = document.createElement("div");
	outerContainer.setAttribute("class","container");
	document.body.appendChild(outerContainer);
	
	
var controlBoardContainer = document.createElement("div");
	controlBoardContainer.setAttribute("class","controlBoardContainer");
	outerContainer.appendChild(controlBoardContainer);
	
var titleAndTimerCont = document.createElement("div");
	titleAndTimerCont.setAttribute("class", "titleAndTimerCont");
	controlBoardContainer.appendChild(titleAndTimerCont);
	
var titleCont = document.createElement("div");
	titleCont.setAttribute("class", "titleCont");
	titleAndTimerCont.appendChild(titleCont);
	
var title = document.createElement("p");
		title.setAttribute("class", "title");
		title.innerHTML = "Quiz Game 0.1";
		titleCont.appendChild(title);
		
var timeCont= document.createElement("div");
		timeCont.setAttribute("class", "timeCont");
		titleAndTimerCont.appendChild(timeCont);
		
var timer= document.createElement("p");
		timer.setAttribute("id","timer");
		timer.setAttribute("class", "timer");
		timer.innerHTML = "00 : 00 : 00 ";
		timeCont.appendChild(timer);

var scorePlayUndoCont = document.createElement("div");
		scorePlayUndoCont.setAttribute("class", "scorePlayUndoCont");
		controlBoardContainer.appendChild(scorePlayUndoCont);
	
var scoreCont= document.createElement("div");
		scoreCont.setAttribute("class", "scoreCont");
		scorePlayUndoCont.appendChild(scoreCont);
	
var score = document.createElement("div");
		score.setAttribute("class", "score");
		score.style.display="none";
		score.innerHTML = "Score Message Center";
		scoreCont.appendChild(score);
	
var playCont = document.createElement("div");
		playCont.setAttribute("class", "playCont");
		scorePlayUndoCont.appendChild(playCont);
	
var play = document.createElement("button");
		play.setAttribute("id", "play");
		play.innerHTML = "Play";
		play.addEventListener("click", clickPlay);
		playCont.appendChild(play);
	
var gameBoard = document.createElement("div");
		gameBoard.setAttribute("class","gameBoard");
		
		outerContainer.appendChild(gameBoard);
		
var termCont = document.createElement("div");
		termCont.setAttribute("class", "termCont");
		gameBoard.appendChild(termCont);
		
var termBox1 = document.createElement("div");
		termBox1.setAttribute("class", "termBox");
		termCont.appendChild(termBox1);
var term1  = document.createElement("p");
		term1.setAttribute("class", "term");
		term1.setAttribute("id", "term1");
		term1.setAttribute("draggable", "true");
		term1.setAttribute("name",arrayData.data[0].id);
		// term1.setAttribute("ondragstart", "dragger(event)");//*******************
		term1.addEventListener("dragstart", dragger, false);
		term1.innerHTML = arrayData.data[0].term;
		termBox1.appendChild(term1);
		
var termBox2 = document.createElement("div");
		termBox2.setAttribute("class", "termBox");
		termCont.appendChild(termBox2);
var term2  = document.createElement("p");
		term2.setAttribute("class", "term");
		term2.setAttribute("id", "term2");
		term2.setAttribute("draggable", "true");
		term2.setAttribute("name",arrayData.data[1].id);
	//	term2.setAttribute("ondragstart", "dragger(event)");
		term2.addEventListener("dragstart", dragger, false);
		term2.innerHTML = arrayData.data[1].term;
		termBox2.appendChild(term2);

var termBox3 = document.createElement("div");
		termBox3.setAttribute("class", "termBox");
		termCont.appendChild(termBox3);
var term3  = document.createElement("p");
		term3.setAttribute("class", "term");
		term3.setAttribute("id", "term3");
		term3.setAttribute("draggable", "true");
		term3.setAttribute("name",arrayData.data[2].id);
		//term3.setAttribute("ondragstart", "dragger(event)");
		term3.addEventListener("dragstart", dragger, false);
		term3.innerHTML = arrayData.data[2].term;
		termBox3.appendChild(term3);

var termBox4 = document.createElement("div");
		termBox4.setAttribute("class", "termBox");
		termCont.appendChild(termBox4);
var term4  = document.createElement("p");
		term4.setAttribute("class", "term");
		term4.setAttribute("id", "term3");
		term4.setAttribute("draggable", "true");
		term4.setAttribute("name",arrayData.data[3].id);
		//term4.setAttribute("ondragstart", "dragger(event)");
		term4.addEventListener("dragstart", dragger, false);
		term4.innerHTML = arrayData.data[3].term;
		termBox4.appendChild(term4);
		
var termBox5 = document.createElement("div");
		termBox5.setAttribute("class", "termBox");
		termCont.appendChild(termBox5);
var term5  = document.createElement("p");
		term5.setAttribute("class", "term");
		term5.setAttribute("id", "term5");
		term5.setAttribute("draggable", "true");
		term5.setAttribute("name",arrayData.data[3].id);
		//term5.setAttribute("ondragstart", "dragger(event)");
		term5.addEventListener("dragstart", dragger, false);
		term5.innerHTML = arrayData.data[4].term;
		termBox5.appendChild(term5);

//*************************************************************
var termDeffCont = document.createElement("div");
		termDeffCont.setAttribute("class", "termDeffCont");
		gameBoard.appendChild(termDeffCont);

var deffAndTermBox1 = document.createElement("div");
		deffAndTermBox1.setAttribute("class", "deffAndTermBox");
		termDeffCont.appendChild(deffAndTermBox1);
		
var termDrop1 = document.createElement("div");
		termDrop1.setAttribute("id", "drop1");
		termDrop1.setAttribute("class", "termDrop");
		// termDrop1.setAttribute("ondrop", "drop(event)");
		
//		termDrop1.setAttribute("ondragover", "allowDrop(event)");
		termDrop1.addEventListener("drop", drop, false);
		termDrop1.addEventListener("dragover", allowDrop, false);
		deffAndTermBox1.appendChild(termDrop1);
		
var deffBox1 = document.createElement("div");
		deffBox1.setAttribute("class", "deffBox");
		deffBox1.setAttribute("id", "deffBox1");
		deffAndTermBox1.appendChild(deffBox1);
		
		
var deff1 = document.createElement("p");
		deff1.setAttribute("class", "deff");
		deff1.setAttribute("id", "deff1");
		deff1.setAttribute("name",arrayData.data[0].id);
		deff1.innerHTML = arrayData.data[0].deff;
		deffBox1.appendChild(deff1);		
//*****************************************************************
var deffAndTermBox2 = document.createElement("div");
		deffAndTermBox2.setAttribute("class", "deffAndTermBox");
		termDeffCont.appendChild(deffAndTermBox2);
		
var termDrop2 = document.createElement("div");
		termDrop2.setAttribute("id", "drop2");
		termDrop2.setAttribute("class", "termDrop");
		//termDrop2.setAttribute("ondrop", "drop(event)");
		//termDrop2.setAttribute("ondragover", "allowDrop(event)");
		termDrop2.addEventListener("drop", drop, false);
		termDrop2.addEventListener("dragover", allowDrop, false);
		deffAndTermBox2.appendChild(termDrop2);
		
var deffBox2 = document.createElement("div");
		deffBox2.setAttribute("id", "deffBox2");
		deffBox2.setAttribute("class", "deffBox");
		deffAndTermBox2.appendChild(deffBox2);
		
		
var deff2 = document.createElement("p");
		deff2.setAttribute("id", "deff2");
		deff2.setAttribute("class", "deff");
		deff2.setAttribute("name",arrayData.data[1].id);
		deff2.innerHTML = arrayData.data[1].deff;
		deffBox2.appendChild(deff2);		
//******************************************************************
var deffAndTermBox3 = document.createElement("div");
		deffAndTermBox3.setAttribute("class", "deffAndTermBox");
		termDeffCont.appendChild(deffAndTermBox3);
		
var termDrop3 = document.createElement("div");
		termDrop3.setAttribute("id", "drop3");
		termDrop3.setAttribute("class", "termDrop");
		//termDrop3.setAttribute("ondrop", "drop(event)");
		//termDrop3.setAttribute("ondragover", "allowDrop(event)");
		termDrop3.addEventListener("drop", drop, false);
		termDrop3.addEventListener("dragover", allowDrop, false);
		deffAndTermBox3.appendChild(termDrop3);
		
var deffBox3 = document.createElement("div");
		deffBox3.setAttribute("class", "deffBox");
		deffBox3.setAttribute("id", "deffBox3");
		deffAndTermBox3.appendChild(deffBox3);
		
		
var deff3 = document.createElement("p");
		deff3.setAttribute("id", "deff3");
		deff3.setAttribute("class", "deff");
		deff3.setAttribute("name",arrayData.data[2].id);
		deff3.innerHTML = arrayData.data[2].deff;
		deffBox3.appendChild(deff3);		
//*********************************************************************
var deffAndTermBox4 = document.createElement("div");
		deffAndTermBox4.setAttribute("class", "deffAndTermBox");
		termDeffCont.appendChild(deffAndTermBox4);
		
var termDrop4 = document.createElement("div");
		termDrop4.setAttribute("id", "drop4");
		termDrop4.setAttribute("class", "termDrop");
		//termDrop4.setAttribute("ondrop", "drop(event)");
		//termDrop4.setAttribute("ondragover", "allowDrop(event)");
		termDrop4.addEventListener("drop", drop, false);
		termDrop4.addEventListener("dragover", allowDrop, false);
		deffAndTermBox4.appendChild(termDrop4);
		
var deffBox4 = document.createElement("div");
		deffBox4.setAttribute("id", "deffBox4");
		deffBox4.setAttribute("class", "deffBox");
		deffAndTermBox4.appendChild(deffBox4);
		
		
var deff4 = document.createElement("p");
		deff4.setAttribute("id", "deff4");
		deff4.setAttribute("class", "deff");
		deff4.setAttribute("name",arrayData.data[3].id);
		deff4.innerHTML = arrayData.data[3].deff;
		deffBox4.appendChild(deff4);		
//************************************************************************
var deffAndTermBox5 = document.createElement("div");
		deffAndTermBox5.setAttribute("class", "deffAndTermBox");
		termDeffCont.appendChild(deffAndTermBox5);
		
var termDrop5 = document.createElement("div");
		termDrop5.setAttribute("id", "drop5");
		termDrop5.setAttribute("class", "termDrop");
		//termDrop5.setAttribute("ondrop", "drop(event)");
		//termDrop5.setAttribute("ondragover", "allowDrop(event)");
		termDrop5.addEventListener("drop", drop, false);
		termDrop5.addEventListener("dragover", allowDrop, false);
		deffAndTermBox5.appendChild(termDrop5);
		
var deffBox5 = document.createElement("div");
		deffBox5.setAttribute("class", "deffBox");
		deffBox5.setAttribute("id", "deffBox5");
		deffAndTermBox5.appendChild(deffBox5);
		
		
var deff5 = document.createElement("p");
		deff5.setAttribute("id", "deff5");
		deff5.setAttribute("class", "deff");
		deff5.setAttribute("name",arrayData.data[4].id);
		deff5.innerHTML = arrayData.data[4].deff;
		deffBox5.appendChild(deff5);
		
//************************************************************************************************************************
	//All functions will go here. 
	//************************************************************************************************************************
//on play click 

function clickPlay(){
	console.log(buttonToggle.textContent);
	if(buttonToggle.textContent == "Play"){
		startPlay();
	}else if(buttonToggle.textContent == "End"){
		endButton();
	}else if(buttonToggle.textContent == "Show Score"){
		showScoreButton();
	}else if(buttonToggle.textContent == "Play Again"){
		playAgainButton();
	}
	
	
}
//dragg and drop functions

function allowDrop(event) {
  event.preventDefault();
}

function dragger(event) {
	// debugger;
	event.dataTransfer.setData("text", event.target.id);
}

function drop(event) {
  event.preventDefault();
  var data = event.dataTransfer.getData("text");
  event.target.appendChild(document.getElementById(data));
  ////************************************************************************************************** */
  // try to implement point system and color of the board
  //if droped event id == term's id tunr green add one to score;
  // arrayData.data[4].term;
  
	
}
//***********************************************************************************************************************
	//timer functions
//*********************************************************************************************************************** 
var timer = document.getElementById("timer");	
var buttonToggle = document.getElementById("play");
 watch = new Stopwatch(timer);

 function startPlay(){
	 watch.start();
	 buttonToggle.textContent  = "End";
	 
 }
 function endButton(){
	 watch.stop();
	 buttonToggle.textContent = "Show Score"
	 // terms are not clickable anymore
	 //Empty areaas become wrong answes
	 //hide undo button
 }
 function showScoreButton(){

	buttonToggle.textContent = "Play Again"
	 //message schore are appears
	 score.style.display="block";
	 // play apears and reloads page with new specs. 
 }
 function playAgainButton(){
	watch.reset();
	watch.start();
	//reloads new terms
	 buttonToggle.textContent= "End";
 }
 points();
 function points (){
//	
	//term id
	
	//console.log(termId);
	//deff id
	
	//console.log(deffId);
	// are they equal

	}
	// if they are add point turn green
	// not turn red.

 
//***********************************************************************************************************************				
			

	/*
	= document.createElement("");
		.setAttribute("", "");
		.appendChild();
	
	*/
	}
	
	xhr.failureCallback = function() {
		alert('Request failed.  Returned status of ' + xhr.status);
	}
	
	xhr.open('GET', 'bind_and_ajax_fun.json');

	xhr.onload = function() {
		if (xhr.status === 200) {
			xhr.successCallBack();
		}
		else {
			xhr.failureCallback();
		}
	}
	xhr.send();
}

/*
// array
// A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer. 

// ASCII
// American Standard Code for Information Interchange. A standard assignment of 7-bit numeric codes to characters. See also Unicode . 

// atomic
// Refers to an operation that is never interrupted or left in an incomplete state under any circumstance.

// authentication
// The process by which an entity proves to another entity that it is acting on behalf of a specific identity.

// authorization
// See access control. 

// autoboxing
// Automatic conversion between reference and primitive types. 


// bean
// A reusable software component that conforms to certain design and naming conventions. The conventions enable beans to be easily combined to create an application using tools that understand the conventions. 

// binary operator
// An operator that has two arguments. 

// bit
// The smallest unit of information in a computer, with a value of either 0 or 1. 

// bitwise operator
// An operator that manipulates the bits of one or more of its operands individually and in parallel. Examples include the binary logical operators (&, |, ^), the binary shift operators (<<, >>, >>>) and the unary one's complement operator (~). 

// block
// In the Java programming language, any code between matching braces. Example: { x = 1; }. 

// boolean
// Refers to an expression or variable that can have only a true or false value. The Java programming language provides the boolean type and the literal values true and false. 

// break
// A Java keyword used to resume program execution at the statement immediately following the current statement. If followed by a label, the program resumes execution at the labeled statement. 

// byte
// A sequence of eight bits. Java provides a corresponding byte type. 

// bytecode
// Machine-independent code generated by the Java compiler and executed by the Java interpreter. 



// case
// A Java keyword that defines a group of statements to begin executing if a value specified matches the value defined by a preceding switch keyword.


// casting
// Explicit conversion from one data type to another. */