package by.gsu.pms;
import by.gsu.pms.Employee;

public class Chief extends Employee {
	
	private String nameManufactory;
	private int amount;
	
	
	public Chief(String nameManufactory, int amount) {
		super();
		this.nameManufactory = nameManufactory;
		this.amount = 0;
	}
	
	public Chief(String name, String gender, int workExperience, int salary, String dateBirthday,
			int taxes, String nameManufactory, int amount) {
		super(name, gender, workExperience, salary, dateBirthday, taxes);
		this.nameManufactory = nameManufactory;
		this.amount = amount;
	}
	
	public Chief(String name, String gender, int workExperience, int salary, String dateBirthday, int taxes) {
		super(name, gender, workExperience, salary, dateBirthday, taxes);
		this.nameManufactory = nameManufactory;
		this.amount = 0;
	}
	
	
	public String getNameManufactory() {
		return nameManufactory;
	}
	public void setNameManufactory(String nameManufactory) {
		this.nameManufactory = nameManufactory;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String fieldsToString() {
		return super.fieldsToString()+"; "+"nameManuf: "+nameManufactory+"; "+"amount: "+amount+";\n";
	}

	public String writeInfo() {
		return "Chief: \n";
	}

	public String toString() {
		return writeInfo()+fieldsToString();
	}
	
}
