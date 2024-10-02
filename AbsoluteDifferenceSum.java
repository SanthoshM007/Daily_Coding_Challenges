// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=o.nextInt();
        }
        Arrays.sort(arr);
        int s=0;
        // s+=Math.abs(arr[n-1]-arr[0]);
        // for(int i=0;i<arr.length-1;i++){
        //     s+=Math.abs(arr[i]-arr[i+1]);
        // }
        // System.out.print(s);
        s+=Math.abs(arr[0]-arr[1])+Math.abs(arr[n-1]-arr[n-2]);
        int c=0;
        for(int i=1;i<arr.length-1;i++){
            if((Math.abs(arr[i]-arr[i-1]))>(Math.abs(arr[i]-arr[i+1]))){
                c=Math.abs(arr[i]-arr[i+1]);
            }
            else {
                c=Math.abs(arr[i]-arr[i-1]);
            }
            s+=c;
        }
        System.out.print(s);
        
        
        
    }
}
