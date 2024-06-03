import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K extends Integer, V extends String>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class Main {
    public static void main(String[] args){
        Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                if(obj1.getKey() < obj2.getKey()){
                    return -1;
                } else if (obj1.getKey() > obj2.getKey()) {
                    return 1;
                }
                return 0;
            }
        };
        Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
        set.add(new Data<Integer, String>(1, "Olaide"));
        set.add(new Data<Integer, String>(2, "fatee"));
        set.add(new Data<Integer, String>(3, "oloye"));
        set.add(new Data<Integer, String>(4, "musti"));
        set.add(new Data<Integer, String>(5, "Abake"));
        set.add(new Data<Integer, String>(6, "Olaide"));

        for (Data i:set
             ) {
            System.out.println(i);
        }
    }
}
