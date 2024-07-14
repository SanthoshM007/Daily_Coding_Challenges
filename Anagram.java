import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner o=new Scanner(System.in);
    String n=o.next();
    String m=o.next();
    char[] a1=n.toCharArray();
    char[] a2=m.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
 int f=0;
    if(a1.length==a2.length){
      for(int i=0;i<a1.length;i++){
      if(a1[i]==a2[i]) continue;
      else {f=1;break;}
      }
    }
    else f=1;
    
    if(f==0) System.out.print("Anagram");
    else System.out.print("Not");
  }
}
