package ArrayPractice;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };

		// max변수에 배열의 값들 보다 현저하게 작은 값 저장하여 선언
		// min변수에 배열의 값들 보다 현저하게 큰 값 저장하여 선언
		int sum = 0, max = 0, min = 100;

		for (int k : score) {
			sum += k;
			if (max < k)
				max = k;
		}
		System.out.println("최대값 :" + max);

		for (int j : score) {
			if (min > j)
				min = j;
		}
		System.out.println("최소값 :" + min);

		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum / (double) score.length);
	}
}