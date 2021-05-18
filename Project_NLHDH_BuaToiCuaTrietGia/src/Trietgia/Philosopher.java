package Trietgia;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.Random;

public class Philosopher implements Runnable{
	protected int idPhilo;
	static List<Fork> fork;
	static Semaphore mutex = new Semaphore(1);
	
	public Philosopher(int id) {
		this.idPhilo = id;
		fork = new ArrayList<Fork>();
	}
	public int getIdPhilo() {
		return idPhilo;
	}

	public void setIdPhilo(int idPhilo) {
		this.idPhilo = idPhilo;
	}	
	
	void eat() {
		Random rand = new Random();
		int time = rand.nextInt(10000) + 1;
		try {
			System.out.println("Philosopher " + this.idPhilo + " is eating...");
			Thread.sleep(time);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}
	void think() {
		Random rand = new Random();
		int time = rand.nextInt(10000) + 1;
		try {
			System.out.println("Philosopher " + this.idPhilo + " is thinking...");
			Thread.sleep(time);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
