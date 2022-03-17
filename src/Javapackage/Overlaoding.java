package Javapackage;

public class Overlaoding {

	public static void main(String[] args)
	{
		Overlaoding overloaded=new Overlaoding();
		System.out.println(overloaded.sum(2));
		//System.out.println(overloaded.sum(3, 4));
		
		
		
	}
	
	public double sum(double b)
	{
		float a=6;
		double c=a+b;
		return c;//8
		
	}
	
	public int sum(float a)
	{
		int i=9;
		float b=i;
		
		int c=(int) b;
		return (int) a;//2
		
	}
	
	
	
}
