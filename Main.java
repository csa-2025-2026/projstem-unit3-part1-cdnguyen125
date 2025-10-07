import java.util.Scanner;

public class Main
{
  public static boolean isRotated(Rectangle one, Rectangle two)
  {
    boolean rotated;
    if((one.getLength() == two.getWidth()) && one.getWidth() == two.getLength()) 
    {
      rotated = true;
    }
    else
    {
      rotated = false;
    }
    return rotated;
  }

  public static boolean isCongruent(Rectangle one, Rectangle two)
  {
    boolean congruent;
    if((one.equals(two)) || isRotated(one, two))
    {
      congruent = true;
    }
    else
    {
      congruent = false;
    }
    return congruent;
  }

  public static boolean isSimilar(Rectangle one, Rectangle two)
  {
    boolean similar;
    if(isCongruent(one, two) || (one.getLength()/two.getLength()) == (one.getWidth()/two.getWidth()))
    {
      similar = true;
    }
    else
    {
      similar = false;
    }
    return similar;
  }

  public static void main(String[] args)
  {
    // Problem 1
    Rectangle r1 = new Rectangle(20, 40);
    Rectangle r2 = new Rectangle(40, 20);
    System.out.println("Are the rectangles rotated? " + isRotated(r1, r2));
    System.out.println("Are the rectangles congruent? " + isCongruent(r1, r2));
    System.out.println("Are the rectangles similar? " + isSimilar(r1, r2));
    

      


  }
}
