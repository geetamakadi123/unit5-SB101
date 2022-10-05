package question6;

public class A extends Thread{
	
	    public void run() {
	        for (int i=1; i<=5; i++) {
	            System.out.println("run - "+i);
	        }
	    }
	    public static void main(String args[]){
	         A t1=new A ();
	        t1.run();//fine, but does not start a separate call stack
	    }
	


}
