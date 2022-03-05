package Javapackage;

public class Student {
	static boolean value1=true;//default value of static int,byte,short,long varible -0;float,double-0.0
   //default value of boolean-false
	
	static String collegename="JNTU"; //memory saving purpose
	int RollNo=5; //instance variable -object level var
	String name; //instance variable - object level var
	public static void main(String [] args)
	{
		//Variables - something that varies
		int value=28;//primitive variable
		//Different type of varaibles - primitive and reference variable
		Student Ramesh=new Student(); //object creation in java
		//Ramesh.RollNo=1;
		Ramesh.name="Ramesh";
		System.out.println(Ramesh.RollNo + " " +  Ramesh.name  );
		Ramesh.instanceMthod();
		//seggregation based on the scoper of variable
		//System.out.println(Ramesh.collegename);
		System.out.println(Student.collegename);
		Student Suresh=new Student();
		Suresh.RollNo=2;
		Suresh.name="Suresh";
		System.out.println(Suresh.RollNo + " " +Suresh.name );
		System.out.println(Student.collegename);
		
		
		//static varible - is a class level variable - they store in method area memory
		
	}
	
	public void instanceMthod() //non static method
	{
		 System.out.println(RollNo);
		
	}
	
	
	
}
