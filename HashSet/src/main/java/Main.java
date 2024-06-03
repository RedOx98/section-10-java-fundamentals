import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

//        Set<String> set = new LinkedHashSet();
        Set<String> set = new TreeSet<>();
        for (int i = 30; i >= 0 ; i--) {
            set.add("A"+i);
        }
//        System.out.println(set);
        for (String i: set
             ) {
            System.out.println(i);
        }
    }
}
