package ABC;

public class C implements Runnable {

	@Override
	public synchronized void run() {
		while(ABC.state <= 29){
//			ABC.l.lock();
			if(ABC.state%3 == 2){
			System.out.print(" C"+ABC.state);
			ABC.state++;
		}
		}
	}
}
