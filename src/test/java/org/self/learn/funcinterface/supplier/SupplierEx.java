package org.self.learn.funcinterface.supplier;

import org.self.learn.funcinterface.utility.Emp;
import org.self.learn.funcinterface.utility.EmpDB;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

    public static Supplier<List<Emp>> getUXDeveloper= ()->{
        List<Emp> list = new ArrayList<>();
        EmpDB.getEmpList().forEach(e-> {
            if (e.getDept().equals("UX")) list.add(e);
        });
        return list;
    };


    public static void main(String[] args) {
        System.out.println(getUXDeveloper.get());
    }
}
