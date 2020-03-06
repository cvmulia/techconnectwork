import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        int count = 0;
//
//        SynchDemo synchDemo1 = new SynchDemo(count,"thread1");
//        SynchDemo synchDemo2 = new SynchDemo(count,"thread2");
//
//        Thread t1 = new Thread(synchDemo1);
//        Thread t2 = new Thread(synchDemo2);
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        SynchDemo synchDemo = new SynchDemo(count, 1);

        // using executor service to create a new thread pool which will contain 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);


        // loop over the new collection of threads and pass it as an instance of out thread
        for (int i = 0; i<3; i++){
            executor.submit(new SynchDemo(count, i));
        }

        // specify that once completed, the executor should be shut down
        executor.shutdown();

        //msg to indicate that all tasks have been submitted
        System.out.println("all tasks submitted");

        // instead of thread.join(), we used this below, to restrict load of memory in CPU, pause further executions
        // until the thread is completed to a certain degree
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //        ArrayList<Thread> threads = new ArrayList<Thread>();


//        Thread t1 = new Thread(synchDemo);
//        Thread t2 = new Thread(synchDemo);
//        Thread t3 = new Thread(synchDemo);
//        Thread t4 = new Thread(synchDemo);



//        threads.add(t1);
//        threads.add(t2);
//        threads.add(t3);
//        threads.add(t4);

//        for (Thread thread: threads){
//            thread.start();
//        }
//
//        for (Thread thread: threads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


    }
}
