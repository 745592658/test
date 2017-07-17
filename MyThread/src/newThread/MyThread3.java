package newThread;

public class MyThread3 implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i == 19) {
				System.out.println(Thread.currentThread().getName() + "到达终点！");
			} else {
				System.out.println(Thread.currentThread().getName() + "爬完100米！");
			 }
		}
	}
}
