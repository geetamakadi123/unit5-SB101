package com.question2;


import java.util.Comparator;



public class SortByMarks implements Comparator<Student> {


	    public int compare(Student s1, Student s2)
	    {
	        return s1.Marks - s2.Marks;
	    }
}



