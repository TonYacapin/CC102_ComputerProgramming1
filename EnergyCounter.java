import java.util.Scanner;

public class EnergyCounter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int meterreading;
        double cost;
        //ask user for meter reading
        System.out.println("Enter meter reading ");
        meterreading = s.nextInt();
        //functions when meter reading is less than 0
        if (meterreading < 0) {
            System.out.println("Invalid");
        //functions when meter reading is less than or equal to 500 
        } else if (meterreading <= 500) {
            cost = 10;
            System.out.println("Total Charge/Cost is " + cost);
        //functions when meter reading is less that or equal to 1000
        } else if (meterreading <= 1000) {
            cost = 10 + ((meterreading - 500) * 0.05);
            System.out.println("Total Charge/Cost is " + cost);
        //functions when meter reading is greater than or equal 1000
        } else if (meterreading >= 1000) {
            cost = 35 + ((meterreading - 1000) * 0.03);
            System.out.println("Total Charge/Cost is " + cost);
        }
    }
}