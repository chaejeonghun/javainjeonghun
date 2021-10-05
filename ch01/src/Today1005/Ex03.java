package Today1005;

public class Ex03 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		// 3유형 메소드 호출
		c1.setcc(1000);
		c1.setColor("red");
		c1.setKind("sonata");
	}

}

class Car1 {
	String Kind;
	int Cc;
	String Color;

	//
	public void setKind(String kind) {
		this.Kind = kind;
	}

	public void setcc(int cc) {
		this.Cc = cc;
	}

	public void setColor(String color) {
		this.Color = color;
	}
}