package newThread;

public class MyThread7 implements Runnable {
	private int num=0;//已售票数
	private int count=10;//剩余票数
	public void  run(){
		while(true){
			synchronized(this){
				if(count==0) break;						
				num++;
				count--;
				try {
					Thread.sleep(500); //模拟网络延时
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票，剩余"+count+"张票！");
			}
		}

	}

}
