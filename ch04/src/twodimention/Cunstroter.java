package twodimention;

public class Cunstroter {
	public Cunstroter(String ano, String owner, int balance) {// 매개변수가 있는 생성자
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
		System.out.println(ano);
	}

	public String ano;    //계좌 번호
	public String owner;  //계좌주
	public int balance;
	
	public Cunstroter() {//기본생자
		System.out.println("난는 생성되었다");
	}
	

	
}
