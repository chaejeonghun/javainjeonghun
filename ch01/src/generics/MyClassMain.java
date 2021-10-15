package generics;

public class MyClassMain {

	public static void main(String[] args) {
		// 컴파일시 T -> Integer로 변환
		MyClass<Integer> s = new MyClass<Integer>();
		s.set(10);
		s.set(new Integer(10));
		System.out.println(s.get());

		// 컴파일시 T -> String으로 변환
		MyClass<String> s1 = new MyClass<String>();
		s1.set("hello");
		System.out.println(s1.get());

		MyClass<Double> s2 = new MyClass<Double>();
	}

}
