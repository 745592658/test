package newThread;

public class Test2 {
	public static void main(String[] args) {
		Sale sale = new Sale();

		Thread th = new Thread(sale, "黄牛党");
		Thread th2 = new Thread(sale, "网络售票");
		Thread th3 = new Thread(sale, "窗口售票");
		Thread th4 = new Thread(sale, "电话售票");

		th.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
