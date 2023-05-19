package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;  // 상태 변수
		int[] scores = null;
		
		while(run) {
			try{
				System.out.println("--------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("--------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = Integer.parseInt(sc.nextLine());
				
				if(selectNo == 1) {
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
			   }
				else if(selectNo == 2) {
					if(scores == null) {
						System.out.println("1번을 먼저 입력하세요.");
					}else {
						
						for(int i=0; i<scores.length; i++) {
							System.out.print("scores[" + i + "]>");
							scores[i] = Integer.parseInt(sc.nextLine());
						}
					}
			   }
				else if(selectNo == 3) {
					if(scores == null) {
						System.out.println("1번을 먼저 입력하세요.");
					}else {
						for(int i=0; i<scores.length; i++) {
							System.out.println("scores[" + i + "]>" + scores[i]);
						}
				    }
			   }
			    else if(selectNo == 4) {
				   // 분석 - 총점, 평균, 최고점수
			    	if(scores != null) {
					   int sumV = 0;
					   double avg = 0;
					   int maxV = scores[0];
					   
					   for(int i=0; i<scores.length; i++) {
						   sumV += scores[i];   //누적 합계
						   if(maxV < scores[i])  // 다음 점수가 최대값보다 크면
							   maxV = scores[i];  // 점수를 최대값으로 설정
					   }
					   avg = (double)sumV / scores.length;
					   
					   System.out.println("총점 : " + sumV);
					   System.out.println("평균 점수 : " + avg);
					   System.out.println("최고 점수 : " + maxV);
			   }else {
				   System.out.println("1번을 먼저 선택해주세요.");
			   }}
				else if(selectNo == 5) {
					if(scores == null) {
						System.out.println("지원되지 않는 메뉴입니다. 다시 선택해 주세요");
					}else {
						run = false;
							System.out.println("프로그램을 종료합니다.");
						}
					}
			   }catch(Exception e) {
				   		System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요");
			   		}//try~castch 끝
				}//while 끝	
			}
		}
   





