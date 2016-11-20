package chapter2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by srujith reddy on 16-11-2016.
 */


class removeDups {


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(1);
        removedups(llist);


    }

    private static void removedups(LinkedList llist) {
        Set<Integer> set = new HashSet<>();
        for (Object c: llist
             ) {
            if (!set.contains(c)) {
                set.add((int) c);
            }else {
                llist.remove(c);
            }
        }
    }

}
