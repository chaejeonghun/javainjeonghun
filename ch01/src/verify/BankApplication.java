package verify;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	// [null][null][null][null][null][null][null]...[null];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	}

	// Account 배열에서 ano 와 동일한 Account객체 찾기
	// 참조타입 배열의 값 비교
	private static Account findAccount(String ano) {
		Account account = null;
		// 무언가 추가되어야 오류가 발생안함
		for (int i = 0; i < accountArray.length; i++) {
			account = accountArray[i];
			if (account.getAno().equals(ano))
				return account;
		}
		return account;
	}
}
