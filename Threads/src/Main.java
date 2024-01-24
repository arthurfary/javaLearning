public class Main {
    public static void main(String[] args) {

        Thread myThread = Thread.currentThread(); // makes myThread the new main

        myThread.setName("Im the new main now");

        System.out.println(myThread); // returns [threadID, threadName, threadPriority, threadGroup]

        myThreadClass tc =  new myThreadClass();
        tc.t.start();

        classExtendsThread otherThread = new classExtendsThread();
        otherThread.start();

        try{
            for(int i = 3; i > 0; i-- ){
                System.out.println("Counting on main: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }


    }
}