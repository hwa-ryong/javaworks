package statics;

public class Student {
	static int serialNum = 1000;
	int studentId;    //학번
	String name;      //이름
	
	Student(){    //기본 생성자
		serialNum++;   //serialNum을 1씩 증가시킴
		studentId = serialNum;  // 증가된 번호를 학번에 넣는다
	}   
	
	//get(), set()
	int getStudentId() {
		return studentId;
	}
	
	void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	//get(), set()
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}
