package Today0930;

public class ArrayCopyExam {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		// [null][null][null][null][null]
		// for (int i = 0; i < oldStrArray.length; i++)
		// newStrArray[i] = oldStrArray[i];
		// ["java"]["java"]["java"]["java"]["java"]

		// System.arrayCopy()
		// arrayCopy(�ҽ�, �ҽ��� ����index, Ÿ��, Ÿ���� ���� index, ������ ����)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		//
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		// SystemC.arrayCopy()
		//
		System.out.println();
		System.out.println("---------------------------");
		// java.lang.ArrayIndexOutOfBoundsException : �ҽ��� ������ 2���ε� ������ ���̸� 3���� �ϸ� ���� �߻�
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length - 1);
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");

	}

}
