var Controller = (function() {

	var addButtonClickEvent = function(textTrigger, event) {

		var model = this;
		var value = textTrigger.value.trim();
		if(value.length) {
			if(model.notDuplicate(value)) {
				model.Add(value);
				textTrigger.value = null;
			} else {
				alert("Duplicate Value");
			}
		};
	
	};
	
	var addEnterEvent = function(textTrigger, event) {
//******************************************************
		var key = event.which || event.keyCode;
		var mouseEvent = null;
		if (key === 13|| null){
	//*************************************************	
		var model = this;
		var value = textTrigger.value.trim();
		if(value.length) {
			if(model.notDuplicate(value)) {
				model.Add(value);
				textTrigger.value = null;
			} else {
				alert("Duplicate Value");
			}
		};}
	
	};
	/*
	 * document.querySelector('#txtSearch').addEventListener('keypress', function (e) {
    var key = e.which || e.keyCode;
    if (key === 13) { // 13 is enter
   */
	
	var onKeyDown = function(textTrigger, event){
		alert("enter presset");
	}



	var deleteButtonClickEvent = function(event) {
		var model = this;
		if(event.target.type == "button") {
			model.Delete(event.target.value);
		
		}
	
	}

	var constructor = function() {

		var scopeEl;
		var model;
		var view;

		this.init = function(el, m, v) {
			scopeEl = el;
			model = m;
			view = v;
			model.setScope(el);
			model.setView(view);
			model.registerWidget(view.listView());
			model.registerWidget(view.summaryView());
			model.refreshWidgets(view, model);
			
			
			var addButton = view.triggerField().getButtonInstance(el);
			var textTrigger = view.triggerField().getTextInstance(el);
			
		
			addButton.addEventListener("click", addButtonClickEvent.bind(model, textTrigger));
			//
			textTrigger.addEventListener("keypress", addEnterEvent.bind(model, textTrigger));
			
			var listViewEl = scopeEl.getElementsByClassName('listWrapper')[0];
			listViewEl.addEventListener("click", deleteButtonClickEvent.bind(model));
			
		};
		
	};
	
	return new constructor();
	
});