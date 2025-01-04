// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        
        String s="";
        String k="";
        while(n!=0){
            s=n%2+s;
            n/=2;
        }
        
        
        
        int sum=0;
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                sum+=(int)(Math.pow(2,c));
            }
            c+=1;
        }
        
        
        
        System.out.println(sum);
        
    }
}
