import java.util.Scanner;

public class CellPhone {

	Scanner sc = new Scanner(System.in);
	private Feature feature;

	public CellPhone(Feature feature) {
		super();
		this.feature = feature;
	}

	public void setFeature(int screesize, int battery, int ram, String color) {
		feature.setScreesize(screesize);
		feature.setBattery(battery);
		feature.setRam(ram);
		feature.setColor(color);
	}

	int printMessage(String msg) {
		System.out.println(msg);
		return 0;
	}

	public int makeCall(int simno, String contactname) {
		System.out.println("You are calling.." + contactname + " from Sim No " + simno);
		return 1;
	}

	public int sendMessage(int simno,String name) {
		System.out.println("Enter Message : \n");
		String message = sc.nextLine();
		System.out.println("You are sending message.." + message + " to "+name+" from Sim no " + simno);
		return 1;
	}

	public void playRadio() {
		System.out.println("You are playing radio..");
	}

	public void playMusic() {
		System.out.println("You are playing music..");
	}
}
