abstract class Shape
{
 abstract void numberOfSides();
}
class Rectangle extends Shape
{
    void numberOfSides()
    {
      System.out.println("Number of sides of Rectangle: 4");
    }
}
class Triangle extends Shape
{
    void numberOfSides()
    {
      System.out.println("Number of sides of Triangle: 3");
    }
}
class Hexagon extends Shape
{
    void numberOfSides()
    {
      System.out.println("Number of sides of Hexagon: 6");
    }
}
class Sides
{
    public static void main(String args[])
    {
      Shape s;
      s=new Rectangle();
      s.numberOfSides();
      s=new Triangle();
      s.numberOfSides();
      s=new Hexagon();
      s.numberOfSides();
    }
}
