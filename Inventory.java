/*
 * Group #4: Megan Chun
 * May 15th, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * SPD Project (Computer BOSS Store)
 * 
 * This file displays our inventory of laptops and provides the user with the ability to add products to the cart
 * 
 * Major skills: 
 * - array
 * - for loops
 * - event listeners
 * 
 * Added Features: 
 * - add to cart feature
 * 
 * Areas of Concern: 
 * - doesn't provide the ability to sort 
 * - can not view detailed view of product
 * 
 * Contribution:
 * - 100% Megan (Inventory class and its methods)
 * 
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Inventory extends JFrame implements ActionListener{
	
	//background image
	JLabel background = new JLabel(new ImageIcon("images/inventoryBackground.png"));
	
	//scroll pane
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	//MENU BAR ITEMS
	Icon logo = new ImageIcon("images/computerLogo.png"); //icon of the logo
	JButton computerLogo = new JButton(logo); //turn the icon into a button
	JButton shopBtn; //Inventory button
	JButton surveyBtn; //Survey button
	JButton educationBtn; //Education button
	Icon cart = new ImageIcon("images/cart.png"); //image of the cart
	JButton cartBtn = new JButton(cart); //turn the image of the cart into a button
	
	//icon of the add to cart button
	Icon addToCartImage = new ImageIcon("images/addToCartSmall.png");

	
	//add to cart button for all items
	JButton addToCart1;
	JButton addToCart2;
	JButton addToCart3;
	JButton addToCart4;
	JButton addToCart5;
	JButton addToCart6;
	JButton addToCart7;
	JButton addToCart8;
	JButton addToCart9;
	JButton addToCart10;
	JButton addToCart11;
	JButton addToCart12;

	//constructor method
	public Inventory() {
		
		//setting the foundation of the window
		setSize(1400,800); //window size
		setTitle("Your Results");
		setLocationRelativeTo(null); //open window in the center of the screen
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //set size, user can't change the size of window
		
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
		
		//label that will update how many updates are in the cart
		JLabel numItems = new JLabel(Integer.toString(Cart.laptopsInCart.size())); 
		numItems.setBounds(10, 0, 10, 10);
		numItems.setFont(new Font("Helvetica Neue", Font.PLAIN,15)); //set font and size
		cartBtn.add(numItems);
		
		//title/header of the page 
		JLabel title = new JLabel("Step Up Your");
		title.setBounds(500, 200, 200, 100);
		title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
		background.add(title);
		
		//second part of the title with a different colour
		JLabel title2 = new JLabel("Computer Game.");
		title2.setBounds(700, 200, 800, 100);
		title2.setForeground(new Color(33,116,241)); //custom colour using RGB 
		title2.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
		background.add(title2);
		
		//subheader of the page
		JLabel subheader = new JLabel("Shop top of the line exlusive computers, and become a computer boss.");
		subheader.setBounds(400, 250, 800, 100);
		subheader.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		background.add(subheader);
		
		//set background bounds and size
		background.setBounds(0,0,1400,800);
		//add the background to the window
		add(background);
		
		//index will keep track of the index of the laptop based on the laptop array, and the number of laptops
		int index = -1;
		
		//for loop that will control the number of rows that appear and the y-coordinates for each row
		for (int r = 433; r <= 1665; r+= 424) {
			
			//for loop that will control the number of columns that appear and the x-coordinates for each row
			for (int c = 25; c <= 1036; c+= 315) {
				
				//if the index number reaches 11, all the laptops in the inventory have been displayed, break the loop 
				if (index == 11) {
					break;
				}
				//else continue adding to the index counter
				else {
					index++;
				}
				//background of each item in the inventory that will act as a container for all the laptop's components
				JLabel compBackground = new JLabel(new ImageIcon("images/inventoryCompBackground.png"));
				compBackground.setBounds(c, r, 390, 374);
				background.add(compBackground);
				
				//display the image of the computer based on the current index+1 since the images are labeled from computer 1-12 not 0-11
				JLabel compImage = new JLabel(new ImageIcon("images/laptops/laptopSmall"+(index+1)+".png"));
				compImage.setBounds(110, 39, 165, 200);
				compBackground.add(compImage);	
				
				//display the name of the current index by calling the getName method in the FileInput class
				JLabel compName = new JLabel(FileInput.getName(index));
				compName.setBounds(110, 286, 150, 30);
				compName.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
				compName.setForeground(new Color(115,115,115));
				compBackground.add(compName);
				
				//display the price of the current index by calling the getPrice method in the FileInput class 
				JLabel price = new JLabel("$"+FileInput.getPrice(index));
				price.setBounds(110, 316, 150, 25);
				price.setFont(new Font("Helvetica Neue", Font.BOLD, 20)); //set font and size
				compBackground.add(price);
				
				//create a button that will correspond with each product in the inventory based on the coordinate of the product
				if (r == 433 && c == 25) { //computer 1 (row 1, column 1)
					addToCart1 = new JButton(addToCartImage);
					addToCart1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart1.setBounds(250, 286, 72, 72);
					addToCart1.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart1);	
				}
				else if (r == 433 && c == 340) { //computer 2 (row 1, column 2)
					addToCart2 = new JButton(addToCartImage);
					addToCart2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart2.setBounds(250, 286, 72, 72);
					addToCart2.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart2);	
				}
				else if (r == 433 && c == 655) { //computer 3 (row 1, column 3)
					addToCart3 = new JButton(addToCartImage);
					addToCart3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart3.setBounds(250, 286, 72, 72);
					addToCart3.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart3);	
				}
				else if (r == 433 && c == 970) { //computer 4 (row 1, column 4)
					addToCart4 = new JButton(addToCartImage);
					addToCart4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart4.setBounds(250, 286, 72, 72);
					addToCart4.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart4);	
				}
				else if(r == 857 && c == 25) { //computer 5 (row 2, column 1)
					addToCart5 = new JButton(addToCartImage);
					addToCart5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart5.setBounds(250, 286, 72, 72);
					addToCart5.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart5);	
				}
				else if (r == 857 && c == 340) { //computer 6 (row 2, column 2)
					addToCart6 = new JButton(addToCartImage);
					addToCart6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart6.setBounds(250, 286, 72, 72);
					addToCart6.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart6);	
				}
				else if (r == 857 && c == 655) { //computer 7 (row 2, column 3)
					addToCart7 = new JButton(addToCartImage);
					addToCart7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart7.setBounds(250, 286, 72, 72);
					addToCart7.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart7);	
				}
				else if (r == 857 && c == 970) { //computer 8 (row 2, column 4)
					addToCart8 = new JButton(addToCartImage);
					addToCart8.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart8.setBounds(250, 286, 72, 72);
					addToCart8.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart8);	
				}
				else if(r == 1281 && c == 25) { //computer 9 (row 3, column 1)
					addToCart9 = new JButton(addToCartImage);
					addToCart9.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart9.setBounds(250, 286, 72, 72);
					addToCart9.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart9);	
				}
				else if (r == 1281 && c == 340) { //computer 10 (row 3, column 2)
					addToCart10 = new JButton(addToCartImage);
					addToCart10.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart10.setBounds(250, 286, 72, 72);
					addToCart10.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart10);	
				}
				else if (r == 1281 && c == 655) { //computer 11 (row 3, column 3)
					addToCart11 = new JButton(addToCartImage);
					addToCart11.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart11.setBounds(250, 286, 72, 72);
					addToCart11.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart11);	
				}
				else {
					addToCart12 = new JButton(addToCartImage); //computer 12 (row 3, column 4)
					addToCart12.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
					addToCart12.setBounds(250, 286, 72, 72);
					addToCart12.addActionListener(this); //add a listener that will determine if the button is clicked
					compBackground.add(addToCart12);	
				}
			}
		}
		
		//create a new instance of a JScrollPane to the background
		scrollPane = new JScrollPane(background);
		scrollPane.setBounds(0, 0, 1800, 790);
		
		//set the panel bounds and layout manager
		panel.setBounds(0, 0, 1800, 1000);
		panel.setLayout(null);
		
		//add the scroll pane to the panel
		//then add the panel to the frame
		panel.add(scrollPane);
		add(panel);
		
		//set the visibility of the window to true
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
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
		//ADD TO CART BUTTON ACTIONS
		if (e.getSource() == addToCart1) {
			Cart.laptopsInCart.add(FileInput.laptopArray[0]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart2) {
			Cart.laptopsInCart.add(FileInput.laptopArray[1]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart3) {
			Cart.laptopsInCart.add(FileInput.laptopArray[2]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart4) {
			Cart.laptopsInCart.add(FileInput.laptopArray[3]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart5) {
			Cart.laptopsInCart.add(FileInput.laptopArray[4]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart6) {
			Cart.laptopsInCart.add(FileInput.laptopArray[5]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart7) {
			Cart.laptopsInCart.add(FileInput.laptopArray[6]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart8) {
			Cart.laptopsInCart.add(FileInput.laptopArray[7]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart9) {
			Cart.laptopsInCart.add(FileInput.laptopArray[8]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart10) {
			Cart.laptopsInCart.add(FileInput.laptopArray[9]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart11) {
			Cart.laptopsInCart.add(FileInput.laptopArray[10]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		if (e.getSource() == addToCart12) {
			Cart.laptopsInCart.add(FileInput.laptopArray[11]); //add the product to the cart array list
			new Inventory(); //update the page by calling a new page
		}
		
	}
	
}
