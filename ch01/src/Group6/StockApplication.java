package Group6;

import java.util.Scanner;

public class StockApplication {
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.제품등록 | 2.제품삭제 | 3.제품목록 | 4.제품입고 | 5.제품출고 | 6.종료");
			System.out.println("--------------------------------------------------------------------");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				addStock();
				break;
			case 2:
				deleteStock();
				break;
			case 3:
				stockList();
				break;
			case 4:
				inStock();
				break;
			case 5:
				outStock();
				break;
			case 6:
				run = !run;
				break;
			}

		}
		System.out.println("프로그램 종료합니다.");

	}

	private static void addStock() {
		System.out.println("제품명을 등록해주세요 :");
		String name = scanner.next();
		System.out.println("제품코드를 입력해주세요. :");
		String item = scanner.next();
		System.out.println("제품 수량을 입력해주세요. :");
		int qty = scanner.nextInt();
		Stock sto = new Stock(name, qty);
		stockArray[idx++] = sto;
		System.out.println("성공적으로 제품이 등록 되었습니다.");

	}

	private static void deleteStock() {
		System.out.println("제거할 제품명을 입력해주십시오.");
		String name = scanner.next();
		for (int i = 0; i < stockArray.length; i++) {
			Stock sto = stockArray[i];
			if (sto != null)
				if (sto.getName().equals(name)) {
					stockArray[i] = null;
					break;
				}

		}
		System.out.println(name + "제품이 삭제되었습니다.");
	}

	private static void stockList() {
		System.out.println("제품 목록 보기");
		System.out.println("-----------");
		for (int i = 0; i < stockArray.length; i++) {
			Stock stock = stockArray[i];
			if (stock != null) {
				System.out.println(stock.toString());
				System.out.println();
			}

		}
	}

	private static void inStock() {
		System.out.println("입고시킬 제품명을 입력해주십시오.");
		String name = scanner.next();
		System.out.println("입고시킬 제품량을 입력해주십시오.");
		int amount = scanner.nextInt();
		Stock sto = findStock(name);
		if (sto != null) {
			sto.setQty(sto.getQty() + amount);
		} else
			System.out.println("제품명을 확인 부탁드립니다.");
	}

	private static void outStock() {
		System.out.println("출고시킬 제품명을 입력해주십시오.");
		String name = scanner.next();
		System.out.println("출고시킬 제품량을 입력해주십시오.");
		int amount = scanner.nextInt();
		Stock sto = findStock(name);
		if (sto != null) {
			if (sto.getQty() - amount >= 0) {
				sto.setQty(sto.getQty() - amount);
				System.out.println(amount + "만큼의 수량이 출고되었습니다.");
			} else
				System.out.println("재고가 부족합니다.");
		}
	}

	private static Stock findStock(String name) {
		Stock stock = null;
		for (int i = 0; i < stockArray.length; i++) {
			stockArray[i] = stock;
			if (stock != null)
				if (stock.getName().equals(name))
					return stock;
		}
		return stock;
	}
}
