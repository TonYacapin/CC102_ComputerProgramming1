import java.util.Scanner;
public class Investment {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		double principal;
		double amountb;
		double rate;
		int time;
		double finalamount;
			
		// ask user inputs
		System.out.println("Enter Initial Investment");
		principal = s.nextInt();
		System.out.println("Enter rate (Don't include % sign)");
		 rate =  s.nextDouble();
		s.nextLine();
		System.out.println("Enter time");
		time = s.nextInt();
		
		//formula for getting Amount of Investment
		double rateb= (double) rate/100; 
		amountb = Math.pow (1 + rateb /time,time);
		finalamount =principal*amountb;
		
		//prints amount of investment
		System.out.println("Amount of Investment: " + finalamount);
	}

}
