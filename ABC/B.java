package ABC;

public class B implements Runnable {

	@Override
	public synchronized void run() {
		while(ABC.state <= 28){
//			ABC.l.lock();
			if(ABC.state%3 == 1){
			System.out.print(" B"+ABC.state);
			ABC.state++;
		}
//			ABC.l.unlock();
		}
	}
}
