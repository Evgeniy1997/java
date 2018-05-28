import java.util.Arrays;
import java.util.Scanner;

import by.gsu.pms.ComparatorInt;
import by.gsu.pms.ComparatorString;
import by.gsu.pms.Stock;
import by.gsu.pms.Serelizator;

public class Runner {

	private static String name;
	private static int cost;
	private static boolean presence;

	public static void main(String[] args) throws Exception {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = input.nextInt();
		Stock products[] = new Stock[num];
		for(int i=0; i<num;i++) {
			System.out.println("Enter the name: ");
			String name = input.next();
			System.out.println("Enter the cost: ");
			int cost = input.nextInt();
			System.out.println("Enter the presence: ");
			boolean presence = input.nextBoolean();
			products[i] = new Stock(name, cost, presence);
		}


		input.close();
		
		Serelizator.serialize(products);
		products = Serelizator.deSerialize();
		
				System.out.println("\n");
				
				for (int i = 0; i < products.length; i++) {
					System.out.println(products[i]);
				}
		
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

		int quantity = 0;

		for (Stock stock : products) {
			if (stock.getPresence() == true) {
				++quantity;
			}
		}
		
		System.out.println("\nQuantity in stock " + quantity +"\n");

		int summCost = 0;
		for (final Stock stock : products) {
			summCost += stock.getCost();

		}
		System.out.println("total cost = " + summCost);
	}

}