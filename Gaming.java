
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Gaming extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Gaming() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("Gaming Window"); //sets title of this
		setResizable(false); //if we don't want the user to be able to change the size
		setSize(1400, 800); //this sets the x-dimension and y-dimension of the this
		setVisible(true); //this will make the this visible 
		
		ImageIcon laptopIcon = new ImageIcon("images/laptop.png"); //create an ImageIcon
		setIconImage(laptopIcon.getImage()); //change icon of this
		getContentPane().setBackground(Color.gray);
		
		//set the text for the text area 
		//set the text area so that its contents cannot be changed
		//by the user
		textArea.setSize(1100,700);
		textArea.setText("WHAT IS GAMING TYPE LAPTOP?\n\n"
				+ "     A gaming laptop is a type of laptop computer that is designed specifically for playing high-end video\n"
				+ "games. These laptops are built with powerful hardware components, such as a fast processor, high-end graphics\n"
				+ "card, plenty of RAM, and fast storage drives. They often have a larger screen size and higher screen refresh \n"
				+ "rates to provide a more immersive gaming experience.\r\n"
				+ "\r\n"
				+ "     Gaming laptops typically feature advanced cooling systems, as high-performance hardware generates a lot \n"
				+ "of heat during intense gaming sessions. They also come with specialized features, such as customizable keyboard\n"
				+ "lighting and macro keys, to enhance the gaming experience.\r\n"
				+ "\r\n"
				+ "     However, gaming laptops tend to be more expensive than regular laptops, and they may be heavier and bulkier\n"
				+ "due to the additional hardware. Additionally, they may have shorter battery life due to their high-power consumption.\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThere are several factors to consider when determining if a gaming laptop is good. Here are some of the key factors\n"
				+ "to keep in mind:\r\n"
				+ "\r\n"
				+ "1. Processor: A good gaming laptop should have a powerful processor, such as an Intel Core i7 or i9 or an AMD Ryzen\n"
				+ "   7 or 9. The processor should have multiple cores and high clock speeds to handle demanding games.\r\n"
				+ "\r\n"
				+ "2. Graphics Card: The graphics card is one of the most important components in a gaming laptop. Look for a dedicated\n"
				+ "   graphics card with a good amount of video RAM (VRAM) to handle modern games at high settings. Nvidia and AMD are \n"
				+ "   the leading manufacturers of graphics cards for gaming laptops.\r\n"
				+ "\r\n"
				+ "3. RAM: A good gaming laptop should have at least 8GB of RAM, although 16GB or more is preferable for more demanding\n"
				+ "   games. Make sure the RAM is of a high speed, such as DDR4.\r\n"
				+ "\r\n"
				+ "4. Storage: A gaming laptop should have fast storage, such as a solid-state drive (SSD), to ensure fast load times for\n"
				+ "   games and applications. A hard disk drive (HDD) can be used for additional storage, but it should not be the primary\n"
				+ "   storage device.\r\n"
				+ "\r\n"
				+ "5. Display: A good gaming laptop should have a high-quality display with a fast refresh rate (at least 120Hz) and low\n"
				+ "   response time to provide a smooth and immersive gaming experience. Look for displays with a resolution of at least\n"
				+ "   1080p (Full HD) or higher.\r\n"
				+ "\r\n"
				+ "6. Cooling: Gaming laptops tend to generate a lot of heat, so a good cooling system is important to prevent thermal \n"
				+ "   throttling and maintain performance over extended gaming sessions. Make sure the laptop has a sufficient number of\n"
				+ "   fans and heat sinks, and consider laptops with advanced cooling solutions such as liquid metal or vapor chamber cooling.\r\n"
				+ "\r\n"
				+ "7. Battery Life: While gaming laptops are not known for their long battery life, a good gaming laptop should still have\n"
				+ "   a decent battery life to allow for portable use. Look for laptops with a battery life of at least 4-5 hours, although\n"
				+ "   6-8 hours or more is preferable.\r\n"
				+ "\r\n"
				+ "Overall, a good gaming laptop should have a powerful combination of CPU, graphics card, RAM, storage, display, cooling, \n"
				+ "and battery life to deliver a smooth and enjoyable gaming experience.\r\n"
				+ "");
		textArea.setEditable(false);
		
		//create the scroll pane with the text area
		//and set the bounds for the scroll pane
		//*note the text area will have the same bounds
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(25, 25, 1100, 700);
		
		//set the panel bounds, color and layout manager
		panel.setBounds(25, 25, 400, 150);
		panel.setBackground(new Color(0x7F9DDB));
		panel.setLayout(null);
		
		//add the scroll pane to the panel
		//then add the panel to the this
		panel.add(scrollPane);
		this.add(panel);
	}
	

}