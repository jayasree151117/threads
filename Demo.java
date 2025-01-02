package multithread;

public class Demo implements Runnable {
	public void run() {
		//Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        int threadCount=Thread.activeCount();
     /*   ThreadGroup threadGroup
        = Thread.currentThread().getThreadGroup();
        System.out.println(threadGroup);*/

        System.out.println(threadCount);
       
	}
	

	public static void main(String[] args) {
		Demo d=new Demo();
		//Thread th=new Thread(d);
		d.run();
		
		
			}

}
