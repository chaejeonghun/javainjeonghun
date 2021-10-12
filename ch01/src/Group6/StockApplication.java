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
			System.out.println("1.��ǰ��� | 2.��ǰ���� | 3.��ǰ��� | 4.��ǰ�԰� | 5.��ǰ��� | 6.����");
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
		System.out.println("���α׷� �����մϴ�.");

	}

	private static void addStock() {
		System.out.println("��ǰ���� ������ּ��� :");
		String name = scanner.next();
		System.out.println("��ǰ�ڵ带 �Է����ּ���. :");
		String item = scanner.next();
		System.out.println("��ǰ ������ �Է����ּ���. :");
		int qty = scanner.nextInt();
		Stock sto = new Stock(name, qty);
		stockArray[idx++] = sto;
		System.out.println("���������� ��ǰ�� ��� �Ǿ����ϴ�.");

	}

	private static void deleteStock() {
		System.out.println("������ ��ǰ���� �Է����ֽʽÿ�.");
		String name = scanner.next();
		for (int i = 0; i < stockArray.length; i++) {
			Stock sto = stockArray[i];
			if (sto != null)
				if (sto.getName().equals(name)) {
					stockArray[i] = null;
					break;
				}

		}
		System.out.println(name + "��ǰ�� �����Ǿ����ϴ�.");
	}

	private static void stockList() {
		System.out.println("��ǰ ��� ����");
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
		System.out.println("�԰��ų ��ǰ���� �Է����ֽʽÿ�.");
		String name = scanner.next();
		System.out.println("�԰��ų ��ǰ���� �Է����ֽʽÿ�.");
		int amount = scanner.nextInt();
		Stock sto = findStock(name);
		if (sto != null) {
			sto.setQty(sto.getQty() + amount);
		} else
			System.out.println("��ǰ���� Ȯ�� ��Ź�帳�ϴ�.");
	}

	private static void outStock() {
		System.out.println("����ų ��ǰ���� �Է����ֽʽÿ�.");
		String name = scanner.next();
		System.out.println("����ų ��ǰ���� �Է����ֽʽÿ�.");
		int amount = scanner.nextInt();
		Stock sto = findStock(name);
		if (sto != null) {
			if (sto.getQty() - amount >= 0) {
				sto.setQty(sto.getQty() - amount);
				System.out.println(amount + "��ŭ�� ������ ���Ǿ����ϴ�.");
			} else
				System.out.println("��� �����մϴ�.");
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
