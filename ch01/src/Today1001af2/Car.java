package Today1001af2;

public class Car {

	String model;
	String color;
	int maxSpeed;

	// ������
	// Ŭ������ (�Ű�����1, �Ű�����2, �Ű�����3){}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}

/*
 * �����Ͻ� Car (�Ű�����1, �Ű�����2, .... ){} �����ڰ� �����ϹǷ� Ŭ���� ���Ͽ� �⺻ ������ �߰� x public class
 * Car{ X-> Car (){} �⺻������ �߰� x String model; String color; int maxSpeed;
 * Car(String model, String color, int maxSpeed){ this. this.model=model;
 * this.color=color; this.maxSpeed=maxSpeed; } }
 */