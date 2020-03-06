public class Main {


    public static void main(String[] args) {

//              Runner runner1 = new Runner();
//
//        runner1.start(); // run it as a thread, new instance of a thread created
//
//        Runner runner2 = new Runner();
//
//        runner2.start(); // same here. if "run" method is used instead, no instance of thread.
//
//
//        Thread thread1 = new Thread (new Runner2()); //new instance of Runner2 passed in to a new instance of thread
//        Thread thread2 = new Thread(new Runner2());
//
//        thread1.start();
//        thread2.start();
//
//        Thread thread3 = new Thread(
//                new Runnable(){                 //anon class
//                    public void run() {
//                        for (int i = 0;i<10;i++){
//                            System.out.println("Hello"+i);
//                            try {
//                                Thread.sleep(100);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//
//                }
//        );
//
//        thread3.start();
//
//
//        MyThread t = new MyThread();
//        t.start();

        Runner runner1 = new Runner();
        runner1.start();
    }
}
