package org.self.learn.funcinterface.function;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.Function;

public class FunctionEx {

    static Function<Emp,Double> getSal = e-> e.getSal();
    static Function<Double,Double> incSal = sal -> sal + (0.20 * sal);
    static Function<Double,String> formatSal = sal-> "Final Salary :"+sal;

    static Function<Emp,String> getName = e-> e.getName();
    static Function<String,String> prefixName = nam-> "Mr."+nam;
    static Function<String,String> toUpper = nam-> nam.toUpperCase();


    private static void formatName(Emp emp){
        String name = getName.apply(emp);
        String finalName = prefixName.compose(toUpper).apply(name);
        System.out.println(name+" -> "+finalName);
    }
    private static void getUpdatedSalary(Emp emp){
        System.out.println("Initial Salary :"+emp.getSal());
        String finalSalary = getSal.andThen(incSal).andThen(formatSal).apply(emp);
        System.out.println(finalSalary);
    }

    public static void main(String[] args) {
        List<Emp> list = EmpDB.getEmpList();
        list.forEach(e-> {
            //getUpdatedSalary(e);
            formatName(e);
        });

    }

}
