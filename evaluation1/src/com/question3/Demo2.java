package com.question3;


import java.io.*;
import java.util.List;

public class Demo2 {
	


	    public static void main(String[] args) throws IOException, ClassNotFoundException {

	        FileInputStream fis = new FileInputStream("studentdata.txt");
	        ObjectInputStream ois = new ObjectInputStream(fis);

	        List<Student> list= (List<Student>)ois.readObject();
	        list.add(new Student(6,"gitesh",700,"gita","bansi",new Address("bhopal","nagpur",12345)));

	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
	        oos.writeObject(list);
	        oos.close();
	    }
	

}
