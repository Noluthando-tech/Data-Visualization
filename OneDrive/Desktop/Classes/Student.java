public class Student{
   private String StudentNo;
   private String name;
   private String surname;
   
   public Student(String StudentNo,String name,String surname ){
      this.StudentNo=StudentNo;
      this.name=name;
      this.surname=surname;}
            
         
   
   public String getStudentNo(){
      return StudentNo;}
   
   public void setStudentNo(String StudentNo){
      this.StudentNo=StudentNo;}
   
   public String getName(){
      return name;}
   public void setName(String name){
      this.name=name;}

   
   public String getSurname(){
      return surname;}
   public void setSurnaame(String surnname){
      this.surname=surname;
   }
   
   public String toString(){
      String str;
      str="Student number"+StudentNo+"\nName"+name+"\nSurname"+surname;
      return str;
   }
}
