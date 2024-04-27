import java.util.*;

public class Food{
   public static void main(String[]args){
      Scanner kb=new Scanner(System.in);
      
      int[]num={2,3,5,4,6};
      for(int i=0;i<num.length;i++){
      
         System.out.println("Enter your favourite fruit");
         String fruit=kb.nextLine();
      
         System.out.println("Enter your favourite Vegetable");
         String veg=kb.nextLine();
      
         System.out.println("The numbers are"+num[i]);
         System.out.println("Your favourite fruit is"+fruit+" and vegetable is"+veg);
      
      }
      
     
   }
}