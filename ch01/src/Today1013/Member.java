package Today1013;

public class Member {
	int sno;

	public Member(int sno) {
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 동일 타입이면
		if (obj instanceof Member) { // 2.필드값 끼리비교
			return this.sno == ((Member) obj).sno; // 3.필드값끼리 비교결과
		}
		return false;
	}
}