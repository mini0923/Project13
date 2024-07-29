package lambda.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 구현 클래스
		Hello hello = new HelloImpl() ;
		hello.helloPoint();
		
		// 익명클래스
		Hello hello2 = new Hello() {
			@Override
			public void helloPoint() {
			System.out.println("안녕하세요 익명클래스입니다.");
			}
		};
			hello2.helloPoint();
		
		//람다식
		Hello hello3 = () -> System.out.println("안녕하세요 람다식입니다.");
		hello3.helloPoint();
		 
		
	}
	
}

interface Hello {
	
	void helloPoint ();
	
}

class HelloImpl implements Hello {

	@Override
	public void helloPoint() {
		System.out.println("안녕하세요 구현클래스입니다.");
	}
	
}