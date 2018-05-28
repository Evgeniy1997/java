package by.gsu.pms;

import java.util.Comparator;

public class ComparatorInt implements Comparator <Stock> {

	public ComparatorInt(){
		super();
	}
	
	public int compare(Stock arg0, Stock arg1){
		
		return (int)(arg0.getCost() - arg1.getCost());
	}

}
