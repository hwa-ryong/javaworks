package banking.bankarraylist;

import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;

public class BankArrayList {
	// 통장 계좌를 만들 객체 배열 100개 생성
	static ArrayList<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) { //while 괄호 안에 무조건 뭐가 있어야함
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			//메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine()); // 문자형을 숫자형으로 변환
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {  //계좌 목록
				getAccountList();
			}else if(selectNo == 3) {  // 예금
				deposit();   
			}else if(selectNo == 4) {  // 출금
				withdraw();   
			}else if(selectNo == 5) {  // 종료
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		}//while() 끝
		
	}//main() 끝
	
	

	//계좌를 생성하는 함수
		private static void createAccount() {
			System.out.println("-----------------------------------------");
			System.out.println("계좌생성");
			System.out.println("-----------------------------------------");
			
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
	
			System.out.print("계좌주:  ");
			String owner = scanner.nextLine();
	
			System.out.print("초기입금액:  ");
			int balance = Integer.parseInt(scanner.nextLine());
	
			Account account = new Account(ano, owner, balance);
			accountList.add(account);
			System.out.println("결과: 계좌가 생성되었습니다.");
			
		
			}
		
	
	


	//계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.println("잔액: " + account.getBalance());
			
		}
			
    }
	
	//계좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-----------------------------------------");
		System.out.println("예금");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) {  //찾는 계좌가 있다면
				System.out.print("입금액:  ");  // 입금함
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = findAccount(ano);
				//예금 = 잔고 + 예금액
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리 되었습니다.");
				break; // 입금 처리후 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}

	}


	//계좌에서 출금하는 메서드
	private static void withdraw() {
		System.out.println("-----------------------------------------");
		System.out.println("출금");
		System.out.println("-----------------------------------------");
		
		
		System.out.print("계좌번호:  ");
		String ano = scanner.nextLine();
		
		while(true) {
			System.out.print("출금액:  ");
			int money = Integer.parseInt(scanner.nextLine());

			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)

				//출금 = 잔고 - 예금액
				Account account = findAccount(ano);
				if(account.getBalance() < money) {
					System.out.println("잔액이 부족합니다. 다시 입력해 주세요");

				}else {
					account.setBalance(account.getBalance() - money);
					System.out.println("결과: 정상 처리 되었습니다.");
					break;
				}
		}
		   else{
			System.out.println("결과: 계좌가 없습니다.");
		}
	}

}
	//계좌를 검색하는 메서드
	private static Account findAccount(String ano) {
		Account account = null;   //빈 계좌 계정을 할당

		for(int i=0; i<accountList.size(); i++) {
			String dbAno = accountList.get(i).getAno(); // 이미 리스트에 저장된 계좌번호
			if(dbAno.equals(ano)) {
				account = accountList.get(i); //계좌 객체 저장
				break;
			}
		}
		return account;
	}



}//Main 클래스 끝





















