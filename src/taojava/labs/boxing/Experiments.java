package taojava.labs.boxing;

/**
 * A few procedures to use in exploring automatic boxing and unboxing 
 * in Java.
 */

import java.io.PrintWriter;
import java.util.Arrays;

public class Experiments
{
  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Add brackets around a string.
   */
  public static String bracket(String str)
  {
    return "[" + str + "]";
  } // bracket

  /**
   * Add parentheses around a stringified object.
   */
  public static String parenthesize(Object o)
  {
    return "(" + o.toString() + ")";
  } // parenthesize(Object)

  /**
   * Square an Integer.
   */
  public static Integer square(Integer x)
  {
    int val = x.intValue();
    return new Integer(val * val);
  } // square(Integer)

  /**
   * Square an int.
   */
  public static int sqr(int x)
  {
    return x * x;
  } // sqr

  /**
   * Sum an array of ints.
   */
  public static int littleSum(int[] values)
  {
    int sum = 0;
    for (int i = 0; i < values.length; i++)
      {
        sum += values[i];
      } // for
    return sum;
  } // littleSum(int[])

  /**
   * Sum an array of Integers.
   */
  public static Integer bigSum(Integer[] values)
  {
    int sum = 0;
    for (int i = 0; i < values.length; i++)
      {
        sum += values[i].intValue();
      } // for
    return new Integer(sum);
  } // bigSum(Integer[])

  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    Integer bigi = new Integer(5);
    int littlei = 3;
    String str = "Hello";
    int[] littlevals = new int[] { 1, 2, 3 };
    Integer[] bigvals =
        new Integer[] { new Integer(4), new Integer(5), new Integer(6) };

    // Print out our original values.
    pen.println("bigi: " + bigi);
    pen.println("littlei: " + littlei);
    pen.println("str: " + str);
    pen.println("bigvals: " + bigvals + " or " + Arrays.toString(bigvals));
    pen.println("littlevals: " + littlevals + " or "
                + Arrays.toString(littlevals));
    pen.println();

    // We're done.  Clean up.
    pen.close();
  } // main(String[])
} // class Experiments
