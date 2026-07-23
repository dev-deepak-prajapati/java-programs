/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet();
        System.out.print("Enter size Of hashset:");
        int size = sc.nextInt();
        int num;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " salary : ");
            num = sc.nextInt();
            hs.add(num);
        }
        System.out.println(hs);
        System.out.println("List of Data:");
        for (int n : hs) {
            System.out.println(n);
        }
        System.out.print("Enter salary for remove : ");
        int sal=sc.nextInt();
        hs.remove(sal);
        System.out.println(hs);
        
        

    }
}
