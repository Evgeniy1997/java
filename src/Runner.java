import java.util.Arrays;
import by.gsu.pms.ComparatorInt;
import by.gsu.pms.ComparatorString;
import by.gsu.pms.Stock;

public class Runner {

	public static void main(String[] args) {
		
		final Stock[] products = new Stock[10];
				
				products[0] = new Stock("Pullover", 45, true);
				products[1] = new Stock("Shirt", 23, false);
				products[2] = new Stock("Geans", 77, true);
				products[3] = new Stock("Cap", 12, false);
				products[4] = new Stock("Shorts", 15, true);
				products[5] = new Stock("Sneakers", 90, false);
				products[6] = new Stock("Jacket", 50, true);
				products[7] = new Stock("Scarf", 25, true);
				products[8] = new Stock("Gloves", 19, false);
				products[9] = new Stock("Pants", 30, false);

		
		System.out.println("Вывод массива:");
		for (Stock stock : products) {
			System.out.println(stock);
		};
		
		System.out.println("\nСортировка по цене");
		
		Arrays.sort(products, new ComparatorInt());
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("\nСортировка по названию");
		
		Arrays.sort(products, new ComparatorString());
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		
		int summCost = 0;
		int col = 0;

		for (final Stock stock : products) {
			if (stock.getPresence() == true) {
				summCost += stock.getCost();
				++col;
			}
		}
		
		System.out.println("\nКоличество товара на складе: " +col);
		System.out.println("\nОбщая стоимость товара: " +summCost);
		
		
		
	}
}
