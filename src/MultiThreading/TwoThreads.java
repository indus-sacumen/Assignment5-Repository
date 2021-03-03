//java program which will create two threads t1 and t2.  When you run program t1 thread will print pass and t2 will print fail for 10 times.
package MultiThreading;


public class TwoThreads {

    public static void main(String args[]) {

        TwoThreads t = new TwoThreads();

        ThreadTasks t1 = new ThreadTasks(1);
        ThreadTasks t2 = new ThreadTasks(2);


        Thread ts1 = new Thread(t1);
        Thread ts2 = new Thread(t2);

        ts1.start();
        ts2.start();

    }

}

