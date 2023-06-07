package strings;

public class StringCharAt {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(1);
		System.out.println(charValue);
		
		//주민번호에서 남여 구분
		String ssn = "940815-2234567";
		char gender = ssn.charAt(7);  // '1'
		switch (gender) {
		case '1' : case '3' :
			System.out.println("남자입니다."); break;
		case '2' :
		case '4' :
			System.out.println("여자입니다."); break;
		}

	}

}
