package inheritance.car;

class Taxi extends Car{
	int passengerCount;   // 승객수
	
	Taxi(String brand, int cc, int passengerCount){
		super(brand, cc);  //부모 필드 상속
		this.passengerCount = passengerCount;
	}
	
	@Override  //오버라이드 - 재정의
	String carInfo() {
		return super.carInfo() + ", 승객수: " + passengerCount;
	}
}


public class TaxiTest {

	public static void main(String[] args) {
		// Taxi 클래스 객체 생성
		Taxi taxi = new Taxi("Ionic 5", 3000, 1);
		
		System.out.println(taxi.carInfo());

	}

}
