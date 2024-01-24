public class ThreadMaker implements Runnable{
    String threadName;
    Thread thread;

    ThreadMaker(String name){
        this.threadName = name;
        this.thread = new Thread(this, name);
    }

    public void run(){
        try {
            for (int i = 0; i < 10; i++){
                System.out.println("Thread '" + this.threadName + "' Counting: " + i);
                Thread.sleep(1000);
            }
            System.out.println("Thread " + this.threadName + " is finished!");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
