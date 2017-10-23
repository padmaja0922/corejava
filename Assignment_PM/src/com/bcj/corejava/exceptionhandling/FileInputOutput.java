/**
 * 
 */
package com.bcj.corejava.exceptionhandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class modifies the input text file and writes to Output text file
 *
 */
public class FileInputOutput {

	public static void main(String[] args)  {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input file path");
		String input = scan.nextLine();
		System.out.println("Enter Output file path");
		String output = scan.nextLine();
		try{
		transformAndCopyFile(input, output);
		}catch (IOException e){ System.out.println(e); }
		scan.close();

	}

	/**
	 * This method checks and remove the blank lines and comments in the input file
	 * 
	 * @param inputfile
	 * @param outputfile
	 * @throws IOException
	 */
	private static void transformAndCopyFile(String input, String output) throws IOException {

		BufferedReader inputFile = null;
		PrintWriter outputFile = null;
		int x=0;

		try {

			inputFile = new BufferedReader(new FileReader(input));
			outputFile = new PrintWriter(new FileWriter(output));

			String lineOfText = inputFile.readLine();

			while (lineOfText != null) {
				if ((!lineOfText.isEmpty()) && (!lineOfText.startsWith("//")))
					outputFile.println(lineOfText);
				lineOfText = inputFile.readLine();
				x=1;
			}

		} catch (IOException e) {
			System.out.println(e);
		}

		finally {
			inputFile.close();
			outputFile.close();
		}
		if (x==1)
		System.out.println("Written sucess");

	}

}

