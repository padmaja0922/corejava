package com.bcj.corejava.datatypes.arrays.lab5;

public class JaggedArray {
	
    
	public static void main(String[] args) {
		
		String[][] student = {{"Student Name", "Tutorial1 ","Tutorial 2 ","Tutorial 3"},
				              {"Tony ", "JAVA "," C "," C++"},
				              {"Thomas","JAVA "," UNIX ","  "},
				              {"Dinil ","Linux","Oracle","  "},
				              {"Delvin"," RDBMS", " C# "," ORACLE "}};
		for(int i=0;i<student.length-1;i++) 
			 System.out.print(student[0][i]+" ");
		System.out.println();
		 
		for(int i=0;i<student.length;i++ )
		{
			if (student[i][0]== "Delvin")
			{
				for (int j =0; j < student.length-1;j++)
				 System.out.print(student[i][j]+ " \t  ");
			}
		}
		
		}
		
		

	}


