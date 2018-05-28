package by.gsu.pms;

public class Director extends Employee {

private int time;
	
	public Director(int time) {
		super();
		this.time = 0;
	}
	
	public Director(String name, String gender, int workExperience, int salary, String dateBirthday,
			int taxes, int time) {
		super(name, gender, workExperience, salary, dateBirthday, taxes);
		this.time = time;
	}
	
	public Director(String name, String gender, int workExperience, int salary, String dateBirthday, int taxes) {
		super(name, gender, workExperience, salary, dateBirthday, taxes);
		this.time = 0;
	}
	
	
	public String fieldsToString() {
		return super.fieldsToString()+"; "+"time: "+ time+";\n";
	}

	public void Write() {
		System.out.println("Director:\n"+fieldsToString());
	}
	
}
