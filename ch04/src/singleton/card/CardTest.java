package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		CardCompany card = CardCompany.getInstance();
		
		Card king = card.createCard();
		Card jack = card.createCard();
		Card queen = card.createCard();
		
		System.out.println("카드번호: " + king.getCardNum());
		System.out.println("카드번호: " + jack.getCardNum());
		System.out.println("카드번호: " + queen.getCardNum());

	}

}
