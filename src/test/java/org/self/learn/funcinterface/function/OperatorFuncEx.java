package org.self.learn.funcinterface.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorFuncEx {

    public static UnaryOperator<Double> updateSal = sal-> sal + (0.20 * sal);
    public static BinaryOperator<String> formatName = (prefix,name)-> prefix+name;

    public static void main(String[] args) {
        System.out.println(updateSal.apply(23000.0));
        System.out.println(formatName.apply("Mr.","Vickey"));

    }
}
