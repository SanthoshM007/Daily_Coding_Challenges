// You are using Java
import java.util.*;
class CurtainPackingChallenge{
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        String s=o.next();
        int l=o.nextInt();
        int i=0;
        int max=0;
        int it=1;
        int sm=it;
        int c=0;
        int q=0;
        String k="";
        while(i<s.length()){
            k="";
            q=0;
            for(int m=i;m<s.length();m++){
                if(q==l) break;
                k+=s.charAt(m);
                q+=1;
            }
            // System.out.println(it+":");
            // System.out.println(k);
            // System.out.println(q);
            c=0;
            for(int j=0;j<k.length();j++){
                if(k.charAt(j)=='a') c+=1;
            }
            // System.out.println(c);
            // System.out.println(max);
            // System.out.println(sm);
            if(c>max) {max=c;}

            i=i+l;
        }
        System.out.print(max);
    }
}
