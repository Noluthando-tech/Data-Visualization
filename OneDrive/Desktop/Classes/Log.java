public class Log{


   private String username;
   private String password;

   public Log(){
   
      username="noluthandoluthuli92@gmail.com";
      password="Popsicles92";
   }
   public Log(String username,String password){
      this.username=username;
      this.password=password;}

   public String getUserName(){
      return username;}

   public void setUserName(String username){
   
      this.username=username;}

   public String getPassword(){
      return password;}

   public void setPassword(String password){
      this.password=password;}

   public String toString(){
      String str;
      str="username"+username+"\npassword"+password;
      return str;
   }
}
   

