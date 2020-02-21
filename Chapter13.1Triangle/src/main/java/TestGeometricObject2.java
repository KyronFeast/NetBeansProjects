import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class TestGeometricObject2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestGeometricObject2
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
           
           
               // get three sides from the user
               System.out.println("Enter side1");
               double side1 = input.nextDouble();
               System.out.println("Enter side2");
               double side2 = input.nextDouble();
               System.out.println("Enter side3");
               double side3 = input.nextDouble();
               // create a new triangle from user input
               GeometricObject2 triangle = 
                       new Triangle2(side1, side2, side3);
              
               // set the color of the triangle
               System.out.println("What color would you like your triangle");
               String color = input.next();
               triangle.setColor(color);
              
               // ask user if triangle is filled or not
               System.out.println("Is the triangle filled? true or false: ");
               String isFilledString = input.next();
               boolean isFilled = (isFilledString.equals("true"));
               triangle.setFilled(isFilled);
               
               System.out.println();
               System.out.printf("Area = %.1f\n", triangle.getArea());
               System.out.printf("Perimeter = %.1f\n", triangle.getPerimeter());
               System.out.println("Color = " + triangle.getColor());
               System.out.println("Triangle is filled = " + triangle.isFilled());
          
    } 
}
