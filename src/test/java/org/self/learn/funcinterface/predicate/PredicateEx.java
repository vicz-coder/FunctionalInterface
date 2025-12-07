package org.self.learn.funcinterface.predicate;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    public  static Predicate<Emp> isUX = e -> e.getDept().equals("UX");
    public static Predicate<Emp> isAPPL = e -> e.getDept().equals("APPL");
    public static Predicate<Emp> isJavaDev = e -> e.getSkills().contains("Java");
    public static Predicate<Emp> isHighGrade = e -> e.getSal()>50000;


    private static void getUXHighPaying(List<Emp> list){
        System.out.println("High Paying UX Developer");
        list.forEach(e -> {
            if (isUX.and(isHighGrade).test(e))
                System.out.println(e);
        });
    }

    private static void getAPPLHighPaying(List<Emp> list){
        System.out.println("High Paying APPL Developer");
        list.forEach(e -> {
            if (isAPPL.and(isHighGrade).test(e))
                System.out.println(e);
        });
    }
    private static void getAllHighPaying(List<Emp> list){
        System.out.println("High Paying All Developer");
        list.forEach(e -> {
            if ((isAPPL.or(isUX)).and(isHighGrade).test(e))
                System.out.println(e);
        });
    }

    private static void getJavaDeveloper(List<Emp> list){
        System.out.println("List Java Developer");
        list.forEach(e -> {
            if (isJavaDev.test(e))
                System.out.println(e);
        });
    }

    private static void getNonJavaDeveloper(List<Emp> list){
        System.out.println("List Non-Java Developer");
        list.forEach(e -> {
            if (isJavaDev.negate().test(e))
                System.out.println(e);
        });
    }

    public static void main(String[] args) {
        List<Emp> list = EmpDB.getEmpList();

        getUXHighPaying(list);
        getAPPLHighPaying(list);
        getJavaDeveloper(list);
        getNonJavaDeveloper(list);
        getAllHighPaying(list);
    }
}
