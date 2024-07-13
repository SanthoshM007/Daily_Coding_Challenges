import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner o=new Scanner(System.in);
    long n=o.nextLong();
    if((n%4==0&&n%100!=0)||(n%400==0))
    System.out.print("Leap year");
    else
    System.out.print("Not a Leap year");
  }
}
