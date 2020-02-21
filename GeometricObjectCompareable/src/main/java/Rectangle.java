/**
 * This is a class for rectangle  
 * @author (Thomas J. Short)
 * @version (02/17/2020)
 * @chapter (chapter 13)
 */ 
public class Rectangle extends GeometricObject2 {
  private double width;
  private double height;

  /**
   * Rectangle no arg Constructor
   */
  public Rectangle() {
  }

  /**
   * Rectangle Constructor
   *
   * @param width A parameter
   * @param height A parameter
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width
     * @return  */
  public double getWidth() {
    return width;
  }

  /** Set a new width
     * @param width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height
     * @return  */
  public double getHeight() {
    return height;
  }

  /** Set a new height
     * @param height */
  public void setHeight(double height) {
    this.height = height;
  }

  /** Return area
     * @return  */
  @Override
  public double getArea() {
    return width * height;
  }

   /** Return perimeter
     * @return  */
  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }


  
}
