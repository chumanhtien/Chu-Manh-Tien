package Trietgia;
import java.util.concurrent.Semaphore;

public class Fork {
	Semaphore sem;
	public Fork() {
		this.sem = new Semaphore(1);
	}
}
