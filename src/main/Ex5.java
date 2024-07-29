package main;

public class Ex5 {
	
	public static void main(String[] args) {
		
		int [] arr = new int [5];
		
		try {
			
			arr[5] = 5;
			
		} catch (ClassCastException e) {
			System.out.println(e);			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {	//Exception 형 매개변수를 사용하면, 모든 에러를 처리할 수 있음. 
												//Exception e = new ArrayIndexOutOfBoundsException
			System.out.println(e);
		}
		System.out.println("마지막 문장을 정상적으로 종료합니다");
		
	}

}
