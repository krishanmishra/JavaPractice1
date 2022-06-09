package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
	String name;
	int salary;
	
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name="+name+",salary="+salary+"]";
	}
	
}
class EmpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
	
		return e2.salary-e1.salary;
	}
	
}


public class PriortyQueueWithJavaObject {

	public static void main(String[] args) {
		
		EmpComparator campartor=new EmpComparator();
		PriorityQueue<Employee> pr=new PriorityQueue<>(10,campartor);
		
		pr.add(new Employee("krishan",400));
		pr.add(new Employee("seema",30));
		pr.add(new Employee("satvik",100));
		pr.add(new Employee("ashisn",40));
		pr.add(new Employee("madann",4000));
		
		
		System.out.println(pr.poll());//it also just remove the value and doesn't matter value is present or not
		System.out.println(pr);
		System.out.println(pr.remove());



	}

}
