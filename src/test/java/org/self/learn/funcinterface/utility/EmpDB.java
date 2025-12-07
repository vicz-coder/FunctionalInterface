package org.self.learn.funcinterface.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDB {

    public static List<Emp> getEmpList(){
        List<Emp> lEmp = new ArrayList<>();
        lEmp.add(new Emp("Van",50000,"APPL",List.of("C",".NET","PowerBI")));
        lEmp.add(new Emp("Robin",60000,"UX",List.of("CSS","Bootstrap","HTML5")));
        lEmp.add(new Emp("Paul",70000,"APPL",List.of("Python","Scala","Groovy")));
        lEmp.add(new Emp("Max",80000,"UX",List.of("Angular","ES6")));
        lEmp.add(new Emp("Noel",30000,"APPL",List.of("Java","Spring","Kafka","Reactive")));
        lEmp.add(new Emp("Abbel",20000,"UX",List.of("Vue","React")));
        return lEmp;
    }

}
