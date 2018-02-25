
public class Temperature
{
   Temperature()
   {
   }

   Temperature(double ftemp)
   {
      this.ftemp = ftemp;
   }

   double ftemp;

   public String getCelsius()
   {
      return "Temperature in Celsius is: " + ((5 / 9) * (ftemp - 32));
   }

   /**
    * This method returns current Fehrenheit value in Kelvin
    * @ftemp current fahrenheit
    */
   public String getKelvin()
   {
      return "Temperature in Kelvin is: " + (((5 / 9) * (ftemp - 32)) + 273);
   }

   public double getFtemp()
   {
      return ftemp;
   }

   public void setFtemp(double ftemp)
   {
      this.ftemp = ftemp;
   }

   @Override
   public String toString()
   {
      return "Temperature [ftemp=" + ftemp + "]";
   }

}
