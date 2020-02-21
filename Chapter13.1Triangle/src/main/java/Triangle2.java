/**
 * This is a class for triangle out of our book intro to java 
 * @author (Thomas J. Short)
 * @version (02/20/2020)
 * @chapter (chapter 11)
 */ 
public class Triangle2 extends GeometricObject2 
{
  // data fields
  private double side1, side2, side3;

  // constructors
  public Triangle2() 
  {
    this(1.0, 1.0, 1.0);
  }

  public Triangle2(double side1, double side2, double side3) 
  {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  // instance methods
  @Override
  public double getArea() 
  {
    double s = (side1 + side2 + side3) / 2.0;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  @Override
  public double getPerimeter() 
  {
    return side1 + side2 + side3;
  }

  // get side 1
  public double getSide1() 
  {
    return side1;
  }
  
  /** Set side1
    * @param side1 */
  public void setSide1(double side1) 
  {
    this.side1 = side1;
  }
  // get side 2
  public double getSide2() 
  {
    return side2;
  }
  
  /** Set side2
    * @param side1 */
  public void setSide2(double side1) 
  {
    this.side1 = side2;
  }

  // get side 3
  public double getSide3() 
  {
    return side3;
  }
  
  /** Set side1
     * @param side1 */
  public void setSide3(double side1) 
  {
    this.side1 = side3;
  }

  // overrides
  @Override
  public String toString() 
  {
    return this.getPerimeter() + " - Triangle," +  side1 + " x " 
    + " x " + side2 + " x " + side3;
  }

  
}