 enum Status {
    GREEN(5000), RED(3000),YELLOW(2000);
   private Integer time;
    //constructor
    Status(Integer t){
        time = t;
    }
    int getTime(){

        return time;
    }
}

