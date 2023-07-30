//Check Two Strings Anagram or Not
package day1;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
		
	}
	
	@Override
	public String toString()
	{
		return "Name :"+name+" Marks :"+marks;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student temp=(Student) o;
		
		if(this.name==temp.name && this.marks==temp.marks)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int compareTo(Student st) {
		if(this.marks>st.marks)
		{
			return 1;
		}
		if(this.marks<st.marks)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	
	}
}
class Main
{
	public static void main(String[] args) {
		Student s1=new Student("mayur", 50);
		Student s2=new Student("akash", 40);
		Student s3=new Student("chirag", 100);
		
		
		ArrayList<Student> a1=new ArrayList<Student>();
		
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		
		Collections.sort(a1);
		
		
		for(Student i:a1)
		{
			System.out.println(i);
		}
		
		
	}
	

}

