package com.bcj.corejava.datatypes.arrays.lab1;

/* Program to find highest, lowest, average values of array */


public class HighLowAverage {
		
   
	// printing odd numbers
	public void printOddNumbers(int a[]){
	   
		System.out.println("Odd numbers in the array :");
	   for (int i:a)
		   if(i%2!=0){
			   System.out.print(" " +i);
		   }	   
   }

    // increasing even numbers by 2 and return to main method using pass by reference	
	public void  increaseEvenBy2(int a[]){
		
		for(int i=0 ; i < a.length;i++)
		{
			if(a[i]%2==0)
			a[i]=a[i]+2;			
		}  
		System.out.println();
		System.out.println("modified array ");
		for(int i : a){
			System.out.print(i+"  ");
		}
	 
	}
	
 //	printing numbers divisible by 3
	public void divisibleBy3(int a[]){
		System.out.println();
		System.out.println(" elements divisible by 3 are:");
		for(int i : a)
			if(i%3==0)
				System.out.print(i +"  ");
	}
	
//printing average of the array	and printing all numbers less than average
  public void averageOfArrey(int a[]){
	  
	   float avg=0;
	   int sum=0;
	   for(int i:a)
	     sum=sum+i;
	   avg = sum/a.length;	
	   System.out.println();
	   System.out.println(" average of all numbers : "+avg);
	   System.out.println(" numbers less than the average are : ");
	   for(int i : a)
		   if (i < avg)
			   System.out.print(i + "  ");
  }
  
  // finding highest and lowest value of the array
   public void highestLowest(int a[]){
	   
	   int max=a[0];
	   int min=a[0];
	   
	   for(int i : a){
		  if (i > max) 
			  max = i;
		  if(i < min)
			  min =i;
	   }
	   System.out.println();
	   System.out.println("Maximum number is : "+ max);
	   System.out.println("Minimun number is : "+min);
	   
   }
  
	public static void main(String[] args) {

		int[] a = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		HighLowAverage hla = new HighLowAverage();
		hla.printOddNumbers(a);
		hla.increaseEvenBy2(a);
		hla.divisibleBy3(a);
		hla.averageOfArrey(a);
		hla.highestLowest(a);
	}

}
