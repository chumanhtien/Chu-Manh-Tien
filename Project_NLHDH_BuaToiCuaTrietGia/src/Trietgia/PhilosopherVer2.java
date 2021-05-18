package Trietgia;

public class PhilosopherVer2 extends Philosopher{

	public PhilosopherVer2(int id) {
		super(id);
		// TODO Auto-generated constructor stub	
	}
	@Override
	public void run() {
		try {
			while (true) {
				int j = (idPhilo) % 2;
				//mutex.acquire();
				//Cac phan co them -1 boi vi fork 1 bat dau tu phan tu 0 cua list
				fork.get((idPhilo + j - 1) % 5).sem.acquire();
				fork.get((idPhilo + 1 - j - 1) % 5).sem.acquire();
				
				//mutex.release();
				eat();
				
				fork.get((idPhilo + 1 - j - 1) % 5).sem.release();
				fork.get((idPhilo + j - 1) % 5).sem.release();

				think();
				
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
		
	}

}
