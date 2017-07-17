package newThread;

public class MyThread1 extends Thread {
	public void run(){
	 for (int i = 0; i < 20; i++) {
		System.out.println("你好来自线程:"+Thread.currentThread().getName());
	}	
	}
}
