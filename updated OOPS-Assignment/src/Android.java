
class Android extends CellPhone {

	public Android(Feature feature) {
		super(feature);
		// TODO Auto-generated constructor stub
	}

	public void openCamera() {
		System.out.println("Opening camera");
	}

	public void openBluetooth() {
		System.out.println("Opening Bluetooth");
	}

	public void openWifi() {
		System.out.println("Opening Wifi");
	}

	public void openPlayStore() {
		System.out.println("Opening PlayStore");
	}
	void startVideoCall(String contactname){
		System.out.println("Video calling .. "+ contactname);	
	}
}
