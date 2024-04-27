public class NsLab{
   int modelYear;
   String modelName;
   
   public NsLab(int Year,String name){
      modelYear=Year;
      modelName=name;}
   
   public static void main(String[]args){
   
      Main car=new Main(1974,BMW);
   
      System.out.println(car.ModelYear+""+car.ModelName);
   
   }
}
   
