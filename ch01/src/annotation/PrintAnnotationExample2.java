package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample2 {
	// 메소드 정보 얻기 - reflection
	public static void main(String[] args) {
		Method[] declareMethods = Service.class.getDeclaredMethods();
		Constructor[] cons = Service.class.getConstructors();
		Field[] feilds = Service.class.getFields();

		for (Method method : declareMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

			for (int i = 0; i < printAnnotation.number(); i++)
				System.out.println(printAnnotation.value());
			System.out.println();
		}
	}

}
