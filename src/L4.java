import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class L4 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 7, 4, 9, 11));
        /*append(a, b);
        System.out.println(a);
        System.out.println(merge(a,b));*/
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        a.addAll(b);
        return a;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> longer = null;
        ArrayList<Integer> shorter = null;
        ArrayList<Integer> merged = new ArrayList<>();

        if (a.size() < b.size() || a.size() == b.size()){
            shorter = a;
            longer = b;
            }
        else{
            shorter = b;
            longer = a;
        }
        for(int i=0; i<shorter.size(); i++){
            merged.add(shorter.get(i));
            merged.add(longer.get(i));
        }
        merged.addAll(longer.subList(shorter.size(), longer.size()));
        return merged;
    }

    static class IntegerComparator implements Comparator<Integer>{
        public int compare(Integer o1, Integer o2){
            if(o1>o2 || o1<o2){
                return o1-o2;
            }
            else{
                return 0;
            }
        }
        
    }
}
