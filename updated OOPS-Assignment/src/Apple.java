
public class Apple extends CellPhone {

	public Apple(Feature feature) {
		super(feature);
		// TODO Auto-generated constructor stub
	}

	public void openCamera() {
		System.out.println("Opening camera");
	}

	public void openAppStore() {
		System.out.println("Opening AppStore");
	}

	public void openWifi() {
		System.out.println("Opening Wifi");
	}

	public void openFaceTime(String contactname) {
		System.out.println("Starting Facetime with "+contactname);
	}
}
