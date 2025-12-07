package org.self.learn.funcinterface.predicate;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateEx {

    public static BiPredicate<String,Double> isUXAndHighPaying = (devType,sal) -> devType.equals("UX") && sal>50000;
    public static BiPredicate<String,Double> isAPPLAndHighPaying = (devType,sal) -> devType.equals("APPL") && sal>50000;

    private static void getUXHighPaying(List<Emp> list){
        System.out.println("High Paying UX Developer");
        list.forEach(e -> {
            if (isUXAndHighPaying.test(e.getDept(),e.getSal()))
                System.out.println(e);
        });
    }

    private static void getAPPLHighPaying(List<Emp> list){
        System.out.println("High Paying APPL Developer");
        list.forEach(e -> {
            if (isAPPLAndHighPaying.test(e.getDept(),e.getSal()))
                System.out.println(e);
        });
    }

    public static void main(String[] args) {
        List<Emp> list = EmpDB.getEmpList();
        getUXHighPaying(list);
        getAPPLHighPaying(list);

    }
}
