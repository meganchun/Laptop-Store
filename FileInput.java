/*
 * Group #4: Megan Chun
 * May 8th, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * SPD Project (Computer BOSS Store)
 * 
 * This file will filter through the data uploaded by a file and store it into an array of 12 Laptop objects
 * 
 * Major skills: 
 * - array
 * - for loops
 * - Scanner input
 * 
 * Added Features: none
 * 
 * Areas of Concern: none
 * 
 * Contribution:
 * - 100% Megan (FileInput class and all its methods)
 * 
 */

//import statements
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//FileInput class that will take in information from a txt file
public class FileInput {
	
	//global array of Laptop objects
	public static Laptop[] laptopArray = new Laptop[12];
	
	//main method
	public static void main(String[] args) {
	
		//calling the methods
		fillLibrary();
		displayArray();
		
	}
	
	//fillLibrary method that will take the information from a txt file and transfer it to the array
	public static void fillLibrary() {
		
		try {
			//use the scanner object to access the file
			Scanner inputFile = new Scanner(new File("data/Laptops.txt"));
			
			//set a delimiter which will stop scanning the data for one laptop
			inputFile.useDelimiter(",|\r\n");
			
			//for loop that will iterate through all the indexes in the laptop array
			for(int index = 0; index < laptopArray.length; index++) {
				
				//create variables of each data needed for the laptops
				String brand = inputFile.next();
				String model = inputFile.next();
				String type = inputFile.next();
				double price = inputFile.nextDouble();
				String system = inputFile.next();
				String cpu = inputFile.next();
				String gpu = inputFile.next();
				int ssd = inputFile.nextInt();
				int ram = inputFile.nextInt();
				double weight = inputFile.nextDouble();
				int noOfUSBPorts = inputFile.nextInt();
				double displaySize = inputFile.nextDouble();
				String link = inputFile.next();
				double score = inputFile.nextDouble();
				int laptopNum = inputFile.nextInt();
				
				//add the data to the corresponding laptop
				laptopArray[index] = new Laptop(brand, model, type, price, system, cpu, gpu, ssd,
						ram, weight, noOfUSBPorts, displaySize, link, score, laptopNum);
				
			}
			//close the scanner
			inputFile.close();
			
		} catch (FileNotFoundException e) {
			//if the file is not found output an error message
			System.out.println("File error");
		}
	}
	
	//displayArray method that will output each laptop in the laptop array
	public static void displayArray() {
		//for each laptop object in the laptop array, print the laptop
		for(Laptop laptop: laptopArray) {
			System.out.println(laptop);
		}
	}
	//the toString method will return the toString method of laptop object i
	public static String toString(int i) {
		fillLibrary();
		
		return laptopArray[i].toString();
	}
	//the getBrand method will return the getBrand method of laptop object i
	public static String getBrand(int i) {
		
		fillLibrary();
		return laptopArray[i].getBrand();
	}
	//the getName method will return the getModel method of laptop object i
	public static String getName(int i) {
		
		fillLibrary();
		return laptopArray[i].getModel();
	}
	//the getPrice method will return a string of the getPrice method of laptop object i
	public static String getPrice(int i) {
		
		fillLibrary();
		return Double.toString(laptopArray[i].getPrice());
		
	}
	//the getPriceDouble method will return a double of the getPrice method of laptop object i
	public static double getPriceDouble(int i) {
		
		fillLibrary();
		return laptopArray[i].getPrice();
		
	}
	//the getType method will return the getType method of laptop object i
	public static String getType(int i) {
		
		fillLibrary();
		return laptopArray[i].getType();
		
	}
	//the getSsd method will return the getSsd method of laptop object i
	public static int getSsd(int i) {
		
		fillLibrary();
		return laptopArray[i].getSsd();
		
	}	
	
	//displayArray method that will sort the array alphabetically
	public static Laptop[] displayArraySortedAlphabetical() {
		
		fillLibrary();
		Arrays.sort(laptopArray, Comparator.comparing(Laptop:: getModel));
		return laptopArray;
	}

}
