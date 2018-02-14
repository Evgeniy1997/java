package by.gsu.asoilab;

public class BusinessTrip {
	
	 private final int rate = 600;
	 private String account;
	 private int transport;
	 private int days;
	 
	 public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public int getTransport() {
		return transport;
	}
	
	public void setTransport(int transport) {
		this.transport = transport;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public BusinessTrip(String account, int transport, int days) {
		super();
		this.account = account;
		this.transport = transport;
		this.days = days;
	}
	
	public BusinessTrip() {
		super();
	}
	 
	
	public int getTotal(){
		return transport + rate*days;
	}
		
		public String toString(){
			return rate/100+","+rate%100+";"+account+";"+transport/100+"."+transport%100+";"+days+";"+getTotal()/100+"."+getTotal()%100;
		}

		
		public void show(){
			System.out.println("rate = "+rate/100+"."+rate%100);
			System.out.println("Account = "+ account);
			System.out.println("transport = "+transport/100+"."+transport%100);
			System.out.println("days = "+ days);
			System.out.println("total = "+getTotal()/100+"."+getTotal()%100);
		}

}
