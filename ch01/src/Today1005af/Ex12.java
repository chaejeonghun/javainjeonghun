package Today1005af;

public class Ex12 {

	public static void main(String[] args) {
		Bank bnk = Bank.getBank();
		System.out.println("�ŷ����� : " + bnk.name);

	}

}

//Calendar Ŭ���� �� ��ü ó�� �� �ý��ۿ� �ϳ��� ��ü�� �����Ͽ�
//����ؾ��ϴ� ��� ����ϴ� Ŭ���� ���� ��� - �̱���
class Bank {
	String name;
	// static ��� - private
	// �ܺο��� �����Ҽ� ������ ĸ��ȭ
	// Ŭ���� �ε�� BankŬ������ ��ü�� �ʱ�ȭ
	private static Bank b = new Bank("ȭ������"); // BankŬ���� ���� ���� ����
	// private -�ܺο��� ���� �� �� ������ ĸ��ȭ - new Bank()�� �ܺο��� ���� �Ұ�

	private Bank(String n) {
		name = n;
	}

	// static ���
	// �ܺο��� ���� ������ �޼ҵ� -public�� ������.
	static Bank getBank() {
		return b;
	}
}