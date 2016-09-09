import java.util.concurrent.Executors;
import java.util .concurrent.ExecutorService;
class SimpleThread extends Thread{
	String msg;
	SimpleThread(String s){
		this.msg =s;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"Start"+msg);
		process();
		System.out.println(Thread.currentThread().getName()+"Stop");
	}
	
	static void process(){
		try{
			Thread.sleep(500);
		}catch(Exception e){}
	}
}

public class ThreadPool{
	
	public static void main(String[] a){
	ExecutorService executor = Executors.newFixedThreadPool(5);
	for(int i=0;i<=10;i++){
		
		Runnable simplethread = new SimpleThread(" "+i);
		executor.execute(simplethread);
	}
	executor.shutdown();
	while(!executor.isTerminated()){}
	System.out.println("Finished All Threads...");
}
}