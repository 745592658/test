package newThread;

public class Test {
	public static void main(String[] args) {
		/*练习一
		MyThread1 m1=new MyThread1();
		MyThread1 m2=new MyThread1();
		m1.start();
		m2.start();*/
		/*联系2
		MyThread2 m1=new MyThread2();
		MyThread2 m2=new MyThread2();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();*/
		//联系3
		/*MyThread3 m1=new MyThread3();
		MyThread3 m2=new MyThread3();
		Thread t1=new Thread(m1,"年轻人");
		Thread t2=new Thread(m2,"老年人");
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();*/
		/*MyThread5 m1=new MyThread5();
		Thread t1=new Thread(m1);
		t1.run();
		System.out.println("主线程名称"+Thread.currentThread().getName()+",优先级别:"+Thread.currentThread().getPriority());
		System.out.println("子线程名称"+t1.getName()+",优先级别:"+t1.getPriority());	
		t1.setPriority(1);
		Thread.currentThread().setPriority(10);
		t1.run();
	    System.out.println("主线程名称"+Thread.currentThread().getName()+",优先级别:"+Thread.currentThread().getPriority());
		System.out.println("子线程名称"+t1.getName()+",优先级别:"+t1.getPriority());*/	
	   /*MyThread4 m1=new MyThread4();
		Thread t1=new Thread(m1,"年轻人");
		t1.start();
		for (int i = 1; i <= 50; i++) {
		   if(i==11){
			   try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		   System.out.println("普通号:"+i+"号正在看病;");
		}	*/
		/*MyThread6  m1=new MyThread6();
		for (int i = 1; i <= 4; i++) {
			Thread t=new Thread(m1,i+"号选手");
			t.start();
		}*/
		MyThread7 m1 = new MyThread7();
		Thread t1 = new Thread(m1, "邓兵");
		Thread t2 = new Thread(m1, "黄宇");
		Thread t3 = new Thread(m1, "丰满");							
		t1.start();
		t2.start();
		t3.start();
	}

}
