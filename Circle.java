public class Circle
{
   //Fields 
   private double radius;
   private double FINAL_PI = 3.14159;
   private double pi = FINAL_PI;
   
   //Constructor 
   public Circle(double R)
   {
      radius = R;
   }
   
   public Circle()
   {
      radius = 0.0;
   }
   
   public void setRadius(double R)
   {
      radius = R;
   }
   
   public double getRadius()
   {
      return radius;
   }
    
   public double getArea()
   {
      return pi * radius * radius;
   } 
   
   public double getDiameter()
   {
      return radius * 2;
   }
   
   public double getCircumference()
   {
      return 2 * pi * radius; 
   }
   
}