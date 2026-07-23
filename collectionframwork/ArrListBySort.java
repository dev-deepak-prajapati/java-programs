/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return String.format("%-5d%-10s%-5.2f", id, name, salary);
    }

}

public class ArrListBySort {

    public static void main(String[] args) {
        ArrayList<Employee> st = new ArrayList<>();
       
        Employee e1 = new Employee(101, "ram", 2000);
        Employee e2 = new Employee(103, "shyam", 3000);
        Employee e3 = new Employee(104, "mohan", 2500);
        Employee e4 = new Employee(102, "sohan", 4500);
        
        st.add(e1);
        st.add(e2);
        st.add(e3);
        st.add(e4);
        
        Collections.sort(st,(a,b)->Double.compare(a.salary, b.salary));
        System.out.println("Employee List:");
        for (Employee e : st) {
            System.out.println(e);
        }

    }
}
