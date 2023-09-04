
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Cpu extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Cpu() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("CPU Window"); //sets title of this
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
		textArea.setText("WHAT IS \"CPU\"?\n\n"
				+ "     CPU stands for Central Processing Unit. It is the primary component of a computer system responsible \n"
				+ "for carrying out instructions of a computer program. The CPU is also known as the brain of the computer, as\n"
				+ " it performs arithmetic and logic operations, controls the input/output of data, and manages the flow of "
				+ "\ninformation between the computer's other components.\r\n"
				+ "\r\n"
				+ "     The CPU is made up of several components, including the control unit, which fetches instructions from\n"
				+ "memory and manages the execution of those instructions, and the arithmetic and logic unit (ALU), which \n"
				+ "performs arithmetic and logical operations on data. The CPU also includes registers, which are small, \n"
				+ "high-speed memory locations used for temporary storage of data and instructions.\r\n"
				+ "\r\n"
				+ "     The performance of a CPU is typically measured by its clock speed, which is the number of instructions \n"
				+ "it can execute per second, as well as its cache size, which is a small amount of fast memory used for temporary\n"
				+ " storage of frequently accessed data. The CPU is a critical component of any computer system and plays a crucial \n"
				+ "role in determining the overall performance and capabilities of the system.\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThe performance of a CPU can be evaluated based on several factors, including:\r\n"
				+ "\r\n"
				+ "1. Clock speed: The clock speed of a CPU determines how fast it can execute instructions. A higher clock\n"
				+ "  speed generally means faster processing times.\r\n"
				+ "\r\n"
				+ "2. Number of cores: The number of cores in a CPU determines how many tasks it can perform simultaneously.\n"
				+ "  A CPU with multiple cores can handle more tasks at once, which can lead to better performance in certain \n"
				+ "types of applications.\r\n"
				+ "\r\n"
				+ "3. Cache size: The cache is a small amount of fast memory used for temporary storage of frequently accessed \n"
				+ "  data. A larger cache can improve performance by reducing the time it takes for the CPU to access frequently\n"
				+ "  used data.\r\n"
				+ "\r\n"
				+ "4. Instruction set: The instruction set of a CPU determines the types of operations it can perform. A CPU with\n"
				+ "  a more advanced instruction set can perform more complex operations, which can lead to better performance in \n"
				+ "  certain types of applications.\r\n"
				+ "\r\n"
				+ "5. Power consumption: The power consumption of a CPU can impact its performance, as CPUs that consume less power \n"
				+ "  tend to run cooler and can be more efficient.\r\n"
				+ "\r\n"
				+ "6. Price: The price of a CPU is an important consideration for many users, as it can impact the overall cost of a \n"
				+ "  computer system. A CPU that offers good performance for its price may be considered a good value.\r\n"
				+ "\r\n"
				+ "Ultimately, the definition of a \"good\" CPU will depend on the user's specific needs and requirements. For example, \n"
				+ "a high-end CPU with a high clock speed and multiple cores may be ideal for demanding applications such as video \n"
				+ "editing or gaming, while a lower-end CPU with a lower price point may be sufficient for basic computing tasks such \n"
				+ "as web browsing and word processing.");
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