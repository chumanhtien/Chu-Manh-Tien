package Trietgia;

public class Test{
	public static void main(String args[]) {
		PhilosopherVer1 philosopher_1 = new PhilosopherVer1(1);
		PhilosopherVer1 philosopher_2 = new PhilosopherVer1(2);
		PhilosopherVer1 philosopher_3 = new PhilosopherVer1(3);
		PhilosopherVer1 philosopher_4 = new PhilosopherVer1(4);
		PhilosopherVer1 philosopher_5 = new PhilosopherVer1(5);
		
		for (int i = 0; i < 5; i++) {
			Philosopher.fork.add(new Fork());
		}
		
		Thread thread_1 = new Thread(philosopher_1);
		Thread thread_2 = new Thread(philosopher_2);
		Thread thread_3 = new Thread(philosopher_3);
		Thread thread_4 = new Thread(philosopher_4);
		Thread thread_5 = new Thread(philosopher_5);
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		thread_4.start();
		thread_5.start();
	}
}