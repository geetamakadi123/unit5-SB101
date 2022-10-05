package com.question3;

    import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.List;


public class Demo1 {
	
	
	    public static void main(String[] args) throws Exception {

	        List<Student> stu = new ArrayList<>();

	        stu.add(new Student(1,"gita",550,"gita","bansi",new Address("nagpur","maharashtra",1234)));
	        stu.add(new Student(2,"gitu",500,"gita","bansi",new Address("mumbai","maharashtra",1234)));
	        stu.add(new Student(3,"gitaa",450,"gita","bansi",new Address("westbengol","kolkata",1234)));
	        stu.add(new Student(4,"geeta",400,"gita","bansi",new Address("madhpradesh","bhopal",1234)));
	        stu.add(new Student(5,"geetu",650,"gita","bansi",new Address("nashik","maharashtra",1234)));

	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
	        oos.writeObject(stu);
	        oos.close();
	}
	



}
