package sampleTest.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	public String ename;
	public int eno;
	
	Employee(int eno, String ename){
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		
		return this.ename + "    " + this.eno;
	}   
}

public class SortinguserDefinedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"Shan");
		Employee e2 = new Employee(1001,"Shan1");
		Employee e3 = new Employee(201,"Shan2");
		Employee e4 = new Employee(501,"Shan3");
		Employee e5 = new Employee(1,"Shan4");
		
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		System.out.println(emplist);
		
		Collections.sort(emplist, new Comparator<Employee>() {
			
			public int compare(Employee e1, Employee e2) {
				return e1.eno > e2.eno ? -1 : e1.eno < e2.eno ? 1 : 0;
			}
			
			
		});
		
		System.out.println(emplist);

		
	}

}
