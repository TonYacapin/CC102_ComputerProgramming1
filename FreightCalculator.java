import java.util.Scanner;

public class FreightCalculator {

   public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      System.out.print("Enter Package weight ");
      int weight = s.nextInt();
      System.out.print("Enter Zone ");
      char zone = s.next().charAt(0);

      if (weight <= 2) {
         if (zone == 'A') {
            System.out.println("Baggage Charge 1.01");
         } else if (zone == 'B') {
            System.out.println("Baggage Charge 1.52");
         } else if (zone == 'C') {
            System.out.println("Baggage Charge 1.65");
         } else if (zone == 'D') {
            System.out.println("Baggage Charge 1.85");
         }
      } else if (weight <= 4) {
         if (zone == 'A') {
            System.out.println("Baggage Charge 1.58");
         } else if (zone == 'B') {
            System.out.println("Baggage Charge 2.01");
         } else if (zone == 'C') {
            System.out.println("Baggage Charge 2.43");
         } else if (zone == 'D') {
            System.out.println("Baggage Charge 3.05");
         }
      } else if (weight <= 9) {
         if (zone == 'A') {
            System.out.println("Baggage Charge 1.71");
         } else if (zone == 'B') {
            System.out.println("Baggage Charge 2.52");
         } else if (zone == 'C') {
            System.out.println("Baggage Charge3.11");
         } else if (zone == 'D') {
            System.out.println("Baggage Charge 4.05");
         }
      } else if (weight == 10) {
         if (zone == 'A') {
            System.out.println("Baggage Charge 2.04");
         } else if (zone == 'B') {
            System.out.println("Baggage Charge 3.12");
         } else if (zone == 'C') {
            System.out.println("Baggage Charge 4.05");
         } else if (zone == 'D') {
            System.out.println("Baggage Charge 5.01");
         }
      } else if (weight > 10) {
         if (zone == 'A') {
            System.out.println("Baggage Charge 2.52");
         } else if (zone == 'B') {
            System.out.println("Baggage Charge 3.75");
         } else if (zone == 'C') {
            System.out.println("Baggage Charge 5.18");
         } else if (zone == 'D') {
            System.out.println("Baggage Charge 7.25");
         }
      } else {
         System.out.println("ERROR!");
      }

   }
}