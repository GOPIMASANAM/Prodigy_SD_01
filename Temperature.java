package prodigy_infotech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {	 
	 int op;
	 public float fahrenheit, celcius, kelvin,temperature; 
	 Scanner sc=null;					
      Temperature() { 
    	 try { 
    	    if(sc==null)
    	    	sc=new Scanner(System.in);
    	    System.out.println("How do you want to convert:");
			System.out.println("1.Celcius     -->Fahrenheit, Kelvin.");
			System.out.println("2.fahrenheits -->Celcius, Kelvin.");
			System.out.println("3.kelvin      -->Fahrenheit, Celcius.");
			System.out.println("4. Exit.");
		do { 
			System.out.println("Please Enter Temperature: ");
			temperature=sc.nextFloat();	
			System.out.println("Please Choose your option 1 to 4 only");
			op=sc.nextInt();
			if(op>=1 && op<=4) {			
			switch(op) {
			case 1: celcius(temperature);
					break;
			case 2: fahrenheit(temperature);
					break;
			case 3: kelvin(temperature);
					break;
			case 4: break;
			} 
			System.out.println("---------------------------------------");
			}
			else System.out.println("Please Choose 1 to 4 only");
		 }while(op!=4);
	 } 
     catch(InputMismatchException ie) {
    		 System.out.println("You entered wrong input");
     }
	 catch(Exception e) {
		     System.out.println(e);
	 }	
	 if(sc!=null)
		 sc.close();
     }
     public void fahrenheit(float temperature) {
    	 celcius=(temperature-32)*5/9;
    	 kelvin= (float) ((temperature - 32)*5/9 + 273.15);
    	 System.out.println("Converted to celcius: "+celcius);
    	 System.out.println("Converted to kelvin= "+kelvin);
     }
     public void celcius(float temperature) {
    	  fahrenheit  = (temperature * 9/5) + 32;
          kelvin = (float) (temperature + 273.15);
          System.out.println("Converted to fahrenheit: "+fahrenheit);
     	  System.out.println("Converted to Kelvin= "+kelvin);
     }
	
     public void kelvin(float temperature) { 
    	  fahrenheit = (float) ((temperature - 273.15) * 9/5 + 32);
          celcius = (float) (temperature - 273.15);
          System.out.println("Converted to fahrenheit: " + fahrenheit);
          System.out.println("Converted to celcius: " + celcius);
    	
     } 	
     public static void main (String[] args) {
    	 Temperature t=new Temperature();
     }
}