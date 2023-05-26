import java.util.Scanner;
public class UniformSchedule {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter Day: ");
    String day = s.next();

    switch (day.toUpperCase()) {
    case "WEDNESDAY":
      System.out.println("Today is Dressdown day");
      break;
    default:
      System.out.println("Today is Uniform Day");
    }
  }
}