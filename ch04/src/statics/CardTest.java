package statics;

public class CardTest {

	public static void main(String[] args) {
		// 카드 번호 101, 102, 103번 생성
		Card Queen = new Card();
		Card King = new Card();
		Card Jack = new Card();
		
		System.out.println("퀸: " + Queen.getCardNum());
		System.out.println("킹: " + King.getCardNum());
		System.out.println("잭: " + Jack.getCardNum());
		
		System.out.println(Queen);
		System.out.println(King);
		System.out.println(Jack);
	}

}
