package whileExam;

public class Account {
	// ÇÊµå
	static final String bankNo = "111";
	static int seq = 0;
	private String ano;
	private String owner;
	private int balance;

	{
		seq++;
		ano = bankNo + "-" + seq + seq + seq;
	}
}