package org.self.learn.funcinterface.consumer;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerEx {
        public static BiConsumer<Emp,Double> incSal = (emp, salInc)-> {
            emp.setSal(emp.getSal()+(salInc* emp.getSal()));
            System.out.println(emp);
        };


    public static void main(String[] args) {
        EmpDB.getEmpList().forEach(e -> incSal.accept(e, 0.3));
    }

}
