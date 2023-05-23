package arraylist.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student oh = new Student(1001, "화룡");
		Student ahn = new Student(1002, "재훈");
		
		
		oh.koreanSubject("국어", 80);
		oh.mathSubject("수학", 90);
		
		ahn.koreanSubject("국어", 100);
		ahn.mathSubject("수학", 100);
		
		oh.showInfo();
		ahn.showInfo();

	}

}
