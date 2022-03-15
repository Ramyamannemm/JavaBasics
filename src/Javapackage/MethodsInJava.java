package Javapackage;

public class MethodsInJava {

	
	public static String username ="Rajesh";
	public int products;
	
	public static void main(String[] args)
	{
		//Amazon application - cart, payment, product discription
		
		String paymentType="card";
		
		MethodsInJava.cartfeature(20);//method calling
		
		
	}
	
	public static void  cartfeature(int maxnoOfitems)
	{
      
		
		if(maxnoOfitems>30)
		{
			System.out.println("max count reached");
		}
		
		
		
	}
	
	
	
}
