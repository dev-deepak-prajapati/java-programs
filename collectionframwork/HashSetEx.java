/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        hs.add("amit");
        hs.add("pankaj");
        hs.add("riya");
        hs.add("mohan");
        System.out.println(hs);
        hs.add("amit");
        hs.add("pankaj");
        hs.add("rajan");
        System.out.println(hs);
        System.out.println("List of Data:");
        for (String i : hs) {
            System.out.println(i);
        }

    }

}
