package by.gsu.pms;

public class Worker extends Employee {

	private int numberManufactory;
	private int rank;
	
	
	public Worker(int numberManufactory, int rank) {
		super();
		this.numberManufactory = 0;
		this.rank = 0;
	}
	
	public Worker(String name, String gender, int workExperience, int salary, String dateBirthday,
			int taxes, int numberManufactory, int rank) {
		super(name, gender, workExperience, salary, dateBirthday, taxes);
		this.numberManufactory = numberManufactory;
		this.rank = rank;
	}
	
	public Worker(String name, String gender, int workExperience, int salary, String dateBirthday, int taxes) {
		super(name, gender, workExperience, salary, dateBirthday, taxes);
		this.numberManufactory = 0;
		this.rank = 0;
	}
	
	public int getNumber() {
		return numberManufactory;
	}
	public void setNumber(int numberManufactory) {
		this.numberManufactory = numberManufactory;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String fieldsToString() {
		return super.fieldsToString()+"; "+"numManuf: "+numberManufactory+"; "+"rank: "+rank+";\n";
	}

	public void Write() {
		System.out.println("Worker:\n"+fieldsToString());
	}

}
