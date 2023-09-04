
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Ram extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Ram() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("RAM Window"); //sets title of this
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
		textArea.setText("WHAT IS \"RAM\"?\n\n"
				+ "     RAM stands for Random Access Memory, and it is a type of computer memory that is used to temporarily \n"
				+ "store data and instructions that a computer's CPU needs to access quickly. RAM is an essential component of\n"
				+ "a computer's system, as it allows the CPU to read and write data much faster than it could from a hard disk \n"
				+ "or solid-state drive.\r\n"
				+ "\r\n"
				+ "     When you open a program or file on your computer, it is loaded into RAM so that the CPU can access it \n"
				+ "quickly when needed. The more RAM your computer has, the more programs it can run simultaneously without \n"
				+ "slowing down. However, when you turn off your computer, the data stored in RAM is erased, which is why files\n"
				+ "and programs are still saved to a hard drive or SSD.\r\n"
				+ "\r\n"
				+ "     There are different types of RAM, including DDR3, DDR4, and DDR5, each with different speeds and capacities.\n"
				+ "RAM is measured in bytes, with most modern computers having at least 8 GB or more of RAM to handle multiple tasks\n"
				+ "at once.\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThe quality and performance of RAM (Random Access Memory) can be determined by several factors, including:\r\n"
				+ "\r\n"
				+ "1. Capacity: The amount of RAM in a computer determines the amount of data it can process at once. Generally, the\n"
				+ "   more RAM a computer has, the better its performance will be, especially when running memory-intensive applications\n"
				+ "   or multitasking.\r\n"
				+ "\r\n"
				+ "2. Speed: The speed of RAM is measured in MHz or GHz and determines how quickly data can be read from or written to \n"
				+ "   the RAM. Faster RAM generally results in better overall system performance.\r\n"
				+ "\r\n"
				+ "3. Latency: The latency of RAM refers to the delay between when a request for data is made and when that data is \n"
				+ "   delivered. Lower latency RAM can provide faster access times and improved performance.\r\n"
				+ "\r\n"
				+ "4. Timings: RAM timings refer to the various delays involved in reading and writing data to and from the RAM. Lower\n"
				+ "   timings can result in faster access times and improved performance.\r\n"
				+ "\r\n"
				+ "5. Compatibility: It is important to ensure that the RAM is compatible with the motherboard and CPU of the computer.\n"
				+ "   Incompatible RAM may not work or may cause stability issues.\r\n"
				+ "\r\n"
				+ "6. Error-Correction: Error-correcting code (ECC) RAM can detect and correct errors that occur during data storage and\n"
				+ "   retrieval. This can be important in mission-critical systems where data accuracy is essential.\r\n"
				+ "\r\n"
				+ "In summary, a good RAM module should have a sufficient capacity, high speed, low latency and timings, compatibility \n"
				+ "   with the system, and error-correction capabilities (if necessary).\r\n"
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