import java.util.*;
class Main
{
  public static void main(String args[]){
    Scanner o=new Scanner(System.in);
    String n=o.next();
    char c;
    int i=0;
    char d='0';
    int cnt;
    while(true){
      cnt=0;
      i=0;
      while(i<n.length()){
        c=n.charAt(i);
        if(c==d) {cnt+=1;}
        i+=1;
    }
    System.out.printf("%c occurs %d times\n",d,cnt);
    d++;
    if(d>'9') break;
  }
}
}
