package ifexample;

public class Switchcase1 {

	public static void main(String[] args) {
		// switch ~ case 문
		// 순위에 따른 색상 출력
		int rank = 4;
		//char medalColor = ' ';  // 공백 문자로 초기화
		String medalColor = "Silver";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "None";
			//System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("메달 색깔은 " + medalColor + "입니다.");
	}

}
