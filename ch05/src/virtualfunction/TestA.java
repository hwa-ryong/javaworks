package virtualfunction;

public class TestA {

	int num;

	void aaa() {
		System.out.println("aaa()출력 ");
	}

	public static void main(String[] args) {
		//인스턴스(객체) = 힙 메모리
		//메서드 - 정적 영역(데이터 영역) - static
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();

		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();

	}

}
