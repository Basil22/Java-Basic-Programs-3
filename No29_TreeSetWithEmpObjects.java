package TwentyToThirty;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int id;
	private String empName;
	
	public Employee(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int compareTo(Employee e) {
		return this.id > e.id ? 1:-1;
	}
}

public class No29_TreeSetWithEmpObjects {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Basil");
		Employee e2 = new Employee(102, "John");
		
		Set<Employee> empTree = new TreeSet<Employee>();
		empTree.add(e1);
		empTree.add(e2);
		
		for(Employee e: empTree) {
			System.out.println(e.getId() + ": " + e.getEmpName());
		}
	}
}