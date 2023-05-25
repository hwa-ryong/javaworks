package transport;

public class Main {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("조혜원", 10000);
		Person p2 = new Person("안민상", 20000);
		Person p3 = new Person("화룡" , 30000);
		
		
		//버스 객체 생성
		Bus bus740 = new Bus("버스 740번");
		Taxi taxi7601 = new Taxi("모범택시");
		
		
		p1.take(bus740,  1300);
		p2.take(bus740, 1000);
		p3.take(taxi7601, 10000);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
		bus740.showInfo();
		taxi7601.showInfo();
	}

}
