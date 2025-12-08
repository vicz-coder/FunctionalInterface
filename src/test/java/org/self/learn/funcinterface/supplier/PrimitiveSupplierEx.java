package org.self.learn.funcinterface.supplier;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveSupplierEx {

    public static IntSupplier randomInt = () -> (int) (Math.random() * 10)+1;
    public static LongSupplier timestamp = () -> System.currentTimeMillis();

    public static void main(String[] args) {
        System.out.println(randomInt.getAsInt());
        System.out.println(timestamp.getAsLong());
    }
}
