package Today1001af2;

public class Car {

	String model;
	String color;
	int maxSpeed;

	// 생성자
	// 클래스명 (매개변수1, 매개변수2, 매개변수3){}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}

/*
 * 컴파일시 Car (매개변수1, 매개변수2, .... ){} 생성자가 존재하므로 클래스 파일에 기본 생성자 추가 x public class
 * Car{ X-> Car (){} 기본생성자 추가 x String model; String color; int maxSpeed;
 * Car(String model, String color, int maxSpeed){ this. this.model=model;
 * this.color=color; this.maxSpeed=maxSpeed; } }
 */