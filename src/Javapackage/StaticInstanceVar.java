package Javapackage;

public class StaticInstanceVar {
  
	
	static String colgname="JNTU";
	int rollNO;
	int a=2;
	static int b=4;
	
	public static void main(String [] args)
	{
		
		StaticInstanceVar object1=new StaticInstanceVar();
		object1.a=4;
		object1.b=5;
		System.out.println(object1.a);
		System.out.println(object1.rollNO);
		object1.rollNO=3;
		object1.colgname="VNR";
		System.out.println(object1.rollNO + " " + object1.colgname);
		StaticInstanceVar object2=new StaticInstanceVar();
		System.out.println(object2.rollNO + " " + object2.colgname);
		
		
	}
	
	
	
}
