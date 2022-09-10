package threads_java;
//public class Java_threads extends Thread {
//	
//	public static void main(String[] args) {
//		Java_threads s=new Java_threads();
//		s.start();
//		System.out.println("This is outside thread");
//	}
//	public void run() {
//		System.out.println("I am running inside thread ");
//	}
public class Java_threads implements Runnable {
	
	public static void main(String[] args) {
		
		Java_threads obj=new Java_threads();
		Thread thread=new Thread(obj);
		thread.start();
		System.out.println("This is outside thread");
	}
	public void run() {
		System.out.println("I am running inside thread ");
	}
}
