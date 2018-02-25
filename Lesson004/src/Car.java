
public class Car
{
   Car()
   {
   }

   Car(int _yearModel, String _make, int _speed)
   {
      yearModel = _yearModel;
      make = _make;
      speed = _speed;
   }

   public int yearModel;
   String make;
   int speed;

   // increasing speed by 5
   public void Accelerator()
   {
      speed += 5;
   }

   // decreasing speed by 5
   public void Break()
   {
      speed -= 5;
   }

   public String getMake()
   {
      return make;
   }

   public void setMake(String make)
   {
      this.make = make;
   }

   public int getSpeed()
   {
      return speed;
   }

   public void setSpeed(int speed)
   {
      this.speed = speed;
   }

   public int getYearModel()
   {
      return yearModel;
   }

   @Override
   public String toString()
   {
      return "Car [yearModel=" + yearModel + ", make=" + make + ", speed="
            + speed + "]";
   }
}
