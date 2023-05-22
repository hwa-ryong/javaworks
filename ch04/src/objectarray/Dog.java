package objectarray;

public class Dog {
	private String dogName;
	private String type;
	
	public Dog() {}	  //기본 생성자
	
	//강아지 이름을 입력하는 메서드
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	//강아지 이름을 가져오는 메서드
	public String getDogName() {
		return dogName;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public  String getType() {
		return type;
	}
}
