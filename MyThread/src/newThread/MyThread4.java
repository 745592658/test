package newThread;

public class MyThread4 implements Runnable{

	
	public void run() {
		for (int i = 1; i <= 30; i++) {
			 System.out.println("特需号:"+i+"号病人正在看病。");
		}
     
	}
   
}
