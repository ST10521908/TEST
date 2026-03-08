public class StudentUtility {
    
   public double CalculateAverage(double a, double b, double c, double d){
  return (a + b + c + d)/4;
 
 }
    public int ConvMintoSec (int min){
    return min*60;
    
    }
 public static String getFullname (String firstname, String surname){
   String FullName = firstname + " " + surname;  
   return FullName;
}
 public static boolean isMultipleofFive(int num5){
 if (num5% 5 ==0) {
 return true;
 }else {
  return false;
 }
      
 }

}
