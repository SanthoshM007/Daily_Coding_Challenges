import java.util.*;
class Main
{
  public static void main(String args[]){
    Scanner o= new Scanner(System.in);
    String n=o.next();
    String r=o.next();
    int d=o.nextInt(),m=o.nextInt(),y=o.nextInt();
    System.out.printf("%s %s %02d/%02d/%d",n,r,d,m,y);
  }
}
