package Today1012;

public interface C extends InterfaceB, InterfaceA {
	void methodC();
}

class CA implements C {
	@Override
	public void methodA() {

	}

	@Override
	public void methodB() {

	}

	@Override
	public void methodC() {

	}
}