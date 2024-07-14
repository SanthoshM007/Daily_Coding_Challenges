import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    int t=n,s=0,r=0;
    while(t!=0){
      s+=t%10;
      t/=10;
    }
    int q=s;
    while(s!=0){
      r=(r*10)+(s%10);
      s/=10;
    }
    //System.out.print(q+" "+r);
    if(q*r==n) System.out.print("YES");
    else System.out.print("NO");
  }
}
