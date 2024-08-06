import java.util.Scanner ;
    public class CelsiusSC {
        public static void main (String args []){
            Scanner sc = new Scanner(System.in);
            int mySalary = 2000;
            System.out.print("Enter Fahrenheit degree: ");
            float fahrenheit = sc.nextFloat();
            float celsius = (fahrenheit - 32)* 5 / 9f;
            double roundedCelsius = Math.round(celsius * 100.0) / 100.0;
            System.out.println(fahrenheit +" Fahrenheit is equal to " + roundedCelsius +" Celsius.");
            sc.close();
        }
    
        
    }

