package verify;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	// [null][null][null][null][null][null][null]...[null];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx; // idx=0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택 >");

			int selectNo = scanner.nextInt();
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성
	private static void createAccount() {
		System.out.println("---------");
		System.out.println(" 계좌 생성");
		System.out.println("---------");
		System.out.print(" 계좌 번호");
		String ano = scanner.next();
		System.out.print(" 계좌주");
		String owner = scanner.next();
		System.out.println(" 초기 입금 금액");
		int balance = scanner.nextInt();

		Account acc = new Account(ano, owner, balance);
		accountArray[idx++] = acc;
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	// 계좌목록
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록보기");
		System.out.println("---------");

		// 객체 참조타입 배열을 순차적으로 읽으면서 null이 아닐때만 출력.
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.println("계좌번호: " + account.getAno());
				System.out.println("계좌주: " + account.getOwner());
				System.out.println("잔고: " + account.getBalance());

			}
//null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer 오류발생
		}
	}

	// 예금
	private static void deposit() {
		System.out.println("예금");

		String ano = scanner.next();
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null)
			acc.setBalance(acc.getBalance() + amount);
	}

	// 출금
	private static void withdraw() {
		System.out.println("출금");
		String ano = scanner.next();
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
			}
		}
	}

	// Account 배열에서 ano 와 동일한 Account객체 찾기
	// 참조타입 배열의 값 비교
	private static Account findAccount(String ano) {
		Account account = null;
		// 무언가 추가되어야 오류가 발생안함
		for (int i = 0; i < accountArray.length; i++) {
			account = accountArray[i];
			if (account != null) {
				if (account.getAno().equals(ano))
					return account;
			}
		}
		return account;
	}
}
