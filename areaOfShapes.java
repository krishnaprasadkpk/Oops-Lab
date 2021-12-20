class Shapes
{
  void area(double a)
  {
    double ar=3.14*a*a;
    System.out.println("Area of Circle: "+ar+" sq units");
  }
  void area(float a,float b)
  {
    float ar=a*b;
    System.out.println("Area of Rectangle: "+ar+" sq units");
  }
  void area(double a,double b)
  {
    double ar=0.5*a*b;
    System.out.println("Area of Triangle: "+ar+" sq units");
  }
  }
 class areaOfShapes
  {
     public static void main(String args[])
     {
       Shapes object=new Shapes();
       object.area(2);
       object.area(2,2);
       object.area(2.0,3.0);
     }
       
  }

