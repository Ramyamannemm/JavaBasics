// Group of java classes is called package
package Javapackage;

//group of behaviors is called class
public class IdentifiersDataTypes {
	
	public static void main(String [] args)
	{
		//case sensitive - Lower case or higher case is not possible
		//this is print function
		//Rules to write identifiers
		//Rule-1 -> a-z, A-Z, 0-9, $, -
		// Rule-2 -> YOu cannot use numbers at the start of the identifier
		//Rule-3-Java is case sensitive
		//Rule 4 - Duplicates are not allowed when writing identifiers
		//Rule 5 - You can not use in built keywords when writing identifiers
		//Rule 6- You can use inbuilt class names or interface names - it is not recommended
		
//---------------------------------------------------------------------------------------------
//		-> Data types -> byte, int, short, long, double, float,char, boolean
		//byte - 1byte=8 bits, range->-128 to +127, only stores integer values
		//short - 2bytes-16 bits, range -> -2^16 to +2^17, only stores integer values
		//int - 4 bytes- 32 bits, range -> -2^31to +2 32, only stores integer values
		//long - 8 bytes - 64 bits
		//float -> 3.4-> 4 bytes-> 32bits 
		//double -> 8 bytes-> 64 bits
		// char -> character value
		byte value=4;
		short value1=2;
		int value3=8;
		long valuee=03;
		float value4=3.0f;
		double value5=3.7d;
		char character1='d'; // it is mandatory to use single quotes
		boolean flag=true;// it only accepts true or false
		String name="Ramya";//string is not a primitive data type in java. String is a pre defined class in java
		int age=27;
		int exp=6;
		int name2='d';// int internally converts character into its ASCII value a-z -> 66, A-Z -> 64 - 99
		System.out.println(name2);
		
		
  	}
	public void bike()
	{
		
	}
	

}
