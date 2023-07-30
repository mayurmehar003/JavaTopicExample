package day1;
class salaryException extends RuntimeException {
	@Override
	public String getMessage() {
		return "salary Can not be Negative";
	}

}

class Employee {
	String name;
	int sal;

	Employee(String name, int sal) {
		this.name = name;

		if (sal > 0) {
			this.sal = sal;
		} else {
			throw new salaryException();
		}

	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("mayur", 50);
		
		
		Employee e2=new Employee("akash", -50);
		
		
		System.out.println(e1);
		
		System.out.println(e12);
		
	
		
	}
}