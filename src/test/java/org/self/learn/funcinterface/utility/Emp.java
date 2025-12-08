package org.self.learn.funcinterface.utility;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Emp {

    private String name;
    private double sal;
    private String dept;
    private List<String> skills;

    public Emp(String name, double sal, String dept, List<String> skills) {
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", dept='" + dept + '\'' +
                ", skills=" + skills +
                '}';
    }
}
