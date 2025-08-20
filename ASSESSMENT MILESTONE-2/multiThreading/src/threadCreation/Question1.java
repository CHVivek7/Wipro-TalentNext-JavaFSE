package threadCreation;

public class Question1 extends Thread{

	public static void main(String[] args) {
		Question1 t1 = new Question1();
		Question1 t2 = new Question1();
		t1.setName("Scooby");
		t2.setName("Shaggy");
		t1.start();
		t2.start();

	}
	
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

}
