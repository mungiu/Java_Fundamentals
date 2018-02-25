import java.util.Scanner;

public class TestClassTemperature
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in);
      
      System.out.println("Please input temperature in Fahrenheit and press \"Enter\" key.");
      double ftemp = key.nextDouble();
      key.close();
      
      Temperature temperature = new Temperature(ftemp);
      
      System.out.println(temperature);
      System.out.println(temperature.getCelsius());
      System.out.println(temperature.getKelvin());
   }
}
