package ch07;

public class Exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. jdk와 jre의 차이점 */
		System.out.println("1.JDK는 JRE와 컴파일러 등 개발 도구가 포합된다.");
		System.out.println("2.자바 프로그램을 개발하려면 JDK가 반드시 필요하다.");
		System.out.println("3.자바 프로그램을 실행만 하려면 JRE를 설치해도 상관없다.");
		System.out.println("4.JRE에는 컴파일러 javc.exe 가 포함되어있다 -x");

		/* 2. JVM 에 대한 설명 */
		System.out.println("1.JVM은 java.exe 명령어에 의해 실행된다.");
		System.out.println("2.JVM은 바이트 코드를 기계어로 변환시키고 실행한다.");
		System.out.println("3.JVM은 운영체제에 독립적이다.-x");
		System.out.println("4.바이트 코드는 jvm에 독립적이다만, jvm은 운영체제에 종속적이다.");

		/* 자바 프로그램 개발 과정 */
		System.out.println("1. javac.exe로 바이트 코드 파일(~.class)을 생성한다.");
		System.out.println("2. java.exe로 JVM을 구동시킨다.");
		System.out.println("3. 자바 소스 파일 (~.java)을 작성한다.");
		System.out.println("4. JVM은 main()메소드를 찾아 메소드 블록을 실행 시킨다.");
		System.out.println(" 3 - 1 - 2 - 4 ");

		/* 자바 소스 파일 */
		System.out.println("1. 자바 소스파일명과 클래스 이름은 대소문자가 동일해야 한다.");
		System.out.println("2. 클래스 블록과 메스도 블록은 반드시 중괄호 {}로 감싸야 한다.");
		System.out.println("3. 실행문 뒤에는 반드시 세미콜론(;)을 붙여야한다.");
		System.out.println("4. 주석은 문자열 안에도 작성 할 수 있다. x");

		/* 자바 주석문 */
		System.out.println("1. //: 행주석");
		System.out.println("2. /* ~ */: 범위 주석");
		System.out.println("3. /** ~ */: API 도큐먼트 주석");
		System.out.println("4. <!-- ~ -->: 범위주석 - x");

		/* 이클립스 설명 */
		System.out.println("1. 이클립스는 JDK(JRE)를 설치해야만 실행할 수 있다.");
		System.out.println("2. 이클립스에서 소스파일을 저장하면 자동 컴파일 되어 바이트 코드 파일이 생성 된다.");
		System.out.println("3. 워크스페이스는 프로젝트들이 생성되는 기본 디렉토리를 말한다.");
		System.out.println("4. .metadata는 프로젝트의 소스 파일들이 저장되는 디렉토리 이다. x"); // 환경 변수, 설정값, 작업 히스토리 정보 저장공간

	}

}
