import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestCellPhone {

	public static void main(String args[]) throws Exception {
		Feature feature = new Feature();
		CellPhone cell = new CellPhone(feature);
		FeaturePhone featurephone = new FeaturePhone(null);
		Android android = new Android(null);
		Apple apple = new Apple(null);
		int choice, choice2;
		int simno, m;
		String name;
		do {
			System.out.println("");
			System.out.println("1)NOKIA ASHA 101");
			System.out.println("2)PIXEL");
			System.out.println("3)IPHONE");
			System.out.println("4)FOR EXIT, PRESS 0");
			// Scanner sc = new Scanner(System.in);
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(sc.readLine());
			switch (choice) {

			case 1:
				cell.setFeature(2, 1500, 1000, "Red");
				System.out.println("Specification: \nScreenSize : " + feature.getScreesize() + " inch\nBattery : "
						+ feature.getBattery() + " MAh\nRam : " + feature.getRam() + " GB\nColor : "
						+ feature.getColor());

				do {
					System.out.println(
							"Features: \n 1) Make a call(Dual Sim) \n 2) Send Message \n 3) open Radio\n 4) Start a Torch\n 5) Choose feature to use (FOR EXIT, PRESS 0):");
					choice2 = Integer.parseInt(sc.readLine());
					switch (choice2) {
					case 1:
						System.out.println("Whom to Call : ");
						name = sc.readLine();
						System.out.println("Sim No : ");
						simno = Integer.parseInt(sc.readLine());
						m = (simno <= 2) ? cell.makeCall(simno, name) : cell.printMessage("Not able to call..!");
						break;

					case 2:
						System.out.println("Whom to send message : ");
						name = sc.readLine();
						System.out.println("Sim No : ");
						simno = Integer.parseInt(sc.readLine());
						cell.sendMessage(simno,name);
						break;
					case 3:
						cell.playRadio();
						break;
					case 4:
						featurephone.openTorch();
						break;
					}
				} while (choice2 != 0);
				break;
			case 2:
				cell.setFeature(5, 3500, 3000, "Blue");
				System.out.println("Specification: \nScreenSize : " + feature.getScreesize() + " inch\nBattery : "
						+ feature.getBattery() + " MAh\nRam : " + feature.getRam() + " GB\nColor : "
						+ feature.getColor());

				do {

					System.out.println(
							"Features: \n 1) Make a call(Dual Sim) \n 2) Send Message \n 3) Make a Video call \n 4) Open Bluetooth\n  5)Install Software \n 6) Choose feature to use (FOR EXIT, PRESS 0):");
					choice2 = Integer.parseInt(sc.readLine());
					switch (choice2) {
					case 1:
						System.out.println("Whom to Call : ");
						name = sc.readLine();
						System.out.println("Sim No : ");
						simno = Integer.parseInt(sc.readLine());
						m = (simno <= 2) ? cell.makeCall(simno, name) : cell.printMessage("Not able to call..!");
						break;
					case 2:
						System.out.println("Whom to send message : ");
						name = sc.readLine();
						System.out.println("Sim No : ");
						simno = Integer.parseInt(sc.readLine());
						cell.sendMessage(simno,name);
						break;
					case 3:
						System.out.println("Whom to make VideoCall : ");
						name = sc.readLine();
						android.startVideoCall(name);
						break;
					case 4:
						android.openBluetooth();
						break;
					case 5:
						android.openPlayStore();
						break;
					}
				} while (choice2 != 0);
				break;
			case 3:
				cell.setFeature(4, 2500, 2000, "black");
				System.out.println("Specification: \nScreenSize : " + feature.getScreesize() + " inch\nBattery : "
						+ feature.getBattery() + " MAh\nRam : " + feature.getRam() + " GB\nColor : "
						+ feature.getColor());

				do {

					System.out.println(
							"Features: \n 1) Make a call \n 2) Send Message \n 3) open Radio\n 4) Open Wifi\n 5) Open Face Time\n 6)Install Software\n 7) Choose feature to use (FOR EXIT, PRESS 0):");
					choice2 = Integer.parseInt(sc.readLine());
					switch (choice2) {
					case 1:
						System.out.println("Whom to Call : ");
						name = sc.readLine();
						System.out.println("Sim No : ");
						simno = Integer.parseInt(sc.readLine());
						m = (simno <= 1) ? cell.makeCall(simno, name) : cell.printMessage("Not able to call..!");
						break;
					case 2:
						System.out.println("Whom to send message : ");
						name = sc.readLine();
						System.out.println("Sim No : ");
						simno = Integer.parseInt(sc.readLine());
						cell.sendMessage(simno,name);
						break;
					case 3:
						cell.playRadio();
						break;
					case 4:
						apple.openWifi();
						break;
					case 5:
						System.out.println("Whom to make Face Time : ");
						name = sc.readLine();
						apple.openFaceTime(name);
						break;
					case 6:
						apple.openAppStore();
						break;
					}
				} while (choice2 != 0);
				break;
			}

		} while (choice != 0);
	}
}
