import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("B")) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
