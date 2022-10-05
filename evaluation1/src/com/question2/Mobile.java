package com.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	  public List<String> getModels(String company) throws Main{

	        if(mobiles.containsKey(company)){

	            return mobiles.get(company);
	        }

	        else{


	            Main ime=new Main("Invalid company name");
	            throw ime;

	        }


	    }

	    public String addMobile(String company, String model){

	     if(mobiles.containsKey(company)){
	         ArrayList<String> list=mobiles.get(company);
	         if(list.contains(model)){
	             return "model already exist";
	         }
	         else {
	             list.add(model);
	             mobiles.put(company, list);
	         }
	     }
	     else{
	         ArrayList<String> arr=new ArrayList<>();
	         arr.add(model);

	         mobiles.put(company,arr);

	     }

	        return "Mobile added successfully";
	    }

	    public static void main(String[] args){

	        Mobile m1 = new Mobile();

	        m1.addMobile("vivo", "note5");
	        m1.addMobile("samsung", "note6");
	        m1.addMobile("apple", "iphone12");
	        try {


	            List<String> out= m1.getModels("vivo");

	            System.out.println(out);


	        }catch (Main ime){

	            System.out.println(ime.getMessage());
	        }
	    }
}



