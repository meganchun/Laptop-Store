/*
 * Group #4: Megan Chun
 * May 8th, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * SPD Project (Computer BOSS Store)
 * 
 * This file will display the GUI of the cart by displaying all the items in the user's cart, their sub-total and total
 * 
 * Major skills: 
 * - array list
 * - for loops
 * 
 * Added Features: 
 * - displays order summary (sub-total, tax, shipping cost and total)
 * - displays the picture of all the items added to the cart
 * 
 * Areas of Concern: 
 * - checkout button is non-functional
 * 
 * Contribution:
 * - 100% Megan (Cart class and its methods)
 * 
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Cart extends JFrame implements ActionListener{
	
	//items in cart array
	public static ArrayList<Laptop> laptopsInCart = new ArrayList<Laptop>();

	//background image
	JLabel background = new JLabel(new ImageIcon("images/cartBackgroundLarge.png"));
	
	//MENU BAR
	Icon logo = new ImageIcon("images/computerLogo.png");
	JButton computerLogo = new JButton(logo);	
	JButton shopBtn; //Inventory button
	JButton surveyBtn; //Survey button
	JButton education; //Education button
	Icon cart = new ImageIcon("images/cart.png"); //image of the cart
	JButton cartBtn = new JButton(cart); //turn the image of the cart into a button
	
	//Declare a new JScrollPane and JPanel for the scroll
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	//Checkout button
	Icon checkout = new ImageIcon("images/checkoutButton.png"); //create an icon of the image
	JButton checkoutBtn = new JButton(checkout); //turn the image into a button
	
	
	
	public Cart() {

		//setting the foundation of the window
		setSize(1400,800); //window size
		setTitle("Cart"); //title
		setLocationRelativeTo(null); //open window in the center of the screen
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //makes the window non re-sizable
			
		//background image
		background.setBounds(0,0,1400,3834);
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
		
		//education button
		education = new JButton("Learn More");
		education.setBounds(771,95,200,29);
		education.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		education.setOpaque(false);
		education.setContentAreaFilled(false);
		education.setBorderPainted(false);
		education.addActionListener(this); //add a listener that will determine if the button is clicked
		background.add(education);
		
		//cart button
		background.add(cartBtn);
		cartBtn.setBounds(1280,90,37,39);
		cartBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
		cartBtn.addActionListener(this); //add a listener that will determine if the button is clicked
		
		JLabel numItems = new JLabel(Integer.toString(laptopsInCart.size()));
		numItems.setBounds(0, 0, 10, 10);
		numItems.setFont(new Font("Helvetica Neue", Font.PLAIN,15));
		cartBtn.add(numItems);

		//declare and initialize variables for the sub-total, total, shipping and tax amount
		double subtotal = 0;
		double total = 0;
		double tax;
		double shipping = 10;
		
		
		int itemNumber = 0; //variable that will track of the number of items
		int numOfItems = laptopsInCart.size(); //determine the number of items in the cart using the .size() method
		
		//if the amount of items is zero, the program will display a special message, else it will display the items in the cart
		//if there are items in the cart
		if (numOfItems != 0) {
			
			//cart title label
			JLabel cartTitle = new JLabel("Your Cart");
			cartTitle.setBounds(136, 225, 135, 36);
			cartTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
			background.add(cartTitle);
			
			//for loop that will iterate through all the items in the cart and display them in increasing y-coordinate values
			for (int i = 296; i < 1000000; i += 250) {
				
				//add background for each item in the cart to hold the information
				JLabel cartBackground = new JLabel(new ImageIcon("images/cartBackground.png"));
				cartBackground.setBounds(136, i, 710, 251);
				background.add(cartBackground);	
				
				//create a container for each item in the cart, that will allow other items to be placement and arranged on top of it
				JLabel compBackground = new JLabel(new ImageIcon("images/checkoutCompBackground.png"));
				compBackground .setBounds(0, 10, 234, 234);
				cartBackground.add(compBackground);	
				
				//display the image of the computer added to the cart
				int laptopNum = getItemNumber(itemNumber)+1;  //determine which computer was added to the cart by calling the getItemNumber method
				JLabel computerImage = new JLabel(new ImageIcon("images/laptops/laptopSmall"+laptopNum+".png")); //display the image based on which item it is
				computerImage.setBounds(30, 30, 165, 165);
				compBackground.add(computerImage);
				
				//display the name of the computer
				JLabel name = new JLabel(getName(itemNumber)); //use the get name method to get the name of the corresponding computer
				name.setBounds(260, 46, 276, 36);
				name.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
				cartBackground.add(name);
				
				//display the price of the computer
				JLabel price = new JLabel("$"+Double.toString(getPrice(itemNumber))); //use the getPrice method to the the price of the computer and convert it to a string
				price.setBounds(260, 93, 130, 36);
				price.setFont(new Font("Helvetica Neue", Font.BOLD,20));
				cartBackground.add(price);
				
				//keeping a running total of the sub-total by adding the price of each item which it iterates
				subtotal += getPrice(itemNumber);

				//increase the current item number to keep track of how many items were already displayed
				itemNumber++;
		
				//check to see if there any more items in the cart
				//if the current item number is equal to the total number of items in the cart, the program as displayed all the cart items
				if (itemNumber >= numOfItems) {
					//break the loop
					break;
				}
				else
					continue;
			}
		}
		//if the cart does not have any items
		else {
			JLabel cartTitle = new JLabel("Your Cart Is Empty :("); //display a message informing the user they have no items in the cart
			cartTitle.setBounds(136, 225, 500, 36);
			cartTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
			background.add(cartTitle);
		}
		
		//CHECKOUT BOX
		//background of the checkout information that will act as a container for the information
		JLabel checkoutBackground = new JLabel(new ImageIcon("images/checkoutBox.png"));
		checkoutBackground.setBounds(910, 296, 445, 558);
		background.add(checkoutBackground);
		
		//header label of the checkout summary
		JLabel summaryLabel = new JLabel("CHECKOUT SUMMARY");
		summaryLabel.setBounds(81, 77, 270, 24);
		summaryLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		checkoutBackground.add(summaryLabel);
		
		//sub-total cost label
		JLabel subtotalLabel = new JLabel("Subtotal");
		subtotalLabel.setBounds(81, 138, 100, 24);
		subtotalLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(subtotalLabel);
		
		//display the numeric value of the sub-total
		String subtotalStr = String.format("%,.2f", subtotal); //change sub-total from a double to a string and format to 2 decimal places with commas
		JLabel subtotalNum = new JLabel("$"+subtotalStr);
		subtotalNum.setBounds(260, 138, 150, 24);
		subtotalNum.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(subtotalNum);
		
		//shipping cost label
		JLabel shippingLabel = new JLabel("Shipping");
		shippingLabel.setBounds(81, 194, 100, 24);
		shippingLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(shippingLabel);
		
		//display shipping cost value
		JLabel shippingNum = new JLabel("$10.00");
		shippingNum.setBounds(260, 194, 150, 24);
		shippingNum.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(shippingNum);
		
		//tax cost
		tax = subtotal * 0.13; //find 13% of the sub-total
		String taxStr = String.format("%,.2f", tax); //create a string of the tax value, format to 2 decimal places and commas 
		
		//tax label
		JLabel taxLabel = new JLabel("GST/HST");
		taxLabel.setBounds(81, 253, 100, 24);
		taxLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(taxLabel);
		
		//tax value
		JLabel taxNum = new JLabel("$"+taxStr);
		taxNum.setBounds(260, 253, 150, 24);
		taxNum.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(taxNum);
		
		//line separator label
		JLabel line = new JLabel("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
		line.setBounds(81, 321, 300, 5);
		line.setForeground(new Color(217,217,217));
		line.setFont(new Font("Helvetica Neue", Font.PLAIN, 20)); //set font and size
		checkoutBackground.add(line); 
		
		//calculate the total cost
		total = subtotal + tax + shipping; //add he sub-total, tax and shipping cost together
		String totalStr = String.format("%,.2f", total); //format to 2 decimal places with commas
		JLabel totalLabel = new JLabel("Total");
		totalLabel.setBounds(81, 370, 100, 50);
		totalLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 30)); //set font and size
		checkoutBackground.add(totalLabel);
		
		//display the total value
		JLabel totalNum = new JLabel("$"+totalStr);
		totalNum.setBounds(220, 370, 300, 24);
		totalNum.setFont(new Font("Helvetica Neue", Font.PLAIN, 30)); //set font and size
		checkoutBackground.add(totalNum);
		
		//checkout button (non functional)
		checkoutBtn.setBounds(15, 440, 400, 66);
		checkoutBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		checkoutBackground.add(checkoutBtn);

		//create a new instance of a JScrollPane to the background
		scrollPane = new JScrollPane(background);
		scrollPane.setBounds(0, 0, 1800, 790); //set the bounds of the scroll area
		
		//set the panel bounds and layout manager
		panel.setBounds(0, 0, 1800, 1000);
		panel.setLayout(null);
		
		//add the scroll pane to the panel
		//then add the panel to the frame
		panel.add(scrollPane);
		add(panel);
		
		//set the window and it's contents to visible
		setVisible(true);

	}
	//getItemNumber method will return the number value of laptop i by calling the getLaptopNum method for the laptop object
	public static int getItemNumber(int i) {
		return laptopsInCart.get(i).getLaptopNum();
	}
	
	//getName method will return the name of laptop i by calling the getModel method for the laptop object
	public static String getName(int i) {
		return laptopsInCart.get(i).getModel();
	}
	//getPrice method will return the price of laptop i by calling the getPrice method for the laptop object
	public static double getPrice(int i) {
		
		return laptopsInCart.get(i).getPrice();
	}
	//actionPerformed method will determine the events of an action
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		//MENU BAR ACTIONS
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
	}

}
