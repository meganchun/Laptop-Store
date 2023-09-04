
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Professional extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Professional() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("Professional Window"); //sets title of this
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
		textArea.setText("WHAT IS PROFESSIONAL TYPE LAPTOP?\n\n"
				+ "     A professional laptop is a type of computer that is designed to meet the needs of professionals who \n"
				+ "require high-performance, reliability, and durability in their work. These laptops are typically used by \n"
				+ "individuals who work in fields such as engineering, architecture, graphic design, video editing, and other \n"
				+ "professions that require intensive processing power and advanced features.\r\n"
				+ "\r\n"
				+ "     Professional laptops often come with powerful processors, high-end graphics cards, large amounts of RAM\n"
				+ "and storage, and high-resolution displays. They may also have specialized features such as backlit keyboards, \n"
				+ "fingerprint scanners, and rugged designs that can withstand heavy use and travel. \r\n"
				+ "\r\n"
				+ "     In addition to the hardware specifications, professional laptops also come with advanced software tools \n"
				+ "and security features that are essential for many professionals. These may include specialized software \n"
				+ "applications for video editing or 3D modeling, as well as security features like biometric authentication and \n"
				+ "advanced encryption.\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThe conditions that define whether a professional-type laptop is good can vary depending on the needs of the \n"
				+ "user and the specific tasks it is intended to perform. However, some general criteria that are often used to \n"
				+ "evaluate the quality of professional laptops include:\r\n"
				+ "\r\n"
				+ "1. Performance: The laptop should have a powerful processor, plenty of memory (RAM), and a fast storage drive to \n"
				+ "   handle demanding tasks and large files.\r\n"
				+ "\r\n"
				+ "2. Graphics: For tasks that require high-quality graphics, the laptop should have a dedicated graphics card or a \n"
				+ "   high-end integrated graphics chip.\r\n"
				+ "\r\n"
				+ "3. Display: The laptop's screen should be large and high-resolution, with good color accuracy and brightness.\r\n"
				+ "\r\n"
				+ "4. Battery Life: The laptop should have a long-lasting battery that can last for several hours of continuous use, \n"
				+ "   to ensure that it can be used while on the go without needing to be charged constantly.\r\n"
				+ "\r\n"
				+ "5. Durability: Professional laptops should be sturdy and durable, with rugged cases and components that can withstand\n"
				+ "   regular travel and heavy use.\r\n"
				+ "\r\n"
				+ "6. Connectivity: The laptop should have plenty of ports for connecting peripherals and external devices, such as \n"
				+ "   USB ports, HDMI ports, and Ethernet ports.\r\n"
				+ "\r\n"
				+ "7. Security: Professional laptops should have strong security features, such as biometric authentication, encryption,\n"
				+ "   and remote tracking and wiping capabilities, to protect sensitive data.\r\n"
				+ "\r\n"
				+ "Overall, a good professional laptop should be able to handle the demanding tasks of its intended use while offering a \n"
				+ "reliable and durable design that can withstand frequent travel and heavy use.\r\n"
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