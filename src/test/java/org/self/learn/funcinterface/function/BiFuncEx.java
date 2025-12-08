package org.self.learn.funcinterface.function;

import org.self.learn.funcinterface.utility.Emp;

import java.util.List;
import java.util.function.BiFunction;

public class BiFuncEx {

    public static BiFunction<String,String, Emp> basicEmp = (name,dept)-> new Emp(name,25000,dept, List.of());

    public static void main(String[] args) {
        //Create Basic Emp
        Emp e = basicEmp.apply("Ratan","UX");
        System.out.println(e);
    }
}
