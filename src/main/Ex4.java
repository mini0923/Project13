package main;

public class Ex4 {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
		try {
			arr[5] = 5; 	//ArrayIndexOutOfBoundsException 에러 발생
			
		} catch (ClassCastException e) {	// 일치하는 catch문이 없어 예외처리가 안된다.
			System.out.println(e);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		
	}
	
}
