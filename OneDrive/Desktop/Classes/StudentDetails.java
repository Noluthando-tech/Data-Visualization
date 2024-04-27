import java.util.*;
public class StudentDetails{
   public static void main(String[]args){
      boolean found=false;
      Scanner kb=new Scanner(System.in);
      Student[]Stud=new Student[1];
   
      for(int i=0;i<1;i++){
      
         System.out.println("enter your student number");
         String StudentNo=kb.nextLine();
      
      
         System.out.println("enter your name");
         String name=kb.nextLine();
      
      
         System.out.println("enter your student number");
         String surname=kb.nextLine();
      
         Stud[i]=new Student( StudentNo, name, surname);}
   
      System.out.println("enter your student number");
      String search=kb.nextLine();
   
   
      for(int i=0;i<1;i++){
      
         if(Stud[i].getStudentNo().equals(search)){
            found=true;
            if(found==true){
               System.out.println("the student is available in the datatbase\t"+Stud[i].toString());
            }
         }
      
      
         if(found=false){
            System.out.println("The student is not found on the database");
         }
      }
   }
   
   

   
   
}