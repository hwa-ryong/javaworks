package hiding;

public class Account {
	//멤버변수, 생성자, 메서드
	private String ano;   // 계좌 번호
	private String owner; // 계좌주
	private int balance;  // 잔고
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

}
