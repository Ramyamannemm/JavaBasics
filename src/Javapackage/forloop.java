package Javapackage;

public class forloop {

	
	public static void main(String [] args)
	{
		int count=1; //stack memory
		forloop for1=new forloop();//object  creation
		
		for1.studentcounter("EEE"); //method calling
		
		
		
	}
	
	public void studentcounter(String department)
	{
		int EEEcounter = 0;
		int ECEcounter = 0;
		if(department=="EEE")
		{
			EEEcounter++;
		}
		if(department=="ECE")
		{
			ECEcounter++;
		}
		
	}
}
