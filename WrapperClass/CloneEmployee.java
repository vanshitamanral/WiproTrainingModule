package WrapperClass;

class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

public class CloneEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Employee1");
		Employee empClone = emp.clone();
		
		empClone.setName("Employee2");
		
		System.out.println("Original: "+emp.getName());
		System.out.println("Clone: "+empClone.getName());
	}

}