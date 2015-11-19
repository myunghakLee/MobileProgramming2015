public class MoreThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		
		mt1.setName("child #1");
		mt2.setName("child #2");
		mt3.setName("child #3");
			
		mt1.start();
		mt2.start();
		mt3.start();
			
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}