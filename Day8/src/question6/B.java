package question6;

public class B extends Thread{
	
	public void run(){
	        for(int i=1;i<10;i++){
	        try
	            {Thread.sleep(500);}
	        catch
	             (InterruptedException e)
	             {System.out.println(e);}
	            System.out.println(i);
	         }
	   }
	
	public static void main(String args[]){
	        B t1=new B();
	        B t2=new B();

	        t1.run();
	        t2.run();
	        }
 }


