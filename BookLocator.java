import java.util.Scanner;

public class BookLocator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int CallNumber;

        System.out.println("Enter book call number ");
        CallNumber = s.nextInt();

        if (CallNumber <= 99) {
            System.out.println("Not Available");
        } else if (CallNumber <= 199) {
            System.out.println("Basement");
        } else if (CallNumber <= 500) {
            System.out.println("Main Floor");
        } else if (CallNumber >= 901) {
            System.out.println("Main Floor");
        } else if (CallNumber <= 699) {
            System.out.println("Upper Floor");
        } else if (CallNumber <= 750) {
            System.out.println("Archives");
        } else if (CallNumber <= 900) {
            System.out.println("Upper FLoor");
        }

    }

}