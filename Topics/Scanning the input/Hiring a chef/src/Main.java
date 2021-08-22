
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String age = scanner.nextLine();
    String stageOfEducation = scanner.nextLine();
    String yearOfExercise = scanner.nextLine();
    String prefer = scanner.nextLine();
    System.out.println("The form for "+ name + " is completed. We will contact you if we need a chef that cooks "+prefer+" dishes.");
  }
}
