package Group6;

public class Stock {
	static final String stockInfo = "111"; // ����� item�� ����� �ڵ� ���ڸ� ����
	static int seq = 0;
	private String name;
	private String item;
	private int qty;

	{
		seq++;
		item = stockInfo + " - " + String.format("%03d", seq);
	} // ��� 111 - �������� ������ 001 ���� ����

	public Stock(String name, int qty) {
		this.name = name;
		this.qty = qty;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return item;
	}

	public void setNo(String no) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return ("��ǰ�� : " + name + "\n��ǰ��ȣ : " + item + "\n��ǰ���� : " + qty);

	}

}
