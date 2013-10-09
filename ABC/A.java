package ABC;

public class A implements Runnable {

	@Override
	public synchronized void run() {
		while(ABC.state <= 27){
//			ABC.l.lock();
			if(ABC.state%3 == 0){
			System.out.print(" A"+ABC.state);
			ABC.state++;
			}
//			ABC.l.unlock();
		}
	}
}
