import java.util.Scanner;

class CellPhone 
{
  public int screensize;
  public int battery_capacity;
  public String phonecolor;
  public int ram;

  public int makeCall(int simno,String contactname){
    System.out.println("You are calling "+ contactname + " from Sim "+ simno);return 1;
  }

  public int sendMessage (int simno,String contactname){
    System.out.println("Enter your Message below: \n");
    Scanner messagetextscanner = new Scanner(System.in);
    String messagetext = messagetextscanner.nextLine();
    System.out.println("You are sending this \n " +messagetext+ " to \t"+contactname);
  return 1;}

  public void playGame(){
    System.out.println("Opening gaming center..... ");
  }

  public void playRadio(){
    System.out.println("Opening Radio..... ");
  }

int printMessage(String msg){System.out.println(msg); return 0;}
}



class SimplePhone extends CellPhone{
	
	public void openTorch(){
		System.out.println("Open Torch");		
	}

}


class SmartPhone extends CellPhone{

	void onBluetooth(String phonetype){
	if(phonetype == "android"){
		System.out.println("Bluetooth on");	
		}	
	else if(phonetype == "iphone"){
		System.out.println("Bluetooth cannot open");			
		}
	
	}
	
	void installSoftware(String side){
	if(side == "outside"){
		System.out.println("Iphone cant install software");			
	}
	else if(side == "inside"){
			System.out.println("Installing...");		
	}	
	}

	void startVideoCall(String contactname){
		System.out.println("Video calling .. "+ contactname);	
	}
	public void openItunes(){
		System.out.println("Open Itunes");		
	}

}


class Main{

	public static void main(String args[]){
	SimplePhone asha101 = new SimplePhone();
//	SimplePhone jio = new SimplePhone();
	SmartPhone Android_Pixel = new SmartPhone();
//	SmartPhone Android_Pixel2 = new SmartPhone();
	SmartPhone Iphone = new SmartPhone();
	Scanner scanner = new Scanner(System.in);
	int choice,fea ,m,simno;
	String name;	
	do{
	
//	System.out.println("1)NOKIA ASHA 101");	
	System.out.println("1)NOKIA ASHA 101");	
	System.out.println("2)PIXEL");	
	System.out.println("3)IPHONE");
	System.out.println("4)FOR EXIT PRESS 0");
	choice = scanner.nextInt();
	switch(choice){
	case 1: 	do{	System.out.println("Features: \n 1) Make a call(Dual Sim) \n 2) Send Message \n 3) open Radio\n 4) Start a Torch\n  5)Choose feature to use (0 to exit):");
				fea = scanner.nextInt();
				switch(fea){
					case 1: name = scanner.nextLine();
						System.out.println("Sim No : ");
						 simno = scanner.nextInt();
							m= (simno <= 2) ? asha101.makeCall(simno,name) : asha101.printMessage("Not able to call..!");break;
					case 2:System.out.println("Whom to send message : ");
						name = scanner.nextLine();
						System.out.println("Sim No : ");
						simno = scanner.nextInt();
						m= (simno <= 2) ? asha101.sendMessage(simno,name) : asha101.printMessage("Not able to message..!");break;
					case 3:asha101.playRadio(); break;
					case 4:asha101.openTorch(); break;
					default:
		 				System.out.println("nested default case1!!"+ fea);
					}	
				}while(fea != 0 && fea <=4);
			break;
	
	case 2: 	do{	System.out.println("Features: \n 1) Make a call(Dual Sim) \n 2) Send Message \n 3) open Radio\n 4) Open Bluetooth\n 5) Start video call\n 6)Install Software\n 7) Choose feature to use :");
				fea = scanner.nextInt();
				switch(fea){
					case 1: name = scanner.nextLine();
						System.out.println("Sim No : ");
						 simno = scanner.nextInt();
							m= (simno <= 2) ? Android_Pixel.makeCall(simno,name) : Android_Pixel.printMessage("Not able to call..!");break;
					case 2:System.out.println("Whom to send message : ");
						name = scanner.nextLine();
						System.out.println("Sim No : ");
						simno = scanner.nextInt();
						m= (simno <= 2) ? Android_Pixel.sendMessage(simno,name) : Android_Pixel.printMessage("Not able to message..!");break;
					case 3:Android_Pixel.playRadio(); break;
					case 4:Android_Pixel.onBluetooth("android"); break;
					case 5:System.out.println("Whom to make Video call : ");
						name = scanner.nextLine();
						Android_Pixel.startVideoCall(name); break;
		 			default:
		 				System.out.println("nested default case2!!"+fea);
					}	
				}while(fea != 0 && fea <=5);
			break;
	case 3: 	do{	System.out.println("Features: \n 1) Make a call(Dual Sim) \n 2) Send Message \n 3) open Radio\n 4) Install Software\n 5) Start video call\n 6)Open Itunes\n 7) Choose feature to use :");
				fea = scanner.nextInt();
				switch(fea){
					case 1: name = scanner.nextLine();
						System.out.println("Sim No : ");
						 simno = scanner.nextInt();
							m= (simno <= 1) ? Iphone.makeCall(simno,name) : Iphone.printMessage("Not able to call..!");break;
					case 2:System.out.println("Whom to send message : ");
						name = scanner.nextLine();
						System.out.println("Sim No : ");
						simno = scanner.nextInt();
						m= (simno <= 2) ? Iphone.sendMessage(simno,name) : Iphone.printMessage("Not able to message..!");break;
					case 3:Iphone.playRadio(); break;
					case 4:Iphone.installSoftware("outside"); break;
					case 5:System.out.println("Whom to make Face Time : ");
						name = scanner.nextLine();
						Iphone.startVideoCall(name); break;
					case 6:Iphone.openItunes(); break;
		 			default:
		 				System.out.println("nested default case3!!"+fea);					
				}	
				}while(fea != 0 && fea <=6);
			break;
	default:
		System.out.println(" default case!!");
	
	}

	}while(choice != 0 && choice <=3);
}



}
