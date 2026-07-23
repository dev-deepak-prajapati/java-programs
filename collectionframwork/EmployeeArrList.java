/**
 * @code This Program has been done by
 * @author ☠ Hacker's ☠ Deepak Prajapati️
 *
 */
package collectionframwork;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> emp = new ArrayList<String>();

        System.out.print("Enter emp size : ");
        int size = sc.nextInt();

        int i = 0;
        String name = null;
        for (i = 0; i < size; i++) {

            System.out.printf("Enter emp %d name:", i + 1);
            name = sc.next();

            emp.add(name);
        }

        System.out.println("Your Employee List :");
        for (String e : emp) {
            System.out.println(e);
        }
    }
}
