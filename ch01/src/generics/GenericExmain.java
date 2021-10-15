package generics;

public class GenericExmain {

	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		GenericMethodEx ge = new GenericMethodEx();

		for (int i = 0; i < 5; i++) {
			gs.push(new Double(i));
		}
		for (int i = 0; i < 5; i++)
			System.out.println(gs.pop());

		GStack<Double> gs2 = ge.reverse(gs);
		for (int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}
	}

}
