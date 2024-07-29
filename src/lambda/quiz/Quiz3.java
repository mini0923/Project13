package lambda.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 구현 클래스
		StringConverter stringConverter1 = new StringConverterIpml();
		System.out.println(stringConverter1.convert("Hello world"));

		// 익명 클래스
		StringConverter stringConverter2 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		System.out.println(stringConverter2.convert("Hello world"));
		
		// 람다식
		StringConverter stringConverter3 = (s) -> s.toUpperCase();
		System.out.println(stringConverter3.convert("Hello world"));
		
	}
	
}


// 함수형 인터페이스 선언
interface StringConverter {
	
		// 문자열을 대문자로 변환해서 반환하는 함수
		String convert (String s);
}

class StringConverterIpml implements StringConverter {

	@Override
	public String convert(String s) {
		
		return s.toUpperCase();
		
	}
	
}




