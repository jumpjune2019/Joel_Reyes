// Suspending, resuming, and stopping a thread.
class Lights implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;
    Lights(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }
    // This is the entry point for thread.
    public void run() {
        //	System.out.println(thrd.getName() + " starting.");
        try {
            System.out.println("Traffic Light Simulator is a Go!");
           while(!stopped) {
               System.out.println("Light is Green - Go!");
               Thread.sleep(Status.GREEN.getTime());

               System.out.println("Light is Yellow - Beware!");
               Thread.sleep(Status.YELLOW.getTime());

               System.out.println("Light is Read - Stop!");
               Thread.sleep(Status.RED.getTime());
           }


        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }

    }
    // Stop the thread.
    synchronized void mystop() {
        stopped = true;
        // The following ensures that a suspended thread can be stopped.
        suspended = false;
        notifyAll();
    }
    // Suspend the thread.
    synchronized void mysuspend() {
        suspended = true;
    }
    // Resume the thread.
    synchronized void myresume() {
        suspended = false;
        notify();
    }
    //set Priority to High
    synchronized void setPriorityHigh(){
        thrd.setPriority(Thread.MAX_PRIORITY);
        notify();
        System.out.println(thrd.getName() + " Priority was set to High");
    }
    //set Priority to High
    synchronized void setPriorityLow(){
        thrd.setPriority(Thread.MIN_PRIORITY);
        notify();
        System.out.println(thrd.getName() + " Priority was set to Low");
    }
}