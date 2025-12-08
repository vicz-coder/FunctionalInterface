package org.self.learn.funcinterface.function;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;

public class PrimitiveFuncEx {

    public static DoubleFunction<Emp> newBasicEmp = sal-> new Emp("ABC",sal,"", List.of());
    public static ToDoubleFunction<Emp> updateSal = e-> e.getSal()+(e.getSal()*0.20);



    public static void main(String[] args) {
        Emp e = newBasicEmp.apply(25000);
        Emp e1 = EmpDB.getEmpList().get(0);
        System.out.println(updateSal.applyAsDouble(e1));

    }
}
