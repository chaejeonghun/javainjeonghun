package Today0930;

//프로그램 실행용 클래스 - main ()메소드로 부터 시작
public class ch01 {
	public static void main(String[] args) {
		// person 객체 생성
		Person person = new Person();
		// person객체에서 메소들 호출 - 신호전달
		// 참조변수.메소드명(); 으로 호출
		person.calc();
	}
}
