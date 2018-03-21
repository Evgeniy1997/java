
import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

import by.gsu.pms.Conversion;
import by.gsu.pms.Purchase;
import by.gsu.pms.WeekDays;


public class Runner {

	public static void main(String[] args) {
		
		Purchase[] pur = new Purchase[] {
				new Purchase(WeekDays.MONDAY, 9),
				new Purchase(WeekDays.SATURDAY, 13),
				new Purchase(WeekDays.WEDNESDAY, 18),
				new Purchase(WeekDays.TUESDAY, 120),
				new Purchase(WeekDays.THURSDAY, 99)
		};
		
		System.out.println("Вывод массива:");
		for(int i=0; i<pur.length;i++){
			System.out.println(pur[i]);
		}
		
		int res=0;
		for(int i=0;i<pur.length;i++){
			if(pur[i].getDay().equals(WeekDays.MONDAY)){
				 res += pur[i].getCost();
			}
		}
		
		System.out.println("\nОбщая сумма покупок в понедельник: "+Conversion.convert(res, 100, 2)+"\n");

		int totalCost=0;
		for(int i=0;i<pur.length;i++){
			totalCost += pur[i].getCost();
			}
		
		int cost = totalCost/pur.length;
		System.out.println("Средняя стоимость всех покупок " + Conversion.convert(cost, 100, 2)+ "\n");
		
		Purchase purchasemax = pur[1];
		for (Purchase purchase1 : pur) {
			if(purchasemax.getCost() < purchase1.getCost()) {
				purchasemax = purchase1;
		};
	}
		System.out.println("День максимальной затраты на покупки: " + purchasemax +"\n");
		System.out.println("Отсортированный массив:");
		
		Arrays.sort(pur);
		for(int i=0; i<pur.length;i++){
			System.out.println(pur[i]);
}
	}	

}
