/*
 * Group #4: Megan Chun
 * May 8th, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * SPD Project (Computer BOSS Store)
 * 
 * This file determine the top 3 matches from survey and put the three laptops into an array
 * 
 * Major skills: 
 * - array list
 * - if/else if statements
 * 
 * Added Features: 
 * - determine top 3 matches rather than one top result
 * 
 * Areas of Concern: none
 * 
 * Contribution:
 * - 100% Megan (SurveyResult class and its methods)
 * 
 */
public class SurveyResult {
	
	//declare arrays that will hold information related to top 3 choices
	public static Laptop[] topThreeLaptops = new Laptop[3]; //laptop objects of the top three laptops
	public static int[] topLaptopsIndex = new int[3]; //the index/comp number of the top three laptops
	public static int[] numOfMatches = new int[12]; //number of matches for each laptop in our inventoory
	
	//getMatches method that will take in an array with the survey results as an argument
	public static void getMatches(String[] answerArray) {
		
		//for loop that will iterate through all of the laptops in the inventory
		for (int i = 0; i < 12; i++) {
			
			int match = 0; //reset the number of matches to zero for each laptop
			String price; //declare the price variable
			int ssd = Integer.parseInt(answerArray[3]); //get the amount of storage the user wants from the answerArray
	
			//Check if the type of the laptop matches with the survey results
			if (FileInput.getType(i).equalsIgnoreCase(answerArray[0])) {
				match++;
			}
			//else don't add anything to the number of matches
			else {
				match += 0;
			}

			//Check if the price of the laptop matches with the survey results
			//See which price category the laptop is under
			
			//if the price is less than 500, budget
			if (FileInput.getPriceDouble(i) < 500) { 
				price = "Budget";
			}
			//if the price is greater than 500, and less than 1000, mid-priced
			else if (FileInput.getPriceDouble(i) >= 500 && FileInput.getPriceDouble(i) < 1000) {
				price = "Mid-Priced";
			}
			//if the price is greater than 1000, and less than 2000, high end
			else if (FileInput.getPriceDouble(i) >= 1000 && FileInput.getPriceDouble(i) < 2000) {
				price = "High End";
			}
			//if the price is greater than 2000, ultra
			else {
				price = "Ultra";
			}
			
			//check if the value the user entered for price ranges matches with the current laptop's price level
			if (answerArray[1].equalsIgnoreCase(price)) {
				match++;
			}
			//else don't add anything to the number of matches
			else {
				match += 0;
			}
		
			
			//check if the brand of the laptop matches with the survey results
			if(FileInput.getBrand(i).equalsIgnoreCase(answerArray[2])) {
				match++;
			}
			//else don't add anything to the number of matches
			else {
				match += 0;
			}
			
			//check if the amount of storage of the laptop matches with the survey results
			if (FileInput.getSsd(i) >= ssd) {
				match++;
			}
			//else don't add anything to the number of matches
			else {
				match += 0;
			}
			
			//store the number of matches for the current laptop into an array
			numOfMatches[i] = match;

			
			//call the findTopThree method
			findTopThree();
		}
		

	}
	//the findTopThree method find 3 computers with the most amount of matches
	public static void findTopThree() {
		
		//call the fillLibrary in the FileInput class which will intialize an array of all the computers
		FileInput.fillLibrary();
		
		//find top match
		int top1 = 0; //will hold the number of matches
		int index1 = 0; //record the index of which laptop is the top choice
		
		for (int i = 0; i < 12; i++) {
			//if the current laptop's number of match is greater than the previously stored value
			if (numOfMatches[i] >= top1) {
				//new top number of matches for the 1st choice
				top1 = numOfMatches[i];
				//store the laptop which is currently 1st in the 0th index of the top three laptops array
				topThreeLaptops[0] = FileInput.laptopArray[i];
				//new index of the top choice
				index1 = i;
			}
		}
		//add the index of the top laptop into an array
		topLaptopsIndex[0] = index1;
		
		
		//find second best choice
		int top2 = 0; //will hold the number of matches
		int index2 = 0; //record the index of which laptop is the second choice
		
		for (int i = 0; i < 12; i++) {
			//if the current laptop's number of match is greater than the previously stored value 
			//and it is not the same laptop as the 1s choice
			if (numOfMatches[i] >= top2 && i != index1) {
				//new top number of matches for the 2nd choice
				top2 = numOfMatches[i];
				//store the laptop which is currently 2nd in the 1st index of the top three laptops array
				topThreeLaptops[1] = FileInput.laptopArray[i];
				//new index of the top choice
				index2 = i;
			}
		}
		//add the index of the 2nd laptop into an array
		topLaptopsIndex[1] = index2;
		
		//find third best choice
		int top3 = 0; //will hold the number of matches
		int index3 = 0; //record the index of which laptop is the third choice
		
		for (int i = 0; i < 12; i++) {
			//if the current laptop's number of match is greater than the previously stored value 
			//and it is not the same laptop as the 2nd choice or the 1st choice
			if (numOfMatches[i] >= top3 && i != index1 && i != index2) {
				//new top number of matches for the 3rd choice
				top3 = numOfMatches[i];
				//store the laptop which is currently 3rd in the 2nd index of the top three laptops array
				topThreeLaptops[2] = FileInput.laptopArray[i];
			}
		}
		
		//add the index of the third laptop into an array
		topLaptopsIndex[2] = index3;
		
	}
	//getPrice method will get the price of laptop n in the top three laptops 
	public static double getPrice(int i) {
		
		findTopThree();	
		
		return topThreeLaptops[i].getPrice();
	}
	//getName method will get the name of laptop n in the top three laptops 
	public static String getName(int i) {
		
		findTopThree();	
	
		return topThreeLaptops[i].getModel();
	}
	//getInfo method will get the info of laptop n in the top three laptops 
	public static String getInfo(int i) {
		
		findTopThree();	
	
		return topThreeLaptops[i].toString();
	}
	//getLink method will get the link to laptop n in the top three laptops 
	public static String getLink(int i) {
		
		findTopThree();	
		
		return topThreeLaptops[i].getLink();
		
	}
	//getTopIndex method will get the index of laptop n in the top three laptops 
	public static int getTopIndex(int i) {
		
		findTopThree();	
		
		return topThreeLaptops[i].getLaptopNum();
		
	}
	//getScore method will get the score of laptop n in the top three laptops 
	public static double getScore(int i) {
		
		findTopThree();	
		
		return topThreeLaptops[i].getScore();
		
	}
	
}
