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
		// arrayCopy(소스, 소스의 시작index, 타겟, 타겟의 시작 index, 복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		//
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		// SystemC.arrayCopy()
		//
		System.out.println();
		System.out.println("---------------------------");
		// java.lang.ArrayIndexOutOfBoundsException : 소스의 갯수가 2개인데 복사할 길이를 3으로 하면 오류 발생
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length - 1);
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");

	}

}
