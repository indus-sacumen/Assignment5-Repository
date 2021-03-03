package MultiThreading;

public class ThreadTasks implements Runnable {

    private final int threadPosition;

    public ThreadTasks(int threadPosition) {
        super();
        this.threadPosition = threadPosition;
    }

    @Override
    public void run() {
    for(int i=1;i<=10;i++)
{
    if(threadPosition==1)
        System.out.println("pass "+i);
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    if(threadPosition==2)
        System.out.println("fail "+i);
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}

    }
}