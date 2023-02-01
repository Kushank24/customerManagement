/**
 * 
 */
package com.flipkart.array;

/**
 * @author kushank.maheshwari
 *
 */
public class DemoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare the data type Array here
		int arrayofInt[] = new int[] {2,3,5};
		for(int i=0;i<arrayofInt.length;i++)
		{
			System.out.println("The "+i+" element has value : "+arrayofInt[i]);
		}
		
		//other syntax
		
		int arrayofSalaries[] = null;
		arrayofSalaries = new int[5];
		arrayofSalaries[0] = 50000;
		arrayofSalaries[1] = 20000;
		arrayofSalaries[2] = 30000;
		for(int i=0;i<arrayofSalaries.length;i++)
		{
			System.out.println("The "+i+" salary has value : "+arrayofSalaries[i]);
		}
		
		//Object array of wrapper class
		String names[] = new String[] {"Shakir", "Priyanka", "Sumeet"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println("The "+i+" name is : "+names[i]);
		}
	}

}
