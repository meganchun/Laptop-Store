/*
 * Group #4: Megan Chun
 * May 15th, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * SPD Project (Computer BOSS Store)
 * 
 * This file display a homepage page that will give users the option to checkout our inventory, do a survey, or learn more
 * 
 * Major skills: 
 * - JButtons
 * - GUI (JFrame)
 * 
 * Added Features: 
 * - options to view inventory, survey, education or cart
 * 
 * Areas of Concern: none
 * 
 * Contribution:
 * - 100% Megan (Homepage class and its methods)
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

public class Homepage extends JFrame implements ActionListener{
	
	JLabel background = new JLabel(new ImageIcon("images/backgroundSmallWhite.png"));
	
	Icon logo = new ImageIcon("images/computerLogo.png");
	JButton computerLogo = new JButton(logo);	
	JButton shopBtn; //Inventory button
	JButton surveyBtn; //Survey button
	JButton educationBtn; //educationBtnBtn button
	Icon cart = new ImageIcon("images/cart.png");
	JButton cartBtn = new JButton(cart);

	
	Icon computer = new ImageIcon("images/computerImage.png");
	JButton computerImage = new JButton(computer);
	
	Icon startButton = new ImageIcon("images/getStarted.png");
	JButton getStarted = new JButton(startButton);
	
	public Homepage() {
		
		//setting the foundation of the window
		setSize(1400,800); //window size
		setTitle("Your Results");
		setLocationRelativeTo(null); //open window in the center of the screen
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //set size, user can't change the size of window
		
		//set the background bounds
		background.setBounds(0,0,1400,800);
		
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
		numItems.setBounds(0, 25, 5, 2);
		numItems.setFont(new Font("Helvetica Neue", Font.PLAIN,15)); //set font and size
		cartBtn.add(numItems);
		
		//title label for homepage
		JLabel title1 = new JLabel("Welcome To");
		title1.setBounds(123,250,470,146);
		title1.setFont(new Font("Helvetica Neue", Font.PLAIN, 60));
		background.add(title1);
		
		//title label for homepage
		JLabel title2 = new JLabel("Computer BOSS");
		title2.setBounds(123,330,470,146);
		title2.setForeground(new Color(33,116,241));
		title2.setFont(new Font("Helvetica Neue", Font.BOLD, 60));
		background.add(title2);
		
		//image of a computer
		background.add(computerImage);
		computerImage.setBounds(900,200,646,400);
		computerImage.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//get started button the front page
		background.add(getStarted);
		getStarted.setBounds(123,500,374,58);
		getStarted.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		getStarted.addActionListener(this);
		
		add(background); //add the background to the frame
		setVisible(true); //set the frame to visible
			
		
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
		if (e.getSource() == educationBtn) {
			setVisible(false);
			new EducationFrame();
		}
		if (e.getSource() == getStarted) {
			setVisible(false);
			new SurveyFrame();
		}
	}
}
