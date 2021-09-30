package Enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// ����Ÿ�� ���� ����
		Week today = null;
		// Ķ���� Ÿ���� ���� ����, Ķ���� Ÿ�� ��ü ���� (Ŭ������.getInstance())����
		Calendar cal = Calendar.getInstance(); // Ķ���� ��ü ����
		int week = cal.get(Calendar.DAY_OF_WEEK); // get(������ ���ϰ� : Calendar.DAY_OF_WEEK);
		System.out.println(week);

		// Calendar�� ���� ���� ���� ���� ���� ���� ���� ���
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;

		}
		System.out.println("������ :" + today);
		// String + ���Ż�� => String

		// ���� ��� ��
		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
	}

}
