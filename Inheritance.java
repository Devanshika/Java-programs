
abstract class Instrument
{
    abstract void play();
}
 class Guitar extends Instrument
 {
	 void play()
	 {
		 System.out.println("Guitar is playing tin tin tin");
	 }
 }
 class Piano extends Instrument
 {
	 void play()
	 {
		 System.out.println("Piano is playing tan tan tan tan");
	 }
 }
 class Flute extends Instrument
 {
	 void play()
	 {
		 System.out.println("Flute is playing toot toot toot toot");
	 }
 }
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] obj=new Instrument[10];
		 Piano ob=new Piano();
		 Guitar ob2=new Guitar();
		 Flute ob1=new Flute();
		  obj[0]=ob;
		  obj[1]=ob;
		  obj[2]=ob;
		  obj[3]=ob1;
		  obj[4]=ob1;
		  obj[5]=ob1;
		  obj[6]=ob1;
		  obj[7]=ob2;
		  obj[8]=ob2;
		  obj[9]=ob2;
				 
		  for(int i=0;i<10;i++)
		  {
			  obj[i].play();
		  }

	}

}
