/**
 * This is a class for abstract GeometricObject2 comparable
 * @author (Thomas J. Short)
 * @version (02/17/2020)
 * @chapter (chapter 13 )
 */ 
public abstract class GeometricObject2 implements
        java.lang.Comparable<GeometricObject2> 
{
  // insance methods
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
 
  /** Construct a default geometric object
     */
  protected GeometricObject2() 
  {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value
     * @param color
     * @param filled */
  protected GeometricObject2(String color, boolean filled) 
  {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color
     * @return  */
  public String getColor() 
  {
    return color;
  }

  /** Set a new color
     * @param color */
  public void setColor(String color) 
  {
    this.color = color;
  }

  /** *  Return filled.Since filled is boolean,
  the get method is named isFilled
     * @return  */
  public boolean isFilled() 
  {
    return filled;
  }

  /** Set a new filled
     * @param filled */
  public void setFilled(boolean filled) 
  {
    this.filled = filled;
  }

  /** Get datedateCreated
     * @return  */
  public java.util.Date getDateCreated() 
  {
    return dateCreated;
  }

  /**Method toString
     *@return The return value  */
  @Override
  public String toString() 
  {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea
     * @return  */
  public abstract double getArea();

  /** Abstract method getPerimeter
    * @return  */
  public abstract double getPerimeter();
  
  /**
   * Method max
   *
   * @param o1 A parameter
   * @param o2 A parameter
   * @return The return value
   */
  public static GeometricObject2 max (GeometricObject2 o1, 
                                           GeometricObject2 o2)
  {
    if (((Comparable)o1).compareTo(o2) > 0 )
         return o1;
    else
         return o2;
  }
  
  /**
   * Method compareTo
   *
   * @param o A parameter
   * @return The return value
   */
  @Override
  public int compareTo(GeometricObject2 o) {
       
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else 
            return 0;
    }
  
}