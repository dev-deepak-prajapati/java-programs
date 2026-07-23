/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListAddmethod {

    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<String>();
        st.add("Ram");
        st.add("Shyam");
        st.add("Mohan");
        st.add("Sohan");

        System.out.println("\nList of students using Iterator:");

        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nList of students using For-Each Loop:");
        for (String s : st) {
            System.out.println(s);
        }

        System.out.println("\nList of students using For Loop:");
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }
        System.out.println(st);
        ArrayList<String> st1 = new ArrayList<String>();
        st1.add("ramesh");
        st1.add("vinod");
        st1.add(1, "suresh");
        System.out.println(st1);

        System.out.println("\nList of students using For-Each Loop:");
        for (String s : st1) {
            System.out.println(s);
        }
        st.addAll(st1);//st.addAll(2,st1);
        System.out.println(st);

        System.out.println("\nList of students using For-Each Loop:");
        for (String s : st) {
            System.out.println(s);
        }

    }
}
