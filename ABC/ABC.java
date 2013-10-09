package ABC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABC {
	public static int state = 0; 
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		
			exec.execute(new A());
			exec.execute(new B());
			exec.execute(new C());
		
		exec.shutdown();
	}
}
