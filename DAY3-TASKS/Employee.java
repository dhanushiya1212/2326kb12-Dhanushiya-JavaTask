package task.corejava;

public class Employee {
	public void salary(String work,double salary) {
		System.out.println("Your work is: "+work);
		System.out.println("Your salary is: "+salary);
	}
	
	public void salary(String work,double salary,int time) {
		System.out.println("Your work is: "+work);
		
		System.out.println("Your salary is: "+(salary*time));
	}
	public void salary(String work,double salary,int time,float bonus) {
		System.out.println("Your work is: "+work);
		
		System.out.println("Your salary is: "+(salary*time*bonus));
	}
	
	public static void main(String args[]) {
		
		Employee e=new Employee();
		e.salary("Full-Time", 30,500);
		e.salary("Part-Time", 30,250);
		e.salary("FreeLancer", 500,30,5f);
	}

}

