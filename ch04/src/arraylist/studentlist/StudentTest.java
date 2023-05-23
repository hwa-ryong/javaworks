package arraylist.studentlist;

public class StudentTest {

	public static void main(String[] args) {
		//학생 객체 생성
		Student s1 = new Student(1001, "이양파");
		
		s1.addSubject("국어", 100);
		s1.addSubject("수학", 100);
		s1.addSubject("과학", 100);
		
		s1.showInfo();

	}

}
