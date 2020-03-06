import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchDemo implements Runnable {

    private int count = 0;
    private int id;
//    AtomicInteger atomicInteger = new AtomicInteger(0);

//    atomicInteger.set(atomicInteger.get(0));

    public SynchDemo(int count, int id){
        this.count = count;
        this.id = id;
    }

    public void run() {
        System.out.println("Starting thread: "+id);
        while(count <100){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            increment();
            System.out.println("The count is " + count);
        }
        System.out.println("Completed thread" + id);
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public synchronized void increment(){
        this.count++;
    }




}
