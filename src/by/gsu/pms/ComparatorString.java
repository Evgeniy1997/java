package by.gsu.pms;

import java.util.Comparator;

public class ComparatorString implements Comparator<Stock> {

	public ComparatorString() {
		super();
	}

	public int compare(Stock arg0, Stock arg1) {

		return  arg0.getName().compareTo(arg1.getName()) ;
	}

}
