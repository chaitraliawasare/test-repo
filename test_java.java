import java.util.Scanner;

public class MainClass
{
   public static void main(String[] args)
   {
      String str;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = scan.nextLine();
      
      System.out.println(str);
   }
}
