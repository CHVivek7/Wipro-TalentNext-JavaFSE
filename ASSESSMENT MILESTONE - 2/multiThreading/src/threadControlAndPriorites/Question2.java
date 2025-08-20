package threadControlAndPriorites;

public class Question2 {

	public static void main(String[] args) {
		Even EvenThread = new Even();
		Odd OddThread = new Odd();
		EvenThread.start();
		try {
			EvenThread.join();
//			If we use Thread.currentThread().join() then Main thread waits for itself – leads to deadlock or crash.
		}catch(InterruptedException ie) {
			System.out.println("Interrupted Exception: " + ie);
		}
		OddThread.start();

	}

}


class Even extends Thread{
	public void run() {
		for(int i=2;i<=20;i += 2) {
			System.out.println(i);
		}
	}
}

class Odd extends Thread{
	public void run() {
		for(int i=1;i<=20;i += 2) {
			System.out.println(i);
		}
	}
}