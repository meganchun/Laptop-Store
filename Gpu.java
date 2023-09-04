
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Gpu extends JFrame {

	//Create a panel with a scroll pane on it that contains non-editable
	//text area that displays multiple lines of text
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JPanel panel = new JPanel();
	
	Gpu() {
		//set the font and text color for the text area
				Font font = new Font("Arial", Font.PLAIN, 20);
				textArea.setFont(font);
				textArea.setForeground(new Color(0x333333));
				
				//set the background color for the text area
				textArea.setBackground(new Color(0xEEEEEE));
		setTitle("GPU Window"); //sets title of this
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
		textArea.setText("WHAT IS \"GPU\"?\n\n"
				+ "     GPU stands for Graphics Processing Unit, which is a specialized electronic circuit designed to rapidly \n"
				+ "process large amounts of data related to graphics and visual computing. GPUs are mainly used for rendering \n"
				+ "images, animations, and video content. They can perform complex mathematical calculations in parallel, which\n"
				+ "makes them ideal for handling tasks such as image processing, machine learning, and scientific computing. \r\n"
				+ "\r\n"
				+ "     In recent years, GPUs have become increasingly important for machine learning and artificial intelligence \n"
				+ "applications due to their ability to accelerate the training and inference of deep neural networks. They are also\n"
				+ "used in gaming, virtual reality, and other graphics-intensive applications. GPUs are usually found on graphics \n"
				+ "cards or as integrated components in modern CPUs.\r\n"
				+ "\r\n\n"
				+ "=========================================================================================\n"
				+ "\n"
				+ "\nThe quality or performance of a GPU (Graphics Processing Unit) can be evaluated based on a few factors. Some of\n"
				+ "these factors include:\r\n"
				+ "\r\n"
				+ "1. Clock speed: The clock speed of a GPU is the rate at which it can execute instructions. A higher clock speed \n"
				+ "   means the GPU can perform more operations per second, resulting in better performance.\r\n"
				+ "\r\n"
				+ "2. Memory: The amount and type of memory on a GPU can impact its performance. More memory can allow the GPU to \n"
				+ "   handle more data, and faster memory can improve its ability to handle complex graphics and computations.\r\n"
				+ "\r\n"
				+ "3. Number of cores: The number of cores on a GPU determines how many operations it can perform simultaneously. \n"
				+ "   A higher number of cores can result in better performance for tasks that require parallel processing, such as \n"
				+ "   rendering or machine learning.\r\n"
				+ "\r\n"
				+ "4. Power consumption: The power consumption of a GPU can impact its efficiency and overall performance. A more \n"
				+ "   efficient GPU will use less power and generate less heat, allowing it to perform better and potentially last \n"
				+ "   longer.\r\n"
				+ "\r\n"
				+ "5. Benchmark scores: Benchmark tests are used to evaluate the performance of a GPU under specific conditions. By\n"
				+ "   comparing benchmark scores, it's possible to determine how a GPU performs relative to other models.\r\n"
				+ "\r\n"
				+ "Ultimately, what makes a \"good\" GPU depends on the intended use case. For example, a GPU that is well-suited \n"
				+ "for gaming may not be the best choice for professional video editing or scientific simulations.\r\n"
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