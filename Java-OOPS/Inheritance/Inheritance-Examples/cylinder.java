//Super-class
class Circle{
    //properties
    public double radius;
    //behaviour
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
//Derived-class
class Cylinder extends Circle{
    //properties
        public double height;
        //behaviour
        public double volume()
        {
            return area()*height;
        }
}
public class inherit1 {
    public static void main(String[]args)
    {
        //Object
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("Area is: "+c.area());
        System.out.println("Perimeter is: "+c.perimeter());
        System.out.println("Volume is: "+c.volume());
    }
}
