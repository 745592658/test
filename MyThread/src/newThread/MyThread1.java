package newThread;

public class MyThread1 extends Thread {
	public void run(){
         System.out.println("Thread 第一次提交");
         System.out.println("Thread 第二次提交");
	 for (int i = 0; i < 20; i++) {
		System.out.println("你好来自线程:"+Thread.currentThread().getName());
	}	
	}
}
