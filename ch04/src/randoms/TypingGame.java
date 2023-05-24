package randoms;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		String words[] = {"dog", "cat", "monkey", "orange", "apple", "chicken",
				"banana", "onion", "lion", "giraffe", "horse"};

		int n = 1;
		double start, end;
		Scanner scan = new Scanner(System.in);

		System.out.println("영어타자 게임, 준비되면 엔터!");
		scan.nextLine();
		start = System.currentTimeMillis();  //게임 시작 시간측정
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);
			String question = words[rand];
			System.out.println(question);   //화면에 문제 표시
			
			String answer = scan.nextLine();
			if(answer.equals(question)) {  //대답과 질문이 같으면
				System.out.println("통과!");  // 통과
				n++;
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();   //게임종료 시간 측정
		System.out.printf("게임 소요 시간은 %.2f초입니다.", (end-start)/1000);
		scan.close();
	}
}
	
