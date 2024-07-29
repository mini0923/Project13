package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz4 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우너", 25, 70);
		
		List<Customer> list = new ArrayList<>();
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		System.out.println("==고객 명단=="); 
		
		list.stream()
							.forEach(s -> System.out.println(s.name));
		
		int result = list.stream()
												.mapToInt(s -> s.budget)
												.sum();
		System.out.println("총 여행 비용: "+result);
		
		System.out.println("== 20세 이상 고객 명단 ==");
		
		list.stream()
							.filter(c -> c.age >= 20)
//							.sorted(Comparator.comparing(c -> c.age))
							.sorted((c1, c2) -> {
								if(c1.age > c2.age) {
									return 1;
								} else {
									return -1;
								}
							})
							.forEach(c ->System.out.println(c.name + " , " + c.age));
		
		
		}
}

class Customer {
	String name;	// 이름
	int age;			// 나이
	int budget;		// 여행비용



	// 생성자 생성
	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}


}
