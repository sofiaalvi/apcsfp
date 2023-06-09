import java.util.Scanner;
 

public class Utils {

  private static Scanner scan = new Scanner(System.in);
 
  public static String inputStr (String question) {
    System.out.print (question);
    return scan.nextLine();
  }
 
  public static int inputNum (String question) {
    System.out.print (question);
    int num = -1;
    while (num <= 0) {
      try {
        String numStr = scan.nextLine();
        num = Integer.parseInt(numStr);
      } catch (Exception e) {
        num = -1;
      }
      if (num <= 0)
        System.out.println ("Please enter a valid phone number: ");
    }
    return num;
  }
}
