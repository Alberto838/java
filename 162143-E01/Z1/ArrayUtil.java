import java.time.LocalTime;
import java.util.ArrayList;

public class ArrayUtil {
    public static<T extends Comparable<T>> ArrayList<T> removeRepeatedElements(T[] arr){
        ArrayList<T> result = new ArrayList<>();
        for(T elem : arr){
            if(!result.contains(elem))
                result.add(elem);
        }
        return result;
    }

    public static void main(String[] args) {
        Character[] chars = {'a', 'a', 'b', 'b', 'c', 'd'};
        ArrayList<Character> chars2 = ArrayUtil.<Character>removeRepeatedElements(chars);
        for (Character c : chars2){
            System.out.println(c);
        }
        LocalTime[] times = {LocalTime.of(1,1), LocalTime.of(1,1), LocalTime.of(1,4), LocalTime.of(1,2)};
        ArrayList<LocalTime> times2  = ArrayUtil.<LocalTime>removeRepeatedElements(times);
        for (LocalTime t : times2){
            System.out.println(t);
    }

    }
}