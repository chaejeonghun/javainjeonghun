package ExtemdsClass;

//�����ڴ� ��ӿ��� ���ܵ�.
public class GrandParent {

	public GrandParent() {
		System.out.println("�ֻ��� �θ�����ڴ� ���� ���߿� ȣ�������, ������ ���� ���� �ȴ�.");
	}

}

//��ӵ� Ŭ������ �����Ͻ� �ڽĻ����ڿ� super()�޼ҵ尡 �ڵ� �߰���.
class Parent extends GrandParent {

	public Parent() {
		// super();
		System.out.println("����Ŭ������ ���� ȣ��� �� ����Ŭ������ ȣ��, �ֻ���Ŭ���� ���� �� ����");
	}

}

class Child extends Parent {

	public Child() {
		// super();
		System.out.println("���� ���� ȣ�������, ���� Ŭ���� ������ ����ȴ�.");
	}

}