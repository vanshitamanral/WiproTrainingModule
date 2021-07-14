package Inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(2015,"Ab11278");
		//System.out.println("Employee Name:"+ super.name);
		e.setSalary(300000.56);
		System.out.println("Employee Annual Salary:"+ e.getsalary());
		System.out.println("Joining Year:"+e.year);
		System.out.println("Insurance number:"+e.national_insurance);
		
		

	}

}
