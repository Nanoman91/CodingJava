package java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T33_ReadFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException { 

		String fileName = "example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		// This is to find the first line in a file:
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		
		// Without this the 3 will be separated from the second word by a new line.
		in.nextLine();
		
		// To print the file:
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		}
		
		in.close();
	}

}