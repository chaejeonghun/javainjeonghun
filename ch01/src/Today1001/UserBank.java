package Today1001;

public class UserBank {

	public static void main(String[] args) {
		// Bank ��ü ����
		Bank bank = new Bank();
		// System.out.println("�ܰ� : " +bank.balance);
		// bank.balance =10000;
		// bank.balance = bank.balance=5000;
		// if(bank.balance - 15000>=0);
		// bank.balance = bank.balance -15000;

		// �Ա� ��� ȣ��
		bank.deposit(10000);

		// ��ݱ�� ȣ��
		// bank.withdraw(8000);

		// �ܰ� ���
		bank.currentBalance();
	}

}
