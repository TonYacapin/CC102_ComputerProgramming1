import java.util.Scanner;
public class WaterSewageBill {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double gallon;
		double watercharge, sewagecharge, citytax, totalbill, chargetotal;
		double waterchargeinpeso, waterincent;
		double sewagechargeinpeso, sewagechargeincent;
		double citytaxinpeso, citytaxincent;
		double totalbillinpeso, totalbillincent;
		
		System.out.print("Enter Gallon Used: " );
		gallon =input.nextInt()/100;
		System.out.println();
		
		
		watercharge = gallon*1.2;
		waterchargeinpeso = (int)watercharge/100;
		waterincent = ((watercharge/100)-waterchargeinpeso);
		
		System.out.print("Water Charge ");
		System.out.println((int)waterchargeinpeso+" peso(s) "+((float)(waterincent*100))+" cent(s)");
		
		sewagecharge = gallon*1.0;
        sewagechargeinpeso =(int)sewagecharge/100;
        sewagechargeincent=((sewagecharge/100)-sewagechargeinpeso);
        
        
        System.out.print("Sewage Charge ");
        
		System.out.println((int)sewagechargeinpeso+" peso(s) "+((float)(sewagechargeincent*100))+" cent(s)");
		
		chargetotal = watercharge+sewagecharge;
		
		citytax= chargetotal/100*2;
		citytaxinpeso= (int)citytax/100;
		citytaxincent=((citytax/100)-citytaxinpeso);
		
		
		System.out.print("City Tax ");
		System.out.println((int)citytaxinpeso+" peso(s) "+((float)(citytaxincent*100))+" cent(s)");
		
		totalbill = chargetotal+citytax;
		totalbillinpeso = (int)totalbill/100;
		totalbillincent = ((totalbill/100)-totalbillinpeso);
		
		System.out.print("Total Bill ");
		System.out.println((int)totalbillinpeso+" peso(s) "+((float)(totalbillincent*100))+" cent(s)");
		
	}

}
