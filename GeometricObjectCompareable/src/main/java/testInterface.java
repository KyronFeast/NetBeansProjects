/**
 * This is a class to test comparable interface   
 * @author (Thomas J. Short)
 * @version (02/17/2020)
 * @chapter (chapter 13)
 */ 
public class testInterface
{

    /**  main method
     * @param args
     */
    public static void main(String[] args) 
    {
        // create circle 1
        GeometricObject2 circle1 = new Circle(1);
        // create circle 2
        GeometricObject2 circle2 = new Circle(2);
        //create a circle to hold maximum circle
        GeometricObject2 maxCircle = new Circle();
        // create rectangle 1
        GeometricObject2 rectangle1 = new Rectangle(2, 2);
        // create rectangle 2
        GeometricObject2 rectangle2 = new Rectangle(4, 3);
        // create a rectangle to hold maximum rectangle
        GeometricObject2 maxRectangle = new Rectangle();
        // assign the larger circle to maxCircle
        maxCircle = GeometricObject2.max(circle1, circle2);
        // assign the larger rectangle to maxRectangle
        maxRectangle = GeometricObject2.max(rectangle1, rectangle2);
        
        System.out.printf("circle1 perimeter = %.1f\n", circle1.getPerimeter());
        System.out.printf("circle2 perimeter = %.1f\n", circle2.getPerimeter());
        System.out.printf("rectangle1 perimeter = %.1f\n", rectangle1.getPerimeter());
        System.out.printf("rectangle2 perimeter = %.1f\n", rectangle2.getPerimeter());
        // print the circle's to string method
        System.out.println("max circle is " + maxCircle.toString());
        System.out.printf("max circle perimeter = %.1f\n", maxCircle.getPerimeter());
        // print the rectangles toString method
        System.out.println("max rectangle is " + maxRectangle.toString());
        System.out.printf("max rectangle perimeter = %.1f\n",maxRectangle.getPerimeter());

    }
}
