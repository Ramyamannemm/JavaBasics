package Javapackage;

public class Bikeclass extends VehicleParentclass{
	
	@Override
	public void wheels()
	{
		System.out.println("child class wheels");
	}
	public void gears()
	{
		System.out.println("bike gears");
	}
	public static void main(String [] args)
	{
		Bikeclass hondacity=new Bikeclass();
		hondacity.gears();
		hondacity.engine();
		hondacity.wheels(); // Over riding
		//-------------------------
		VehicleParentclass parent=new VehicleParentclass();
		parent.engine();
		parent.wheels();
	//	parent.gears();//not possible
		//............................
		VehicleParentclass parent1=new Bikeclass(); //run time polymorphysim also called as dynamic binding or late binding
		parent1.wheels();
		
		
		
	}
	

}
