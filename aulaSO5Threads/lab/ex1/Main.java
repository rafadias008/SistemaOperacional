public class Main{

    public static void main(String[] args) throws InterruptedException{

        Ex1Threads ext = new Ex1Threads();
        Thread t1 = new Thread(ext);

        t1.start();
        t1.join();
    }
}