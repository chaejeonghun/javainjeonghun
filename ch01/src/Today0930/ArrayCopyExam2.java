package Today0930;

import java.util.Arrays;

public class ArrayCopyExam2 {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// deep copy
		// ArraysŬ������ copyOf(�ҽ��迭,�����ұ���) => ���ο� �迭 ��ü ����:int
		String[] arr2 = Arrays.copyOf(oldStrArray, oldStrArray.length);
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		System.out.println();
		arr2[0] = "hi";
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		for (int i = 0; i < oldStrArray.length; i++)
			System.out.print(oldStrArray[i] + " ");

	}

}
