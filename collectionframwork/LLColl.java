/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.LinkedList;

public class LLColl {

    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Apple");
        li.add("Boy");
        li.add("Cat");
        li.add("Dog");
        System.out.println(li);
        li.addFirst("Elephant");
        System.out.println(li);
        li.addLast("anjir");
        System.out.println(li);
        li.removeFirst();
        System.out.println(li);
        li.removeLast();
        System.out.println(li);

    }
}
