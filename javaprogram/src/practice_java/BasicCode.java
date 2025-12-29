package practice_java;

public class BasicCode {

	public static void main(String[] args) {
		int age=21;
		double salary=50000.00;
		boolean ispassed=true;
		char grade='A';
		double newSalary=age;//data widening
		int roundSalary=(int)salary;//data narrowing
		//arithmetic operation
		int increment=5000;
		int total=roundSalary+increment;
		System.out.println(age);
		System.out.println(salary);
		System.out.println(roundSalary);
		System.out.println(total);
		

	}

}