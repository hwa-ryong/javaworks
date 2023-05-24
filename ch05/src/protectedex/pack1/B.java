package protectedex.pack1;

public class B {

	public static void main(String[] args) {
		// 같은 패키지에서는 protected 접근제한자 허용 됨
		A a = new A();
		a.filed = "ok";
		a.method();
	}
}
