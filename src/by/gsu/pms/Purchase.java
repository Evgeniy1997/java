package by.gsu.pms;
import by.gsu.pms.WeekDays;

public class Purchase implements Comparable<Purchase> {
	
	public final static int price = 1477; 
	public final static String name = "PULLOVER";
	private int num;
	private WeekDays day;
	
	public Purchase(WeekDays day, int num) {
		super();
		this.num = num;
		this.day = day;
	}
	
	public Purchase(){
		super();
	}
	
	public int getNum(){
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public WeekDays getDay() {
		return day;
	}
	public void setDay(WeekDays day) {
		this.day = day;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCost() {
		return price*num;
	}
	
	public String toString(){
		return name+"; "+Conversion.convert(price, 100, 2)+"; "+Conversion.convert(num, 100, 2)+"; "+day+";";
	}

	public int compareTo(Purchase Purchase) {
		return (this.getCost()-Purchase.getCost());
	}


}

