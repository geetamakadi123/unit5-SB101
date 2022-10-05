package com.question6;

public class Child extends Parent{



	    Child() throws Exception {
	        super();
	       
	    }

	    public static void main(String[] args) {
	        try {
	            Parent p1=new Parent();
	            p1.fun1();
	            
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	    }

	

}
