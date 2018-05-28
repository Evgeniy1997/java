import by.gsu.pms.Chief;
import by.gsu.pms.Director;
import by.gsu.pms.Employee;
import by.gsu.pms.Worker;

public class Runner {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[4];
		
		employees[0] = new Worker("Ageev1", "man", 10, 1200, "17.11.1997" , 300, 2, 5);
		employees[1] = new Chief("Ageev1", "man", 10, 1200, "17.11.1997" , 300, "metall", 30);
		employees[2] = new Director("Ageev1", "man", 10, 1200, "17.11.1997" , 300, 30);
		employees[3] = new Employee("Ageev1", "man", 10, 1200, "17.11.1997" , 300);
		

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}
