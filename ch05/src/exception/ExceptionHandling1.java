package exception;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		try { // 에러가 뜰 수 있는 부분에 try ~ catch
			int[] num = new int[2];

			num[0] = 1;
			num[1] = 2;
			num[2] = 3;

			System.out.println("1, 2, 3 저장");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");   // 에러 나면
		}
		System.out.println("Done"); // 성공적으로 실행 시
	}


}


