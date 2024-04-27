import java.util.*;
public class HighestToLowest{
   public static void main(String[]args){
      Scanner kb=new Scanner(System.in);
      int low=0; int high=0;
      System.out.println("enter the size of an array");
      int size=kb.nextInt();
      
      int[]num=new int[size];
      
      for(int i=0;i<size;i++){
         System.out.println("Enter a number "+(i+1));
         num[i]=kb.nextInt();
         int low=num[0];
         int high=num[0];}
      
      for(int i=0; i<size;i++){
         System.out.println("the highest number is "+high[i]);
         System.out.println("the lowest is "+low[i]);
      }
   }
}