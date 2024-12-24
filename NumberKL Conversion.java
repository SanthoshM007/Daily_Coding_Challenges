// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number");
        String str=obj.next();
        char[] arr=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('0',5);
        map.put('1',6);
        map.put('2',7);
        map.put('3',8);
        map.put('4',9);
        map.put('5',0);
        map.put('6',1);
        map.put('7',2);
        map.put('8',3);
        map.put('9',4);
        
        System.out.println("1 digit conversion");
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if(i==j) System.out.print(map.get(arr[i]));
                else System.out.print(arr[j]);
            }
            System.out.print(" ");
        }
        
        System.out.println();
        
        System.out.println("2 digit conversion");
        
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=i+1;j<arr.length;j++){
                
                for(int k=0;k<arr.length;k++){
                    if(i==k) System.out.print(map.get(arr[i]));
                    else if(j==k) System.out.print(map.get(arr[j]));
                    else System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            
        }
        
        System.out.println();
        
        
        System.out.println("3 digit conversion");
        
        for(int i=0;i<arr.length-2;i++){
            
            for(int j=i+1;j<arr.length-1;j++){
                
                for(int k=j+1;k<arr.length;k++){
                  
                  for(int l=0;l<arr.length;l++){
                      if(i==l) System.out.print(map.get(arr[i]));
                      else if(j==l) System.out.print(map.get(arr[j]));
                      else if(l==k) System.out.print(map.get(arr[k]));
                      else System.out.print(arr[l]);
                  }
                   System.out.print(" ");
                }
            }
            
        }
        
        System.out.println();
        
        System.out.println("4 digit conversion");
        
        for(int i=0;i<arr.length-3;i++){
            
            for(int j=i+1;j<arr.length-2;j++){
                
                for(int k=j+1;k<arr.length-1;k++){
                  
                  for(int l=k+1;l<arr.length;l++){
                    
                      for(int m=0;m<arr.length;m++){
                        
                        if(i==m) System.out.print(map.get(arr[i]));
                        else if(j==m) System.out.print(map.get(arr[j]));
                        else if(k==m) System.out.print(map.get(arr[k]));
                        else if(l==m) System.out.print(map.get(arr[l]));
                        else System.out.print(arr[m]);
                      }
                       System.out.print(" ");
                  }
                  
                }
            }
            
        }
        System.out.println();
        
        System.out.println("5 digit conversion");
        
        for(int i=0;i<arr.length-4;i++){
            
            for(int j=i+1;j<arr.length-3;j++){
                
                for(int k=j+1;k<arr.length-2;k++){
                  
                  for(int l=k+1;l<arr.length-1;l++){
                    
                      for(int m=l+1;m<arr.length;m++){
                        
                        for(int n=0;n<arr.length;n++){
                          if(i==n) System.out.print(map.get(arr[i]));
                          else if(j==n) System.out.print(map.get(arr[j]));
                          else if(k==n) System.out.print(map.get(arr[k]));
                          else if(l==n) System.out.print(map.get(arr[l]));
                          else if(m==n) System.out.print(map.get(arr[m]));
                          else System.out.print(arr[n]);
                        }
                        System.out.print(" ");
                      }
                       
                  }
                  
                }
            }
            
        }
        
        System.out.println();
        
        System.out.println("6 digit conversion");
        
        for(int i=0;i<arr.length;i++){
          System.out.print(map.get(arr[i]));
        }
        
        System.out.println();
    }
}
