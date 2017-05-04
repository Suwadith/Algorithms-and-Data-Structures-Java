import java.util.LinkedList;

/**
 * Created by Suwadith on 5/4/2017.
 */
public class LinkedListClass {

    public static void main(String[] args){

        LinkedList ll = new LinkedList();

        ll.add("a");
        System.out.println(ll);
        ll.add(1);
        ll.add(2);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.addFirst("B");
        System.out.println(ll);
        ll.addLast("Q");
        System.out.println(ll);

        System.out.println(ll.contains(1));

        ll.set(2, "BB");
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
    }

}
