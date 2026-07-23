/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;

class Stu {

    int roll;
    String name, course;

    public Stu(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    public void show() {
        System.out.printf("%-5d%-25s%-10s\n", roll, name, course);
    }

    public String toString() {
        return String.format("%-5d%-25s%-10s\n", roll, name, course);
    }
}

public class ClassArrayList {

    public static void main(String[] args) {
        ArrayList<Stu> st = new ArrayList<Stu>();
        Stu s1 = new Stu(101, "Ram", "BCA");
        Stu s2 = new Stu(102, "Shyam", "BSC");
        Stu s3 = new Stu(103, "Mohan", "BA");

        st.add(s1);
        st.add(s2);
        st.add(s3);

        System.out.println("Student List Using for each Loop:");
       
        for (Stu s : st) {
            System.out.print(s);
//            s.show();
        }
        System.out.println("Student List Using Iterator:");
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }

    }
}
