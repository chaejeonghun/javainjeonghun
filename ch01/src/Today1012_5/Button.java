package Today1012_5;

public class Button {
	// �ʵ���
	OnclickListener listener;

	public void setOnClickLitstener(OnclickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnclickListener {
		void onClick();
	}
}
