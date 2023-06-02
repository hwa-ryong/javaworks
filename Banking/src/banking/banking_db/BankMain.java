package banking.banking_db;

import java.util.Scanner;

public class BankMain {
	

	public static void main(String[] args) {
		
		AccountDAO dao = new AccountDAO();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) { //while 괄호 안에 무조건 뭐가 있어야함
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 | 6.삭제");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			
			//메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine()); // 문자형을 숫자형으로 변환
			
			if(selectNo == 1) {
				dao.createAccount();
			}else if(selectNo == 2) {  //계좌 목록
				dao.getAccountList();
			}else if(selectNo == 3) {  // 예금
				dao.deposit();   
			}else if(selectNo == 4) {  // 출금
				dao.withdraw();   
			}else if(selectNo == 5) {  // 종료
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else if(selectNo == 6) {  // 삭제
				dao.delete();  
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		}//while() 끝
		scanner.close();
	}//main() 끝
	
}//Main 클래스 끝





















