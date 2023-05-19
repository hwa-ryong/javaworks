package taketrans;

public class Person {
	
	String name;
	int age;
	int money;
	
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타는 기능을 하는 메서드
	void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
	}
	
	// 지하철을 타다
	void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -= 1250;
	}
	
	//사람의 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다\n",
				name, money);
	}
	
}
