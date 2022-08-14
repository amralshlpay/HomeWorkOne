
package com.mycompany.labone;


public class Five {
    public static void main(String[] args) {
        
        char name[] = new char[] {'A','M','R','O'};                         
        for (int i=0;i<=2 ;i++)
           { 
              for(int j=0;j<=7;j++) {
                if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5)
                    System.out.print(name[j-2]);
                else{
                    System.out.print("*");
                }
                    
              }
               System.out.print("\n");
               
           }
    }
}
