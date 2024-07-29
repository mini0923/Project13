package lambda.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		MyNumber myNumber1 = new MyNumberImpl() ;
		System.out.println("구현 클래스 : "+myNumber1.max(10, 20));
			
		
		// 익명 클래스
		MyNumber myNumber2 = new MyNumber() {
			@Override
			public int max(int x, int y) {
				return  x > y ? x : y;
			}
		};
		System.out.println("익명 클래스 : "+myNumber2.max(50, 10));
		
		// 람다식 구현
		MyNumber myNumber3 = (x , y) -> x > y ? x : y;
		System.out.println("람다식 : "+myNumber3.max(52, 10));
		
	}
	
}

@FunctionalInterface
interface MyNumber {	
	int max(int x, int y);
}

class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}	
}
