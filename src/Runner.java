import java.util.Arrays;
import java.util.Scanner;

import by.gsu.pms.ComparatorInt;
import by.gsu.pms.ComparatorString;
import by.gsu.pms.Stock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = scan.next();
		System.out.println("Enter the cost: ");
		int cost = scan.nextInt();
		System.out.println("Enter the presence: ");
		boolean presence = scan.next() != null;
		scan.close();
		
		Stock stock = new Stock(name, cost, presence);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Stock.txt"));
		out.writeObject(stock);
		out.flush();
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Stock.txt"));
		Stock value = (Stock)in.readObject();
		System.out.println(value.toString());
		in.close();
		
	}
}