/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

    public static void main(String[] args) {

        LinkedHashSet<String> lsh = new LinkedHashSet<String>();
        lsh.add("apple");
        lsh.add("banana");
        lsh.add("cat");
        lsh.add("dog");
        System.out.println(lsh);
        lsh.add("banana");
        lsh.add("elephant");
        System.out.println(lsh);
        

    }
}
