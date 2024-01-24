public class myThreadClass implements Runnable{

    Thread t;
    myThreadClass(){
        t = new Thread(this, "My Cool Thread");
    }

    public void run(){
        try {
            System.out.println("Running thread class");
            for (int i = 5; i < 10; i++){
                System.out.println("Couting from Runnable Extention: " + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
