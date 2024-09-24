import java.util.ArrayList;

public class Prog7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(12,100000,"asd","qwerty");
		Employee e2=new Employee(13,20000,"df","hvfbf");
		Employee e3=new Employee(14,30000,"gg","fdbhdfhnd");
		ArrayList<Employee> employee=new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		//Searching for id= 12 and name=asd
		for(Employee e:employee)
		{
			if(e.id==12 && e.name.equals("asd"))
			{
System.out.println(e.id+ " "+ e.name+ " "+e.salary+" "+e.address);
		}
		
	}
	}
}
class Employee
{
  int id;
  int salary;
  String name;
  String address;
   Employee(int id,int salary, String name, String address)
   {
	   this.id=id;
	   this.salary=salary;
	   this.name=name;
	   this.address=address;
   }
}