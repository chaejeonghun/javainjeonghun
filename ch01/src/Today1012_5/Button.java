package Today1012_5;

public class Button {
	// 필드사용
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
