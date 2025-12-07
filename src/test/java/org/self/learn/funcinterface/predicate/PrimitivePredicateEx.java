package org.self.learn.funcinterface.predicate;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.DoublePredicate;

public class PrimitivePredicateEx {

    public static DoublePredicate isHighPay = sal -> sal > 50000;

    private static void getHighGradeEmp(List<Emp> list){
        list.forEach(emp -> {
            if (isHighPay.test(emp.getSal()))
                System.out.println(emp);
        });
    }

    public static void main(String[] args) {
        List<Emp> list = EmpDB.getEmpList();
        getHighGradeEmp(list);
    }
}
