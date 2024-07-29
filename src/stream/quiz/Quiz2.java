package stream.quiz;

import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {
		String[] arr = {"file1.txt" , "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};
		
		Stream<String> stream1 = Stream.of(arr);
		System.out.println("1번");
				stream1.filter(s -> s.contains(".txt")).
				forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		System.out.println("2번");
		
		Stream<String> stream2 = Stream.of(arr);
				System.out.println("txt 파일의 개수 : " + stream2.filter(s -> s.contains(".txt")).count());
				
		Stream<String> stream3 = Stream.of(arr);
				System.out.println("pdf 파일의 개수 : "+stream3.filter(n -> n.contains(".pdf")).count());
		
		Stream<String> stream4 = Stream.of(arr);
				System.out.println("img파일의 개수 : "+stream4.filter(q -> q.contains(".img")).count());
				
		System.out.println("3번");
		Stream<String> stream5 = Stream.of(arr);
			stream5
			.map(s-> s.substring(s.indexOf(".")+1))
			.distinct()
		    .forEach(s -> System.out.print(s + " "));		
			
			
	}
}
