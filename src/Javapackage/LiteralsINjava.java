package Javapackage;

public class LiteralsINjava {
	
	public static void main(String [] args)
	{
		int value=34;
		//int - data type, value - Identifier, 34-Literal/constant
		// Rules to write literals in java
		int value1=20; //valid
		int value2=020; //octal value -> base 8(0,1,2,3,4,5,6,7,8),(9,10,11,12,13,14,15,16)
		System.out.println(value2);//it is converting octal value into decimal value
		//int value3=2.5;//not a valid case
		//int value4=123l;//not a valid case
		//-------------------------------------------
		long long1=34;//by default it will be considered as int value
		System.out.println(long1);
		long long2=54l;//we use l in literal to represent long data type
		//-------------------------------------------------
		//short
		short short1=45; //valid
		//byte
		byte byte1=3;//valid
		//---------------------------------------------------
		//float f1=12.43;//not valid -> we are not specifiying floating point literal 'f'
		float f2=12.43f;//valid case
		//------------------------------------------------
		double d1=12.43; //bydefault double value
		double d2=12.43f; //float value
		double d3=12.43d;//double value
		//-------------------------------------------------
		char c1='a';//valid , character accepts only single value
		//char c2="a";//invalid
		//char c3='da';//not value
		//--------------------------------------------------------
		boolean b1=true;//valid case, boolean accepts only true or false
		boolean b2=false; //valid
		//boolean b5=True;//not valid
		//boolean b3="true";//not valid
		//boolean b4=0;//not valid
		
	}

}
