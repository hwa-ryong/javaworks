package ifexample;

public class IfOperator {

	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램 - if문
		int num1 = 10;
		int num2 = 3;
		char operator = '-';
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
	    }
		else if(operator == '/') {
			result = num1 / num2;
        }
		else{
			System.out.println("연산자 오류입니다.");
			return;
        }
		System.out.println("결과 값은 " + result + "입니다." );
}
}