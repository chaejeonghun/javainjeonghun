package Group6;

public class Stock {
	static final String stockInfo = "111"; // 상수로 item에 사용할 코드 앞자리 지정
	static int seq = 0;
	private String name;
	private String item;
	private int qty;

	{
		seq++;
		item = stockInfo + " - " + String.format("%03d", seq);
	} // 상수 111 - 다음으로 순차적 001 부터 증가

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
		return ("상품명 : " + name + "\n상품번호 : " + item + "\n제품수량 : " + qty);

	}

}
