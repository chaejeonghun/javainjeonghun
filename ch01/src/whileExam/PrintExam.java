package whileExam;

/*printf("포멧기호1, 포멧기호2, 포멧기호3...", 값1, 값2, 값3,...)*/
// 포멧기호의 갯수와 값의 갯수가 같아야함.
//포멧기호의 데이타 타입과 매칭되는 값의 데이타 타입이 같아야함.
/* %d int
 * %f double
 * %e 부동소수점
 * %c 문자
 * %s String타입 문자열
 */
public class PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%x \n", 15); // %x는 16진수 포멧 10진수 - > 16진수 표현
		System.out.printf("%d \n", 15); // %d는 10진수 포멧 10진수
		System.out.printf("%f \n", 15.0); // %f는 실수포맷
		System.out.printf("%e \n", 15.0); // %e는 부동 소수점 포멧
		System.out.printf("%s \n", 15.0); // %e는 문자열 "15.0"

		System.out.printf("%d 나누기 %d는 몫이 %d이고, 나머지는 %d입니다.\n", 5, 2, (5 / 2), (5 % 2));
	}

}
