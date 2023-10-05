//Cding Bat warmup one solutions

public class CodingBatWarmupOne{
  // public static void main (String [] args){
   
   public boolean sleepIn(boolean weekday,boolean vacation){
   //if it is a vacation, sleep in (order is important on 
   if (vacation){
      return true;
      }
   //if it is a week day, wake up
   boolean weekend = !weekday;
   if(weekday){
      return true;
      }
   //if it is a weekend, sleep in
   
  /* if (weekday){
      return false;
      you can get rid of this bc it repeats if its not a vacation and not a weekend then you automatically wake up
      }*/
   return false;// if none of the other options apply just return false
}   

//using else/if statement   
   public boolean sleepIn(boolean weekday,boolean vacation){
   //if it is a vacation, sleep in (order is important on 
   boolean weekend = !weekday;
   if (weekend){
      return true;
      } else if (vacation){
         return true;
      } else{
         return false;
      }
   
}
// getting rid of repeatative code   
   public boolean sleepIn(boolean weekday,boolean vacation){
   //if it is a vacation, sleep in (order is important on 
   boolean weekend = !weekday;
   if (vacation || weekend){
      return true;
      }
   //if it is a week day, wake up
   boolean weekend = !weekday;
   if(weekday){
      return true;
      }
   //if it is a weekend, sleep in
   
   return false;// if none of teh other options apply just return false
}

// most simpfied version of the code
public boolean sleepIn(boolean weekday,boolean vacation){
   //if it is a vacation, sleep in (order is important on 
   boolean weekend = !weekday;
   return vacation || weekend;
   

      

 } 
 
 public void example (int age,int rank, int serialNumber){
   if (age > 17){ //if an adult
      if (rank > 5){// and if you coporal then return serial number
         return serialNumber;
      }
    } else{
      return -1;//is a placeholder number like an error
    }
 } 
 public void example (int age,int rank, int serialNumber){
   if (age > 17&& rank > 5){ 
       return serialNumber;
      }
      return Integer.MIN_INT;
   }
}
   
