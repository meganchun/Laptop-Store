/*
 * Group #4: Megan Chun
 * May 8th, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * SPD Project (Computer BOSS Store)
 * 
 * This file display a computer which has the most matches based on the survey and two other options which
 * have less or the same number of matches
 * 
 * Major skills: 
 * - array
 * - for loops
 * - Scanner input
 * 
 * Added Features: 
 * - displays star ratings
 * - provides two other recommended options based on their survey
 * - button that links to a external source
 * - add to cart
 * 
 * Areas of Concern: none
 * 
 * Contribution:
 * - 100% Megan (ResultsFrame class and its methods)
 * 
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//SurveyResults class that will create the window for the results
public class ResultsFrame extends JFrame implements ActionListener{

	public static int numItems;
	//background image
	JLabel background = new JLabel(new ImageIcon("images/backgroundWhite.png"));
	
	//MENU BAR ITEMS
	Icon logo = new ImageIcon("images/computerLogo.png");
	JButton computerLogo = new JButton(logo);	
	JButton shopBtn; //Inventory button
	JButton surveyBtn; //Survey button
	JButton educationBtn; //educationBtn button
	Icon cart = new ImageIcon("images/cart.png"); //image of the cart
	JButton cartBtn = new JButton(cart); //turn the image of the cart into a button

	//Create panels for scrolling
	JScrollPane scrollPane;
	JPanel panel = new JPanel(); 
	
	//Icons for the recommendations
	Icon viewFull = new ImageIcon("images/viewFull.png");
	Icon addItem = new ImageIcon("images/add.png");
	
	//Other buttons
	JButton viewItem;
	JButton addToCart; //add the first option to the cart
	JButton addSecondary1; //adding the additional options to the cart
	JButton addSecondary2; //adding the additional options to the cart
	JButton viewFullInfo1; //open the external link of the additional options
	JButton viewFullInfo2; //open the external link of the additional options
		
	//constructor method
	public ResultsFrame() {
		
		//setting the foundation of the window
		setSize(1400,800); //window size
		setTitle("Your Results");
		setLocationRelativeTo(null); //open window in the center of the screen
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //set size, user can't change the size of window
			
		//background image
		background.setBounds(0,0,1400,1754); 
		add(background);
		
		//MENU BAR
		//logo image/button
		background.add(computerLogo);
		computerLogo.setBounds(118,90,43,43);
		computerLogo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); //remove border from button
		computerLogo.addActionListener(this); //add a listener that will determine if the button is clicked
		
		//shop/inventory button
		shopBtn = new JButton("Shop");
		shopBtn.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		shopBtn.setOpaque(false);
		shopBtn.setContentAreaFilled(false); //transparent background for button
		shopBtn.setBorderPainted(false); //transparent border for button
		shopBtn.setBounds(460,95,150,29);
		shopBtn.addActionListener(this); //add a listener that will determine if the button is clicked
		background.add(shopBtn);
		
		//survey button
		surveyBtn = new JButton("Survey");
		surveyBtn.setBounds(620,95,150,29);
		surveyBtn.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		surveyBtn.setOpaque(false);
		surveyBtn.setContentAreaFilled(false);//transparent background for button
		surveyBtn.setBorderPainted(false); //transparent border for button
		surveyBtn.addActionListener(this); //add a listener that will determine if the button is clicked
		background.add(surveyBtn);
		
		//educationBtn button
		educationBtn = new JButton("Learn More");
		educationBtn.setBounds(771,95,200,29);
		educationBtn.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		educationBtn.setOpaque(false);
		educationBtn.setContentAreaFilled(false);
		educationBtn.setBorderPainted(false);
		educationBtn.addActionListener(this); //add a listener that will determine if the button is clicked
		background.add(educationBtn);
		
		//cart button
		background.add(cartBtn);
		cartBtn.setBounds(1280,90,37,39);
		cartBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
		cartBtn.addActionListener(this); //add a listener that will determine if the button is clicked
		
		//a label that will update how many updates are in the cart
		JLabel numItems = new JLabel(Integer.toString(Cart.laptopsInCart.size())); 
		numItems.setBounds(10, 0, 10, 10);
		numItems.setFont(new Font("Helvetica Neue", Font.PLAIN,15)); //set font and size
		cartBtn.add(numItems);
		
		//RESULTS PORTION
		//Title label that explains the page
		JLabel labelTitle = new JLabel("Discover The Computer Made For You.");
		labelTitle.setFont(new Font("Helvetica Neue", Font.BOLD, 30)); //set font and size
		labelTitle.setBounds(434, 200, 900, 100);
		background.add(labelTitle);
		
		//subtitle label
		JLabel subHeader = new JLabel("Our state of the art system has curated a match that will suit you and your lifestyle.");
		subHeader.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		subHeader.setBounds(340, 250, 900, 100);
		background.add(subHeader);

		//TOP PICK
		//background image for laptop
		JLabel square = new JLabel(new ImageIcon("images/laptopBackground.png"));
		square.setBounds(75, 430, 490, 521);
		background.add(square);
		
		//Computer image
		//turn the index of the top computer plus one into a string to upload corresponding image
		String topLaptopIndex = Integer.toString(SurveyResult.getTopIndex(0)+1);
		//create an image of the laptop based on the index of the top computer to upload image
		JLabel computerImage = new JLabel(new ImageIcon("images/laptops/laptop"+topLaptopIndex+".png"));
		computerImage.setBounds(60, 83, 354, 354);
		square.add(computerImage);
		
		//get the model name
		//get the name from the 0th index of the top 3 computers in the results array
		JLabel name = new JLabel(SurveyResult.getName(0));
		name.setBounds(625, 440, 457, 61);
		name.setFont(new Font("Helvetica Neue", Font.BOLD, 50)); //set font and size
		background.add(name);
		
		//add the price of the computer to the screen
		//get the price from the 0th index of the top 3 computers in the results array
		JLabel price = new JLabel("$"+SurveyResult.getPrice(0));
		price.setBounds(1090, 440, 230, 61);
		price.setFont(new Font("Helvetica Neue", Font.PLAIN, 50)); //set font and size
		background.add(price);
		
		//Stars rating
		//determine the star rating based on the overal rating we gave the computers 1-40
		if (SurveyResult.getScore(0) < 26) { //if it is less than 26, it is 3 stars
			JLabel stars = new JLabel(new ImageIcon("images/3star.png"));
			stars.setBounds(625, 510, 165, 32);
			background.add(stars);
		}
		//if it is 26 or higher and less than 34, then it is 4 stars
		else if (SurveyResult.getScore(0) >= 26 && SurveyResult.getScore(0) < 34) {
			JLabel stars = new JLabel(new ImageIcon("images/4star.png"));
			stars.setBounds(625, 510, 165, 32);
			background.add(stars);
		}
		//else, then it is 34 and greater and it is 5 stars
		else {
			JLabel stars = new JLabel(new ImageIcon("images/5star.png"));
			stars.setBounds(625, 510, 165, 32);
			background.add(stars);
		}
		
		//Description of the computer	
		//call the get info method in the SurveyResult class, which will get the string of the laptop
		JTextArea textArea = new JTextArea(SurveyResult.getInfo(0)); 
		textArea.setBounds(625, 580, 700, 250);
		textArea.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		background.add(textArea);
		
		//Add cart button
		//create a button from an icon
		Icon add = new ImageIcon("images/addToCart.png");
		addToCart = new JButton(add);
		addToCart.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		addToCart.addActionListener(this); //add a listener that will determine if the button is clicked
		addToCart.setBounds(625, 830, 257, 87);
		background.add(addToCart);
		
		//Add view product page button that will link user's to an external link
		//create a image icon that will act as a buttpn
		Icon view = new ImageIcon("images/view.png");
		viewItem = new JButton(view);
		viewItem.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		viewItem.setBounds(890, 830, 259, 89);
		viewItem.addActionListener(this); //add a listener that will determine if the button is clicked
		background.add(viewItem);
				
		//favourite button (non-functional)
		JLabel fav = new JLabel(new ImageIcon("images/fav.png"));
		fav.setBounds(1165, 830, 83, 83);
		background.add(fav);
		
		//background for the secondary options
		JLabel blueBox = new JLabel(new ImageIcon("images/blueBackground.png"));
		blueBox.setBounds(0, 1035, 1400, 719);
		background.add(blueBox);
		
		//Tile label for the secondary options
		JLabel secondaryTitle = new JLabel("Not what you’re looking for? Check out similar products");
		secondaryTitle.setFont(new Font("Helvetica Neue", Font.BOLD, 30)); //set font and size
		secondaryTitle.setForeground(Color.white);
		secondaryTitle.setBounds(146, 135, 900, 36);
		blueBox.add(secondaryTitle);
		
		
		//SECONDARY OPTIONS
		int count = 1; //a counter that will keep track of which computer to display
		//for loop that starts at the x value of where the boxes should lay and increments to match the next box
		for (int i = 146; i <= 722; i += 576) {
		

			//Add background for secondary laptops and a container that will hold all the components for each computer
			JLabel whiteBox = new JLabel(new ImageIcon("images/whiteBox.png"));
			whiteBox.setBounds(i, 232, 565, 393);
			blueBox.add(whiteBox);
	
			//Computer image for secondary laptops
			//get the index of the 1st and 2nd index of the top three laptops by calling the getTopindex method in the SurveyResult class
			JLabel secondaryComputerImage = new JLabel(new ImageIcon("images/laptops/laptopSmall"+(SurveyResult.getTopIndex(count)+1)+".png"));
			secondaryComputerImage.setBounds(74, 64, 165, 174);
			whiteBox.add(secondaryComputerImage);	
			
			//Add the name/model of the secondary laptops
			//get the name of the 1st and 2nd index of the top three laptops by calling the getName method in the SurveyResult class
			JLabel secondaryName = new JLabel(SurveyResult.getName(count));
			secondaryName.setBounds(280, 100, 220, 61);
			secondaryName.setFont(new Font("Helvetica Neue", Font.BOLD, 25)); //set font and size
			whiteBox.add(secondaryName);
			
			//Add the price of the secondary laptops
			//get the price of the 1st and 2nd index of the top three laptops by calling the getPrice method in the SurveyResult class
			JLabel secondaryPrice = new JLabel("$"+SurveyResult.getPrice(count));
			secondaryPrice.setBounds(280, 140, 192, 61);
			secondaryPrice.setFont(new Font("Helvetica Neue", Font.PLAIN, 30)); //set font and size
			whiteBox.add(secondaryPrice);
			
			//check to see which add button the user is pressing based on the coordinates/placement of the button
			if (i == 146) { //if the button's x-coordinate is 146, it is the first secondary option
				//create a button that will correspond with first secondary option
				addSecondary1 = new JButton(addItem);
				addSecondary1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				addSecondary1.setBounds(437, 272, 91, 91);
				addSecondary1.addActionListener(this); //add a listener that will determine if the button is clicked
				whiteBox.add(addSecondary1);
				
				//create a button that will correspond with opening a link to the first secondary option
				viewFullInfo1 = new JButton(viewFull);
				viewFullInfo1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				viewFullInfo1.setBounds(37, 272, 388, 87); 
				viewFullInfo1.addActionListener(this);
				whiteBox.add(viewFullInfo1);
			}
			else { //else it is the second secondary option
				//create a button that will correspond with adding second secondary option
				addSecondary2 = new JButton(addItem);
				addSecondary2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				addSecondary2.setBounds(437, 272, 91, 91);
				addSecondary2.addActionListener(this); //add a listener that will determine if the button is clicked
				whiteBox.add(addSecondary2);
				
				//create a button that will correspond with opening a link to the second secondary option
				viewFullInfo2 = new JButton(viewFull);
				viewFullInfo2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				viewFullInfo2.setBounds(37, 272, 388, 87);
				viewFullInfo2.addActionListener(this); //add a listener that will determine if the button is clicked
				whiteBox.add(viewFullInfo2);
			}
			
			//increase the counter
			count++;
		}
		
		
		//create a new scrollPane
		scrollPane = new JScrollPane(background);
		scrollPane.setBounds(0, 0, 1800, 790);
		
		//set the panel bounds and layout manager
		panel.setBounds(0, 0, 1800, 1754);
		panel.setLayout(null);
		
		//add the scroll pane to the panel
		//then add the panel to the frame
		panel.add(scrollPane);
		add(panel);
		
		//set the frame to visible
		setVisible(true);
		
		
	}
	//the actionPerformed method will handle the events of an action in the window
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//if the viewItem button is clicked, it will open the url 
		if (e.getSource() == viewItem) {
			try {
				//open external link in a browser
				Desktop.getDesktop().browse(new URL(SurveyResult.getLink(0)).toURI());
			}
			catch (Exception e1)
			{}
		}
		//if the viewFullinfo1 button is clicked, it will open the url 
		if (e.getSource() == viewFullInfo1) {
			try {
				//open external link in a browser
				Desktop.getDesktop().browse(new URL(SurveyResult.getLink(1)).toURI());
			}
			catch (Exception e1)
			{}
		}
		//if the viewFullinfo2 button is clicked, it will open the url 
		if (e.getSource() == viewFullInfo2) {
			try {
				//open external link in a browser
				Desktop.getDesktop().browse(new URL(SurveyResult.getLink(2)).toURI());
			}
			catch (Exception e1)
			{}
		}
		//ADDING TO THE CART
		//add the 1st recommended option
		if (e.getSource() == addSecondary1) {
			Cart.laptopsInCart.add(SurveyResult.topThreeLaptops[1]);
			new ResultsFrame(); //update the page by calling a new page
		}
		//add the 2nd recommended option
		if (e.getSource() == addSecondary2) {
			Cart.laptopsInCart.add(SurveyResult.topThreeLaptops[2]);
			new ResultsFrame(); //update the page by calling a new page
		}
		//add the top choice option to the cart
		if (e.getSource() == addToCart) {
			//add the laptop in the top laptop results to the arraylist that holds all the added laptops
			Cart.laptopsInCart.add(SurveyResult.topThreeLaptops[0]);
			new ResultsFrame(); //update the page by calling a new page
		}
		//MENU BAR ACTIONS
		if (e.getSource() == computerLogo) {
			setVisible(false);
			new Homepage();
		}
		if (e.getSource() == surveyBtn) {
			setVisible(false);
			new SurveyFrame();
		}
		if (e.getSource() == shopBtn) {
			setVisible(false);
			new Inventory();
		}
		if (e.getSource() == cartBtn) {
			setVisible(false);
			new Cart();
		}
		if (e.getSource() == educationBtn) {
			setVisible(false);
			new EducationFrame();
		}


		
		
	}
}
