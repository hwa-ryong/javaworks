package arrays;

public class ArrayCalc {

	public static void main(String[] args) {
		// 배열의 총점과 평균
		// 90, 70, 85, 60 입력
		int[] score = new int[4];
		
		score[0] = 90;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;
		
		// 총점 계산
		int total = 0;
		
		for (int i = 0; i < score.length; i++) {
			total += score[i]; 
		}
		
		
		System.out.println("총점 : " + total);
	}

}
