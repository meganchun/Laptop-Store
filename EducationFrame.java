/*
 * Group 4 - Shreeya Champaneri, Megan Chun, Bella Cai, Joe Zhou
 * 
 * Bella Cai
 * May 15, 2023
 * ICS3U1-05 Ms. Biswas
 * 
 * Title: Computer BOSS Eduacation
 * 
 * Description: This is an education frame will display the information about CPU, GPU
 * RAM, SSD and three type of laptops: student, professional and gaming. ANd there is also 
 * one page for what user need to know when buying laptop. 
 * 
 * 
 * Major skills(EduacationFrame): 
 * GUI elements (JLabel, JButton, JFrame, etc.)
 * Action listener
 * When user click buttons will display the information frame
 * 
 * Major skills(Cpu, Gpu, Ram, Ssd, Student, Professional, Gaming):
 * GUI elements (JTextArea, JScrollPane, JPanel)
 * setTitle,setResizable,setVsile,setSize,setText method
 * 
 * Added features: images
 * 
 * Areas of concern: none
 * 
 * Contribution:
 * Bella Cai - 100%
 * EducationFrame() - Bella Cai
 * Cpu() - Bella Cai
 * Gpu() - Bella Cai
 * Ram() - Bella Cai
 * Ssd() - Bella Cai
 * Student() - Bella Cai
 * Professional() - Bella Cai
 * Gaming() - Bella Cai
 */

//import statements
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class EducationFrame extends Homepage implements ActionListener {

	//background
	JLabel background = new JLabel(new ImageIcon("images/background.jpg"));
	
	//title
	JLabel title = new JLabel(new ImageIcon("images/title.jpg"));
	
	//company icon
	Icon company = new ImageIcon("images/computerLogo.png");
	JButton logo = new JButton(company);
	
	//Menu Bar
	Icon home = new ImageIcon("images/home.jpg");
	JButton homeIcon = new JButton(home);
	
	Icon surveyp = new ImageIcon("images/survey.jpg");
	JButton survey = new JButton(surveyp);
	
	
	//inside laptop label
	JLabel insideL = new JLabel(new ImageIcon("image/insidelaptop.jpg"));
	
	//add button
	Icon cpup = new ImageIcon("images/CPU.jpg");
	JButton cpu = new JButton(cpup);
	
	Icon gpup = new ImageIcon("images/GPU.jpg");
	JButton gpu = new JButton(gpup);
	
	Icon ramp = new ImageIcon("images/RAM.jpg");
	JButton ram = new JButton(ramp);
	
	Icon ssdp = new ImageIcon("images/SSD.jpg");
	JButton ssd = new JButton(ssdp);
	
	//laptop type label
	JLabel laptopL = new JLabel(new ImageIcon("images/laptoptype.jpg"));
	
	//add button
	Icon studentp = new ImageIcon("images/student.jpg");
	JButton student = new JButton(studentp);
		
	Icon professionalp = new ImageIcon("images/professional.jpg");
	JButton professional = new JButton(professionalp);
		
	Icon gamingp = new ImageIcon("images/gaming.jpg");
	JButton gaming = new JButton(gamingp);
		
	Icon morep = new ImageIcon("images/more.jpg");
	JButton more = new JButton(morep);
	
	public EducationFrame() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Education");
		frame.add(background);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400,800);
		
		//set background
		background.setBounds(0,0,1400,800);
		
		//add searchIconButton
		background.add(logo);
		logo.setBounds(118,5,43,43);
		logo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		logo.addActionListener(this);
		
		//add homeIcon
		background.add(homeIcon);
		homeIcon.setBounds(955, 5, 55, 47 );
		homeIcon.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		homeIcon.addActionListener(this);
		
		//add menu
		background.add(survey);
		survey.setBounds(1075, 20, 65, 28 );
		survey.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		survey.addActionListener(this);
		
		//add title
		background.add(title);
		title.setBounds(55, 55, 1000, 112);			
		title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//add inside laptop label
		background.add(insideL);
		insideL.setBounds(75, 200, 150, 24);
		insideL.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//add inside laptop button
		background.add(cpu);
		cpu.setBounds(75, 250, 240, 170);
		cpu.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		cpu.addActionListener(this);

		background.add(gpu);
		gpu.setBounds(355, 250, 240, 165);
		gpu.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		gpu.addActionListener(this);
		
		background.add(ram);
		ram.setBounds(635, 250, 240, 171);
		ram.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		ram.addActionListener(this);
		
		background.add(ssd);
		ssd.setBounds(915, 250, 240, 161);
		ssd.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		ssd.addActionListener(this);
		
		//add laptop type label
		background.add(laptopL);
		laptopL.setBounds(75, 480, 150, 29);
		laptopL.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//add laptop type button
		background.add(student);
		student.setBounds(75, 530, 240, 165);
		student.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		student.addActionListener(this);
		
		background.add(professional);
		professional.setBounds(355, 530, 240, 165);
		professional.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		professional.addActionListener(this);
		
		background.add(gaming);
		gaming.setBounds(635, 530, 240, 169);
		gaming.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		gaming.addActionListener(this);
		
		background.add(more);
		more.setBounds(915, 530, 240, 154);
		more.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		more.addActionListener(this);
		
	
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new EducationFrame();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==cpu) {
			Cpu cpu = new Cpu();
		}
		
		else if(e.getSource()==gpu) {
			Gpu gpu = new Gpu();
		}
		
		else if(e.getSource()==ram) {
			Ram ram = new Ram();
		}
		
		else if(e.getSource()==ssd) {
			Ssd ssd = new Ssd();
		}
		
		else if(e.getSource()==student) {
			Student student = new Student();
		}
		
		else if(e.getSource()==professional) {
			Professional professional = new Professional();
		}
		
		else if(e.getSource()==gaming) {
			Gaming gaming = new Gaming();
		}
		
		else if(e.getSource()==more) {
			More more = new More();
		}
		
		else if(e.getSource()==homeIcon) {
			Homepage homepage = new Homepage();
		}
		else if(e.getSource()==logo) {
			Homepage homepage = new Homepage();
		}
		
		else if(e.getSource()==survey) {
			SurveyFrame surveypage = new SurveyFrame();
		}
		
		
	}
}
