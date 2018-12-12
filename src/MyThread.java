
public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
//		myThread.start();
		myThread.run1();
	}

	public void run1() {
		run();
		System.out.println("MyThread run");
		
	}

}