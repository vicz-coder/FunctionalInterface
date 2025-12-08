package org.self.learn.funcinterface.consumer;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public static Consumer<Emp> logEmp = emp -> System.out.println(emp);
    public static Consumer<Emp> saveEMp = emp -> EmpDB.lEmp.add(emp);


    private static void printEmp(){
        List<Emp> list = EmpDB.getEmpList();
        list.forEach(e -> logEmp.accept(e));
    }

    private static void saveEmpData(Emp emp){
        saveEMp.accept(emp);
    }

    private static void saveAndPrintEmp(Emp emp){
        saveEMp.andThen(logEmp).accept(emp);
    }

    public static void main(String[] args) {
        Emp emp = new Emp("Adtit",40000,"APPL",List.of("Java","J2EE"));
        //saveEmpData(emp);
        //printEmp();
        saveAndPrintEmp(emp);
    }
}
