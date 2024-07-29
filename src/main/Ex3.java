package main;

public class Ex3 {

	public static void main(String[] args) {

		
		int [] arr = new int[5];
		
		try {
			arr[1] = 5; 	// 예외가 발생할 가능성이 있는 코드			
			
			// 에러가 발생 되었을 때 에러 객체를 매개변수로 받는다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // 예외가 발생하면 처리할 코드 작성
		}
		
		// 에러가 나도 마지막 문장이 실행된다.
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
//		finally {
//			arr[1] = 5;
//			System.out.println("고쳤습니다");
//		}
		
		
		
		
	}

}
