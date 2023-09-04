/*
 * Shreeya Champaneri
 * Team 4
 * May 8, 2023
 * ICS3U1-05
 * Title: Computer BOSS
 * Description: This is the laptop class template file 
 * to create the laptop objects
 * Major skills: classes and objects
 * Added features: none
 * Areas of concern: none
 */

public class Laptop {
	private String brand;
	private String model;
	private String type;
	private double price;
	private String system;
	private String cpu;
	private String gpu;
	private int ssd;
	private int ram;
	private double weight;
	private int noOfUSBPorts;
	private double displaySize;
	private double score;
	private String link;
	private int laptopNum;

	public Laptop(String brand, String model, String type, double price, String system, String cpu,
			String gpu, int ssd, int ram, double weight, int noOfUSBPorts, double displaySize, String link, double score, int laptopNum) {
		super();

		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.system = system;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ssd = ssd;
		this.ram = ram;
		this.weight = weight;
		this.noOfUSBPorts = noOfUSBPorts;
		this.displaySize = displaySize;
		this.score = score;
		this.link = link;
		this.laptopNum = laptopNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getNoOfUSBPorts() {
		return noOfUSBPorts;
	}

	public void setNoOfUSBPorts(int noOfUSBPorts) {
		this.noOfUSBPorts = noOfUSBPorts;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	public double getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public int getLaptopNum() {
		return laptopNum;
	}

	public void setLaptopNum(int laptopNum) {
		this.laptopNum = laptopNum;
	}


	@Override
	public String toString() {
		return "The " + model + " by " + brand + " is made for " + type + " and features a \n\n" + cpu + " processor "
				+ "and a " + gpu + " graphics \n\ncard. It has " + ssd + "GB of storage, " + ram + " of RAM and weighs "
				+ weight + " lbs. The \n\n" + model + " provides " + noOfUSBPorts
				+ " USB ports and a " + displaySize + " inch screen. ";
	}

}
