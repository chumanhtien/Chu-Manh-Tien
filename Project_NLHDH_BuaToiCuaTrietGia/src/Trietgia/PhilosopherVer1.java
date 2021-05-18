package Trietgia;

public class PhilosopherVer1 extends Philosopher {

	public PhilosopherVer1(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
    @Override
    public void run() {
    	try {
			while (true) {
				mutex.acquire();
				
				fork.get(idPhilo - 1).sem.acquire();
				fork.get((idPhilo + 1 - 1) % 5).sem.acquire();
				
				mutex.release();
				eat();
				
				fork.get(idPhilo - 1).sem.release();
				fork.get((idPhilo + 1 - 1) % 5).sem.release();
				
				think();
				
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
    }
}
