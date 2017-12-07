import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prog6 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		  Thread thread = new Thread();
		  thread.start();
		  Thread t1=thread;
		  Thread Mythread=new Thread("MyThread") {
			      public void run(){
			       // System.out.println("name is changed to " + getName());
			      }
			   };
			   Mythread.start();
			   System.out.println("name is changed to  "+Mythread.getName());
			   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
			   LocalDateTime lcd=LocalDateTime.now();
			   System.out.println(dtf.format(lcd));
			   Mythread.sleep(10000);
			   LocalDateTime lcd2=LocalDateTime.now();
			   System.out.println(dtf.format(lcd2));
	}

}
