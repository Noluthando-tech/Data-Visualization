import java.util.*;
public class Login{
   public static void main(String[]args){
      
      Scanner kb=new Scanner(System.in);
      LoginDetails pass=new LoginDetails();
      LoginDetails user=new LoginDetails();
      
      System.out.println("Enter the password");
      pass.password=kb.nextLine();
      
      System.out.println("enter your username");
      user.username=kb.nextLine();
      
      System.out.println("The password is\t"+pass.password);
      System.out.println("The username is\t"+user.username);
       
   }
}
