/*
 * Group 4 - Shreeya Champaneri, Megan Chun, Bella Cai, Joe Zhou
 * 
 * Shreeya C.
 * May 12, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * Title: Computer BOSS Survey
 * 
 * Description: This is the Survey Frame which will display questions 
 * and give the user options regarding different computer attributes 
 * (type, price, brand, storage) through combo boxes 
 * to be processed by the Survey Results page to determine 
 * the best computer choices for the user.
 * 
 * Major skills: 
 * Arrays + methods
 * GUI elements (JLabel, JButton, JPanel, JFrame, JComboBox, etc.)
 * Action listener
 * Receive user input from combo boxes 
 * and collect answers when the result button is clicked
 * 
 * Added features: images, comboboxes, home button
 * 
 * Areas of concern: none
 * 
 * Contribution:
 * Shreeya - SurveyFrame.java - 97%
 * Megan - 3% (Added action listeners to buttons)
 * SurveyFrame() - Shreeya
 * actionPerformed(ActionEvent e) - Shreeya, Megan
 */

//import statements
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class SurveyFrame extends JFrame implements ActionListener {

	// create label for images
	JLabel laptopImg = new JLabel();
	JLabel brandImg = new JLabel();
	JLabel moneyImg = new JLabel();
	JLabel storageImg = new JLabel();

	// new panel for survey
	JPanel surveyPanel = new JPanel();

	// array to store user answers
	String[] answerArray = new String[4];

	// create a button to go back to the home page
	JButton homeButton = new JButton("🏠 Home");

	// create result button
	JButton resultButton = new JButton("Recommend a laptop!");

	// String arrays to hold answer options
	String[] typeArray = { "Students", "Professionals", "Gaming" };
	String[] priceArray = { "Budget", "Mid-priced", "High end", "Ultra" };
	String[] brandArray = { "HP", "Lenovo", "Apple", "ASUS", "MSI" };
	String[] storageArray = { "64", "128", "256", "512", "1000", "4000" };

	// initialize dropdown buttons for answer options
	JComboBox comboBox_1 = new JComboBox(typeArray);
	JComboBox comboBox_2 = new JComboBox(priceArray);
	JComboBox comboBox_3 = new JComboBox(brandArray);
	JComboBox comboBox_4 = new JComboBox(storageArray);

	SurveyFrame() {

		// design result button
		resultButton.setBounds(461, 587, 335, 71);
		resultButton.setFont(new Font("Arial", Font.PLAIN, 20));
		resultButton.addActionListener(this);
		surveyPanel.add(resultButton);

		// design home button
		homeButton.setBounds(20, 19, 98, 37);
		homeButton.setFont(new Font("Arial", Font.PLAIN, 16));
		homeButton.addActionListener(this);
		surveyPanel.add(homeButton);

		// design survey panel
		surveyPanel.setLayout(null);
		surveyPanel.setBounds(73, 36, 1250, 696);
		surveyPanel.setBackground(Color.decode("#307FE9"));

		// design frame
		getContentPane().setLayout(null);
		setTitle("Computer BOSS Survey"); // sets title
		setResizable(false); // if we don't want the user to be able to change the size
		setSize(1400, 800); // sets the x-dimension and y-dimension
		getContentPane().add(surveyPanel); // add survey panel to the frame
		getContentPane().setBackground(Color.WHITE); // make background white

		// add icon
		ImageIcon laptopIcon = new ImageIcon("images/boss.jpeg");
		setIconImage(laptopIcon.getImage());
		getContentPane().setLayout(null);

		// add survey instructions
		String instructions = "<html><center> " + "Answer the following questions to "
				+ "find the best laptops for you!</html>";
		JLabel label = new JLabel(); // label to add text to panel
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(192, 6, 1140, 79);
		label.setFont(new Font("Arial", Font.BOLD, 28));
		label.setText(instructions);
		surveyPanel.add(label);

		// ------------------------------------------------------------------------------

		// question 1

		JLabel question1 = new JLabel();
		question1.setBounds(61, 122, 376, 22);
		question1.setForeground(new Color(255, 255, 255));
		question1.setFont(new Font("Arial", Font.BOLD, 20));
		String type = "What type of computer would you like?";
		question1.setText(type);
		surveyPanel.add(question1);
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBox_1.setBounds(253, 167, 184, 27);
		comboBox_1.addActionListener(this);
		surveyPanel.add(comboBox_1);

		// image
		laptopImg.setIcon(new ImageIcon("images/laptop.png"));
		laptopImg.setBounds(61, 167, 161, 161);
		surveyPanel.add(laptopImg);

		// ------------------------------------------------------------------------------

		// question 2

		JLabel question2 = new JLabel();
		question2.setVerticalAlignment(SwingConstants.TOP);
		question2.setBounds(764, 121, 282, 147);
		question2.setForeground(new Color(255, 255, 255));
		question2.setFont(new Font("Arial", Font.BOLD, 20));
		String priceq = ("<html><p style = text-align:right>What is your price range? "
				+ "<br> Budget - below $500 <br> " + "Mid-priced - $500 - $1000 <br> "
				+ "High-end - $1000 - $2000 <br> " + "Ultra - $2000+</p></html>");
		question2.setText(priceq);
		surveyPanel.add(question2);
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBox_2.setBounds(844, 264, 175, 29);
		comboBox_2.addActionListener(this);
		surveyPanel.add(comboBox_2);

		// image
		moneyImg.setIcon(new ImageIcon("images/money.png"));
		moneyImg.setBounds(1040, 122, 161, 161);
		surveyPanel.add(moneyImg);

		// ------------------------------------------------------------------------------

		// question 3

		JLabel question3 = new JLabel();
		question3.setBounds(61, 380, 258, 22);
		question3.setForeground(new Color(255, 255, 255));
		question3.setFont(new Font("Arial", Font.BOLD, 20));
		String brandq = "What brand do you prefer?";
		question3.setText(brandq);
		surveyPanel.add(question3);
		comboBox_3.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBox_3.setBounds(253, 420, 184, 27);
		comboBox_3.addActionListener(this);
		surveyPanel.add(comboBox_3);

		// image
		brandImg.setIcon(new ImageIcon("images/brand.png"));
		brandImg.setBounds(61, 420, 161, 161);
		surveyPanel.add(brandImg);

		// ------------------------------------------------------------------------------

		// question 4

		JLabel question4 = new JLabel();
		question4.setBounds(783, 380, 418, 22);
		question4.setForeground(new Color(255, 255, 255));
		question4.setFont(new Font("Arial", Font.BOLD, 20));
		String storage = "How much storage would you like? (in GB)";
		question4.setText(storage);
		surveyPanel.add(question4);
		comboBox_4.setBounds(844, 420, 175, 37);
		comboBox_4.addActionListener(this);
		surveyPanel.add(comboBox_4);

		// image
		storageImg.setIcon(new ImageIcon("images/storage.png"));
		storageImg.setBounds(1040, 420, 161, 161);
		surveyPanel.add(storageImg);

		// ------------------------------------------------------------------------------

		// make everything visible
		setVisible(true);

	}

	// when the result button is pressed, store the user answers in an array
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == resultButton) {

			answerArray[0] = (String) comboBox_1.getSelectedItem();
			answerArray[1] = (String) comboBox_2.getSelectedItem();
			answerArray[2] = (String) comboBox_3.getSelectedItem();
			answerArray[3] = (String) comboBox_4.getSelectedItem();

			// pass answers to the survey result file and open the results page
			SurveyResult.getMatches(answerArray);
			setVisible(false);
			new ResultsFrame();

		}
		
		// if the user presses the home button bring them back to the homepage
		if (e.getSource() == homeButton) {
			// Go back to home page
			setVisible(false);
			new Homepage();

		}

	}
}
