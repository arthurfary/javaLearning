public class classExtendsThread extends Thread {
    classExtendsThread(){
        super("extended Thread");
        System.out.println("Criou com o Thread" + this);
    }

    public void run(){
        try {
            System.out.println("Running thread class");
            for (int i = 20; i < 25; i++){
                System.out.println("Counting on extended from Thread: " + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
