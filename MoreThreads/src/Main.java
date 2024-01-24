public class Main {
    public static void main(String[] args) {

        ThreadMaker[] threads = new ThreadMaker[3];

        for (int i = 0; i < threads.length; i++){
            threads[i] = new ThreadMaker("Thread"+i); // creating three threads
        }

        for (ThreadMaker thread : threads){
            thread.thread.start();
        }

    }
}