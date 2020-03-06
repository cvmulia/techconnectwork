import sun.awt.windows.ThemeReader;

public class MyThread extends Thread{
    public void run(){

        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("run() method called");

    }

}
