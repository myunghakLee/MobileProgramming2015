package kr.ac.kookmin.exception.bankthread;

public class WithdrawMain implements Runnable {
	private BankAccount account = new BankAccount();

	
	public static void main (String []args) {
		WithdrawMain job = new WithdrawMain();
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		t1.setName("han");
		t2.setName("lim");

		t1.setPriority(9);
		t2.setPriority(1);

		
		t1.start();
		t2.start();
		try
		{
		t1.join();
		t2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			withDrawMoney(10);
			if (account.getBalance() < 0) {
				System.out.println("�ܰ���Ȳ : " + account.getBalance() + " ���� �ѵ��� ����� ���� �Ǿ������ϴ�. ġ������ ����");
				break;
			}
		}
	}

	public synchronized void withDrawMoney(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " �� ���� �õ� �մϴ�");
			try {
				System.out.println(Thread.currentThread().getName() + " ���� ���� �� 0.5�� ����մϴ�.");
				// Thread.sleep(500);
				notifyAll();
				wait();

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " �������.");
			account.withDraw(amount);
			System.out.println(Thread.currentThread().getName() + " ����Ϸ�. ");
		} else {
			System.out.println(Thread.currentThread().getName() + "�� ������ ���� �����ϴ�.. ");
		}
	}
}
