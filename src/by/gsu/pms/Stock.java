package by.gsu.pms;
import java.io.Serializable;

public class Stock implements Serializable {
	
	private String name;
	private int cost;
	private boolean presence;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public boolean getPresence() {
		return presence;
	}
	public void setPresence(boolean presence) {
		this.presence = presence;
	}
	
	public Stock() {
		super();
	}
	
	public Stock(String name, int cost, boolean presence) {
		super();
		this.name = name;
		this.cost = cost;
		this.presence = presence;
	}
	
	public String toString() {
		return "Stock: name = " + name + ", cost = " + cost + ", presence = "
				+ presence;
	}

		
}
