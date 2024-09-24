import java.util.*;
public class Prog1 {
	int fact=1;
	public int facto(int num)
	{ 
		if(num==1)
			return fact;
		else 
		{	fact*=num;
			return facto(--num);		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter the number");
       int n=sc.nextInt(); 
      Prog1 obj=new Prog1();
        System.out.println(obj.facto(n));
        
	}

}
