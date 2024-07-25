package innerclass;

// 외부 클래스
class Outer {
	
	private int a = 10;	// 인스턴스 변수
	
	private static int b =20;	// 정적 변수
	
	
	// 인스턴스 내부 클래스
	class InClass {	
			int i1 = a;		// 외부 클래스의 private 멤버도 사용가능
			int i2 = b;
	}
	
	// 정적 내부 클래스
	static class InStaticClass {
//		int i1 = a;		// 정적클래스에서는 인스턴스 변수 사용 불가
		int i2 = b; 	// static 클래스에서는 static 사용 가능
	}
	
	
}
 