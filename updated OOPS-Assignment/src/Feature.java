
public class Feature {

	private int screesize;
	private int battery;
	private int ram;
	private String color;

	public int getScreesize() {
		return screesize;
	}

	public void setScreesize(int screesize) {
		this.screesize = screesize;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if(ram == 512)	this.ram = ram;
		else if(ram == 1000) 	this.ram = 1;
		else if(ram == 2000) 	this.ram = 2;
		else if(ram == 3000) 	this.ram = 3;
		else if(ram == 4000) 	this.ram = 4;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean bluetooth() {
		return true;
	}

}
