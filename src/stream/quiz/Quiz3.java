package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz3 {

	public static void main(String[] args) {

		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		System.out.println("1번"); 
		
		list.stream()
							.map(t -> t.orderNo)
							.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		System.out.println("2번");
		
	
		
		int result = list.stream()
							.filter(s -> s.year ==2022)
							.mapToInt(s -> s.price)
							.sum();
		
		long result2 = list.stream()
							.filter(s -> s.year ==2022)
							.mapToInt(s -> s.price)
							.count();
		
		
		System.out.println("총금액 : "+result + " , 거래건수 : " + result2 );
		
		System.out.println("3번");
		
		
		int result3 = list.stream()
				.filter(s -> s.year ==2023)
				.mapToInt(s -> s.price)
				.sum();

		long result4 = list.stream()
					.filter(s -> s.year ==2023)
					.map(s -> s.price)
					.count();
					
		System.out.println("총금액 : "+result3 + " , 거래건수 : " + result4 );

		
		
		
		
	}

}

class Order {
	
	int orderNo ;	// 주문번호
	int year;			// 주문 연도
	int price;			// 거래금액(만원단위)
	
	// 생성자 생성
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoppingMall [orderNo=" + orderNo + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
}