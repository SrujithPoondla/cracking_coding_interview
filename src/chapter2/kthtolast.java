package chapter2;

import java.util.LinkedList;

/**
 * Created by srujithpoondla on 11/20/16.
 */
public class kthtolast {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(1);
        int k=2;
        kthToLast(llist,k);
    }

    private static void kthToLast(LinkedList llist, int k) {
        Object o = llist.get(llist.size()-k);
        System.out.println(o);

    }
}
