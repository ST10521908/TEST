package com.mycompany.ice_activity2_st10521908;
import java.util.Scanner;
public class ICE_Activity2_ST10521908 {

    private static String FullName;

    public static void main(String[] args) {
    Scanner inputObject = new Scanner(System.in);
  StudentUtility objName = new StudentUtility();
  
  //Calculate Average
   double a;
   double b;
   double c;
   double d;
   double Avg;
   
   a = inputObject.nextDouble();
   b = inputObject.nextDouble();
   c = inputObject.nextDouble();
   d = inputObject.nextDouble();
   
   Avg = StudentUtility.CalcAverage(a, b, c, d);
   System.out.println("The average is:" + Avg );
   
   //Convert Min into Sec
   int Min;
   int Sec;
   Min = inputObject.nextInt();
   Sec = StudentUtility.ConvMintoSec(Min);
   System.out.println("The seconds are:" +Sec);
  
   //get Fullname
   String Fullname = StudentUtility.getFullname("Zama","Ngcobo");
   System.out.println("Full name:" + FullName );
   
   //CheckMultipleof5
   boolean result1 = StudentUtility.isMultipleofFive(20);
   boolean result2 = StudentUtility.isMultipleofFive(17);
   
   System.out.println("20 is a multiple of 5:" +result1);
   System.out.println("17 is a multiple of 5:" +result2);
   
    }
     
}
