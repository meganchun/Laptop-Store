
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Ssd extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Ssd() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("SSD Window"); //sets title of this
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
		textArea.setText("WHAT IS \"SSD\"?\n\n"
				+ "     SSD stands for Solid State Drive, which is a type of data storage device that uses flash memory to store "
				+ "data. Unlike traditional hard disk drives (HDDs), SSDs have no moving parts, which makes them faster, more \n"
				+ "durable,and more reliable. SSDs are also quieter and consume less power than HDDs.\r\n"
				+ "\r\n"
				+ "     SSDs are available in a variety of form factors, including 2.5-inch drives for desktop and laptop computers,\n"
				+ "as well as smaller drives for use in tablets, smartphones, and other mobile devices. SSDs connect to a computer \n"
				+ "using various interfaces such as SATA, PCIe, and NVMe.\r\n"
				+ "\r\n"
				+ "     Because SSDs have no moving parts, they are less susceptible to physical damage and can operate in harsher\n"
				+ "environments than traditional hard drives. They are also much faster than HDDs, with read and write speeds that\n"
				+ "can be several times faster. This makes them ideal for use in high-performance computing, gaming, and other \n"
				+ "applications that require fast data access and transfer speeds.\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThere are several factors that can be used to determine whether an SSD (Solid State Drive) is good or not.Some \n"
				+ "of the most important factors to consider include:\r\n"
				+ "\r\n"
				+ "1. Speed: The speed of an SSD is a crucial factor in determining its overall performance. The faster an SSD can \n"
				+ "   read and write data, the better its performance will be. Speed is typically measured in terms of sequential read\n"
				+ "   and write speeds, as well as random read and write speeds. Look for an SSD with high sequential and random read \n"
				+ "   and write speeds for better performance.\r\n"
				+ "\r\n"
				+ "2. Capacity: The capacity of an SSD is another important factor to consider. SSDs come in different storage \n"
				+ "   capacities, ranging from a few hundred gigabytes to several terabytes. Choose an SSD with a capacity that is \n"
				+ "   suitable for your needs.\r\n"
				+ "\r\n"
				+ "3. Durability: SSDs are generally more durable than traditional hard drives, but the durability can vary between \n"
				+ "   different models. Look for an SSD that is designed for high endurance and has a long lifespan.\r\n"
				+ "\r\n"
				+ "4. Reliability: Reliability is a crucial factor when it comes to storage devices. Look for an SSD with a low failure\n"
				+ "   rate and good customer reviews.\r\n"
				+ "\r\n"
				+ "5. Price: SSDs are generally more expensive than traditional hard drives, but the price can vary widely between \n"
				+ "   different models. Look for an SSD that offers a good balance between price and performance.\r\n"
				+ "\r\n"
				+ "By considering these factors, you can determine whether an SSD is good or not based on your specific needs and \n"
				+ "requirements.\r\n"
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