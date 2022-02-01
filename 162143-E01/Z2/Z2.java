import java.util.*;

public abstract class Z2 {
    public static <E> void printMarginal(Iterable<E> arr){
        Iterator<E> iter = arr.iterator();
        E elem = null;
        if(iter.hasNext()){
            elem = iter.next();
            System.out.println(elem);
        }
        while(iter.hasNext()){
            elem = iter.next();
        }
        System.out.println(elem);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Z2.<Integer>printMarginal(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        linkedList.add("ddd");
        Z2.<String>printMarginal(linkedList);

        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        Z2.<Integer>printMarginal(stack);

        Vector<String> vector = new Vector<>();
        vector.add("qwe");
        vector.add("asd");
        vector.add("hdh");
        vector.add("tha");
        Z2.<String>printMarginal(vector);


    }
}