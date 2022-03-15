package Javapackage;

public class whileloop {

	
	public static void main(String[] args)
	{
		int count=0;
		int number1 = 0;
		int  number2=0;
		
		while(count<10)  //count->0->1 ->2.....9
		{
			number1++;  //number1 ->0 -> 1 ->2....10
			count++;   //1-> 
			
		}
		
		do
		{
		number2++;
		count++;
		}while(count<10);
		System.out.println(number1);
	}
}
