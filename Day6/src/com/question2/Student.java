package com.question2;

public class Student {
	
	    private int rollNumber;
	    private String name;
	    private double marks;
	    
	    
	    
		public Student(int i, String string, int j) {
			super();
		}
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
		}
	    
	    
        
}
