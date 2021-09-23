package ch07;

public class ConditionOperationExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 95;
		char grade;// char 변수 선언

		// 조건문 ㅑf 참 else 거짓
		if (score > 90) { // if 블럭
			grade = 'A';
		} else {// else 블럭
			grade = 'B';
		}
		System.out.println("등금:" + grade);
		// String + char => String + String => "등급:" +'A' => "등급:" +"A"=> "등급:A"

		//
		score = 80;
		grade = score > 90 ? 'A' : 'B';
		System.out.println("등급:" + grade);
	}

}
