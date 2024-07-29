package stream.quiz;

import java.util.stream.Stream;

//다음과 같이 리스트를 생성하세요

//String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };

//1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요
//결과: 3

//2.모든 문자열의 길이를 더한 합을 구하세요
//결과: 13

//3.가장 길이가 짧은 문자열의 길이를 구하세요
//결과: 1

//4.중복을 제거한 리스트를 만드세요.
//결과: [aaa, b, ccccc]

public class Quiz1 {

	public static void main(String[] args) {
		
		String[] arr = {"aaa", "aaa", "b", "b" , "ccccc"};
		
		Stream<String> stream1 = Stream.of(arr);
		
		long result1 = stream1.filter(s -> s.length() > 2).count();
		
		System.out.println( "1번 "+result1);
					
		Stream<String> stream2 = Stream.of(arr);
		
		int result2 = stream2
												.mapToInt(n ->n.length())
												.sum();

		System.out.println("2번 : " + result2);
		
		
		Stream<String> stream3 = Stream.of(arr);
		
		int result3 = stream3
											.mapToInt(n ->n.length())
											.min()
											.getAsInt();
		
		System.out.println("3번 : " + result3);
		
		
		System.out.print("4번 : ");
		Stream<String> stream4 = Stream.of(arr);
		
		stream4
					.distinct()
					.forEach(n -> System.out.print(n + " "));

		
		
		
	}

}
