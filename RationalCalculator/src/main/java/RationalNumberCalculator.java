public class RationalNumberCalculator 
{
  public static void main(String[] args) 
  {
    Rational result = new Rational(0, 1);

    if (args.length != 1) 
    {
      System.out.println(
        "Usage:  \"operand1 operator operand2\"");
      System.exit(1);
    }

    String[] tokens = args[0].split(" ");

    switch (tokens[1].charAt(0)) 
    {
      case '+': result = getRational(tokens[0]).add(getRational(tokens[2]));
      break;
      case '-': result = getRational(tokens[0]).subtract(getRational(tokens[2]));
      break;
      case '*': result = getRational(tokens[0]).multiply(getRational(tokens[2]));
      break;
      case '/': result = getRational(tokens[0]).divide(getRational(tokens[2]));
    }

    System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + result);
  }

  /**
   * Method getRational
   *
   * @param s A parameter
   * @return The return value
   */
  static Rational getRational(String s) 
  {
    String[] st = s.split("/");
    int numerator = Integer.parseInt(st[0]);
    int denomanator = Integer.parseInt(st[1]); 
    return new Rational(numerator, denomanator);
  }
}
