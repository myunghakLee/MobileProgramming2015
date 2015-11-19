package kc.ac.kookmin.exception.transaction;

class Bank {
	private int balance = 1000;

	public void oneqTrade() {
		try {
			tradeWithA();
			tradeWithB();
			tradeWithC();
		} catch (Exception ex2) {
	
			
			System.out.println("�ŷ��� ���� �߻�, �ŷ� ���");
			cancelA();
			cancelB();
			cancelC();
				
			System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ����
		}
	}

	public void tradeWithA() {
		int m = 100; // A���¿��� ����� �ݾ�
		System.out.println("A ���¿��� ��� - " + m);
		balance -= m;
	}

	public void tradeWithB () throws Exception {
		int m = 200;
		System.out.println("B ���¿��� ��� - " + m);
		balance -= m;
	}

	public Exception tradeWithC() throws Exception {
		int m = 300;
	//	try {
			System.out.println("C ���¿��� ��� - " + m);
			balance -= m;
			Exception ex = new Exception();
			throw ex;
	//	} catch (Exception e) {
	//		Exception ex2 = new Exception();
	//		return ex2;
	
	//	}
	}

	public void cancelA() {
		System.out.println("A ���� �ŷ� ���  ");
		balance += 100;
	}

	public void cancelB() {
		System.out.println("B ���� �ŷ� ���  ");
		balance += 200;
	}

	public void cancelC() {
		System.out.println("C ���� �ŷ� ���  ");
		balance += 300;
	}
}
