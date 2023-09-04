
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class More extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	More() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("MORE Window"); //sets title of this
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
		textArea.setText("WHEN BUYING LAPTOP YOU NEED TO KNOW...\n\n"
				+ "When buying a laptop, there are several factors to consider to ensure that you get the best value for your \n"
				+ "money. Here are some of the key things you should know or care about when buying a laptop:\r\n"
				+ "\r\n"
				+ "1. Purpose: First, consider your needs and the purpose of the laptop. Will you be using it for work, school, \n"
				+ "   entertainment, or gaming? Different types of laptops are optimized for different purposes, so it's important\n"
				+ "   to choose one that suits your needs.\r\n"
				+ "\r\n"
				+ "2. Size and Portability: The size and portability of the laptop can also be important factors, especially if you\n"
				+ "   need to take it with you on the go. Smaller laptops are generally more portable, but larger laptops may have \n"
				+ "   better performance or more features.\r\n"
				+ "\r\n"
				+ "3. Processor: The processor is one of the most important components of a laptop, as it determines the speed and \n"
				+ "   performance of the system. Look for a processor with multiple cores and high clock speeds, such as an Intel \n"
				+ "   Core i5 or i7 or an AMD Ryzen 5 or 7.\r\n"
				+ "\r\n"
				+ "4. RAM: The amount of RAM in a laptop can also impact its performance. Look for at least 8GB of RAM, although 16GB\n"
				+ "   or more is preferable for more demanding tasks.\r\n"
				+ "\r\n"
				+ "5. Storage: The type and amount of storage in a laptop can also be important. Solid-state drives (SSDs) are faster\n"
				+ "   and more reliable than traditional hard disk drives (HDDs), so consider a laptop with an SSD for better performance.\n"
				+ "   You should also look for enough storage capacity to meet your needs, whether that's 256GB, 512GB, or more.\r\n"
				+ "\r\n"
				+ "6. Display: The display quality can also be important, especially if you plan to use the laptop for tasks such as \n"
				+ "   graphic design or video editing. Look for a laptop with a high-quality display, with at least a Full HD (1080p) \n"
				+ "   resolution and good color accuracy.\r\n"
				+ "\r\n"
				+ "7. Battery Life: The battery life of a laptop can impact how long you can use it on a single charge. Look for laptops \n"
				+ "   with a battery life of at least 6-8 hours, although some models may offer even longer battery life.\r\n"
				+ "\r\n"
				+ "8. Price: Finally, consider the price of the laptop and your budget. More expensive laptops tend to have better \n"
				+ "   performance and features, but you can often find good value in mid-range laptops that offer a balance of performance\n"
				+ "   and affordability.\r\n"
				+ "\r\n"
				+ "By considering these factors, you can choose a laptop that meets your needs and provides the best value for your money.");
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