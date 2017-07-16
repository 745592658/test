package newThread;

public class MyThread6 implements Runnable{

	
	public synchronized void run() {
		for (int i = 0; i < 100; i+=10) {
			if(i==0){
				System.out.println(Thread.currentThread().getName()+"拿到了接力棒");
			}else{
				System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
			}
			
			
		}
		
	}
  
}
