package sampleTest.streams;
class Account{
	String accNo;
	int accBal;
	
	Account(String accNo, int accBal){
		this.accNo = accNo;
		this.accBal = accBal;
	}
}

class Employee1{
	String ename;
	int esal;
	Account acc;
	
	Employee1(String ename, int esal, Account acc){
		this.ename = ename;
		this.esal = esal;
		this.acc = acc;
		
	}
	
	public Employee1 CreateClone() throws CloneNotSupportedException {
		
		Employee1 emp = null;
		
		Account accclone = new Account(acc.accNo,acc.accBal); // creating duplicate object for account class
		Employee1 empclone = new Employee1(this.ename,this.esal,accclone); //duplicate object is passed not this.acc
		emp = empclone;
		return emp;
		
		//throw new Exception("Exception occured");
		//System.out.println("un reachable code");
		
	}
}
public class DeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account acc1 = new Account("6544",765);
		Employee1 e1 = new Employee1("Shan",200,acc1);
		System.out.println(e1.acc.accBal);
		System.out.println("");
		Employee1 e2 = e1.CreateClone();
		System.out.println(e1);
		System.out.println(e1.acc);
		System.out.println(e2.acc);
		
		Employee1 e3 = e2;
		
		System.out.println(e3);
		System.out.println(e3.acc);
		
	}

}
