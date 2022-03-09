package Javapackage;

import java.util.Random;

public class Arrays {
	
	
	public static void main(String[] args)
	{
	int[] Rollnoarray=new int[50];//array declaration
	int[] array2= {1,2,3,4,5}; // initialize the array
	int array3[]=new int[4];
	int[][] twodimension=new int[2][3];
	twodimension[0][0]=2;
	//System.out.println(twodimension[0][0]);
	//System.out.println(array1);
	//System.out.println(array1[0]);
	//System.out.println(array2);
	//System.out.println(array2[1]);
	
	//students -1000 - rollnos 
	int count=0;
	
	for(int i=0;i<twodimension.length;i++) //i=0 ->1 //2times //row traversal
	{
		for(int j=0;j<twodimension[0].length;j++) ///column traversal //6 times
		{
		 twodimension[i][j]=count++;
		 System.out.println(twodimension[i][j]);
		}
		
	}
	int sum=0;
	for(int i=0;i<twodimension.length;i++) //i=0 ->1 //2times //row traversal
	{
		for(int j=0;j<twodimension[0].length;j++) ///column traversal
		{
		 sum=sum+twodimension[i][j];//-> 1-> 
		 //sum-1 -> 3 ->15 
		}
		
	}
	System.out.println(sum);

	
	//for(int i=0;i<Rollnoarray.length;i++)//0-1-2----------19  //array initialization
	//{
	//	Rollnoarray[i]=getrollNO();
	//	System.out.println(Rollnoarray[i]);
	//}
	
	
	//length of the array ->length variable
	
	System.out.println(array3.length); //length is a variable and final variable
	
	
	
	}
	
     public static int getrollNO() //this method is used to generate random integer value
     {
    	Random random=new Random();
    	random.nextInt();
		return random.nextInt();
    	 
     }

}
