import java.util.Scanner;

public class Ch_4HW
{
   public static void main(String args[])
   {
   //Time calculator
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter a number of seconds");
   int seconds =keyboard.nextInt();
   int second = seconds%60;
   int minutes = seconds/60;
   int hours = minutes /60;
   int days = hours/24;
   
  
   if (seconds < 60)
      
      System.out.printf("You entered %d seconds",seconds);
   
   else if (seconds >=60 && seconds<3600)
      System.out.printf("You entered %d minutes and %d seconds",minutes,second);
   else if (seconds>=3600 && seconds <86400)
      System.out.printf("You entered %d hours, %d minutes, and %d seconds ",hours,minutes,second);
   else if (seconds >=86400)
      System.out.printf("You entered %day, %d hours, %d minutes, and %d seconds ",days,hours,minutes,second);
   }

}
   
