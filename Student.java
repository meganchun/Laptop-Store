
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Student extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Student() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("Student Window"); //sets title of this
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
		textArea.setText("WHAT IS STUDENT TYPE LAPTOP?\n\n"
				+ "     A student type laptop is a laptop computer that is specifically designed for use by students. These \n"
				+ "laptops are typically lightweight, portable, and offer a good balance of performance, battery life, and \n"
				+ "affordability.\r\n"
				+ "\r\n"
				+ "     Student-type laptops often have features that are tailored to the needs of students, such as long \n"
				+ "battery life, durable construction, and a comfortable keyboard for typing long assignments. They may also \n"
				+ "have features such as a webcam for video conferencing, a touchscreen display, and access to educational \n"
				+ "software and tools.\r\n"
				+ "\r\n"
				+ "     Some common specifications for student type laptops include an Intel Core i5 or i7 processor, 8GB or \n"
				+ "16GB of RAM, and a solid-state drive (SSD) for fast storage and boot times. They may also have a display \n"
				+ "size between 11 and 15 inches, and a weight of less than 3 or 4 pounds for easy portability.\r\n"
				+ "\r\n"
				+ "     Overall, a student type laptop is designed to be a reliable and affordable option for students who \n"
				+ "need a computer for everyday use, including taking notes, writing papers, and conducting research\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThe conditions to define if a laptop is good for student use can vary based on individual needs and \n"
				+ "preferences, but some general considerations include:\r\n"
				+ "\r\n"
				+ "1. Performance: A good student laptop should have a reliable and fast processor to handle multiple tasks \n"
				+ "   such as web browsing, video streaming, and document editing. It should also have enough RAM (at least 8GB)\n"
				+ "   to ensure smooth multitasking.\r\n"
				+ "\r\n"
				+ "2. Battery life: Since students often need to use their laptops for extended periods of time without access to\n"
				+ "   power outlets, a good student laptop should have a long battery life (at least 8 hours) to last through a \n"
				+ "   full day of classes or study sessions.\r\n"
				+ "\r\n"
				+ "3. Portability: A lightweight and portable laptop is ideal for students who need to carry their devices around\n"
				+ "   campus or to different locations for studying. A 13-14 inch display size can strike a good balance between \n"
				+ "   portability and screen size.\r\n"
				+ "\r\n"
				+ "4. Storage: A good student laptop should have enough storage space (at least 256GB SSD) to store course materials,\n"
				+ "   assignments, and other files.\r\n"
				+ "\r\n"
				+ "5. Connectivity: A good student laptop should have a reliable and fast Wi-Fi connection, as well as a variety of\n"
				+ "   ports (such as USB and HDMI) to connect to external devices such as projectors, printers, and external storage.\r\n"
				+ "\r\n"
				+ "6. Price: Since most students are on a budget, a good student laptop should be affordable without compromising on \n"
				+ "   essential features and performance.\r\n"
				+ "\r\n"
				+ "These are just some of the conditions to consider when selecting a good student laptop. Ultimately, the best laptop\n"
				+ "for a student will depend on their individual needs and preferences.\r\n"
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