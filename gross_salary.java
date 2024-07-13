import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner o=new Scanner(System.in);
    int b=o.nextInt();
    double g = (double)b;
    if(b<=10000)
    {
      g=b+b*0.2+b*0.8;
      System.out.printf("Rs.%.2f",g);
    }
    else if(b<=20000)
    {
      g=b+b*0.25+b*0.9;
      System.out.printf("Rs.%.2f",g);
    }
    else
    {
      g=b+b*0.30+b*0.95;
      System.out.printf("Rs.%.2f",g);
    }
  }
}
