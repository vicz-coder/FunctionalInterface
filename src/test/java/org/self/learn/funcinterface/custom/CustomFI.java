package org.self.learn.funcinterface.custom;



@FunctionalInterface
interface Custom{
    public int add(int a,int b);
}


public class CustomFI {

    public static void main(String[] args) {
        Custom c = (a,b)-> a+b;
        System.out.println(c.add(10,12));
    }



}
