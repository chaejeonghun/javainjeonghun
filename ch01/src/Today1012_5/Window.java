package Today1012_5;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();

	Button.OnclickListener listener = new Button.OnclickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};

	Window() {
		button1.setOnClickLitstener(listener);

	}
}
