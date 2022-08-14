package com.mycompany.labone;

public class Four {
    public static void main(String[] args){
        float salary=1000;
        for (int i=1;i<=3;i++)
            {                                
                salary+=(salary/100)*5;
                System.out.println("in the "+ i +" year is :"+ salary);
                
            }
    }
 
}
