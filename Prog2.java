
class Animal
{
	String shout()
	{
		return "Animal Shouts";
	}
}
class Horse extends Animal
{
	String shout()
	{
		return "Horse Shouts";
	}
}
 class Dog extends Animal 
{
  	String shout()
  	{
  		return "Dog shouts";
  	}
}
 class Cat extends Animal
 {
 	String shout()
 	{
 		return "Cat Shouts";
 	}
 }

public class Prog2 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String animal="";	
		Horse obj=new Horse();
		animal=obj.shout();
		System.out.println(animal);
		Dog obj1=new Dog();
		animal=obj1.shout();
		System.out.println(animal);
		Cat obj2=new Cat();
		animal=obj2.shout();
		System.out.println(animal);
	}

}
