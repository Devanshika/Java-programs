
public class Prog5 {
	 static void validate(int age)throws InvalidAgeException
		{
             if(age<18 || age>60)
	        	throw new InvalidAgeException("Not Valid");
	        else 
	        System.out.println("");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	          int age=Integer.parseInt(args[1]);
        String name=args[0];
        try{
        	validate(age);
        }
        catch(Exception m)
        {
        	System.out.println("Exception"+m);
        }
	}
}
class 	InvalidAgeException extends Exception
{   InvalidAgeException(String s)
	{
	super(s);
	}
}
