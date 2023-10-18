public class Ch_4HW
{
   public static void main(String args[])
   {
      System.out.print("enter your weight in pounds: ");
  int weight = keyboard.nextInt();
  System.out.print("enter your height in inches: ");
  int height = keyboard.nextInt();
  
  double BMI = weight *(703 / Math.pow(height,2));
  
  if (BMI >=18.5 && BMI <=25)
   System.out.println("You are at an optimal weight");
  else if(BMI <18.5)
   System.out.println("You are at an underweight");
  else
   System.out.println("You are at an overweight");
   }
}
