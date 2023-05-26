import java.util.Scanner;

public class SellingPrice {

	public static void main(String[] args) {
		System.out.print("Enter Cost ");
		int Cost = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter Margin (Don't include % sign) ");
		double Margin = Double.parseDouble(new Scanner(System.in).nextLine())/100;
		
	
		System.out.printf("Selling Price: %f", (float) (1/(1 - Margin))*Cost);
	}

}
