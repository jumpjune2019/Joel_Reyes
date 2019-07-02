function Stopwatch(elem) {
    var time = 0;
    var offset;
    var interval;
  
    function update() {
      if (this.isOn) {
        time += delta();
      }
      
      elem.textContent = timeFormatter(time);
    }
  
    function delta() {
      var now = Date.now();
      var timePassed = now - offset;
  
      offset = now;
  
      return timePassed;
    }
  
    function timeFormatter(time) {
      time = new Date(time);
  
      var hours = (time.getHours()-18).toString();
      var minutes = time.getMinutes().toString();
      var seconds = time.getSeconds().toString();
  
      if (hours.length < 2) {
        hours = '0' + hours;
        
      }
  
      if (minutes.length < 2) {
        minutes = '0' + minutes;
      
      }
  
      while (seconds.length < 2) {
        seconds = '0' + seconds;
        
      }
  
      return hours + ' : ' + minutes + " : "  + seconds;
    }
  
    this.start = function() {
      interval = setInterval(update.bind(this), 1000);
      offset = Date.now();
      this.isOn = true;
    };
  
    this.stop = function() {
      clearInterval(interval);
      interval = null;
      this.isOn = false;
    };
  
    this.reset = function() {
      time = 0;
      update();
    };
  
    this.isOn = false;
  }