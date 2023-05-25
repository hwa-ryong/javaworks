package inheritance.airplane;

public class AirPlaneMain {

	public static void main(String[] args) {
		//SuperSonicAirPlane 객체 생성
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		// 이륙
	      sa.takeOff();
	      sa.fly();
	      
	      // 초음속 비행
	      sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
	      sa.fly();
	      
	      // 일반 비행
	      sa.flyMode = SuperSonicAirPlane.NORMAL;
	      sa.fly();
	      
	      // 착륙
	      sa.land();
	   
	      System.out.println();
	}

}
