import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args){
//        Deque<Integer> deque = new LinkedBlockingDeque<>();
//        System.out.println(deque.poll());
//
//            deque.offer(1);
//            deque.offer(2);
//            deque.offer(3);
//            deque.offer(4);
//            deque.offer(5);
//        System.out.println(deque);
//            deque.addFirst(0);
//            deque.removeLast();
//        System.out.println(deque);

//        Map<String, String> map = new HashMap<>();
//        map.put("a1","Olaide");
//        map.put("a2","Hammed");
//        map.put("a2","Olaskeet");
//        map.put("a3","Ridwan");
//        map.put("a0","Aafiya");
//        map.put("a4","Abolore");
//        map.put("a9","Redux");
//        System.out.println(map);

        Map<String, String> map = new TreeMap<>();
        map.put("a1","Olaide");
        map.put("a2","Hammed");
        map.put("a2","Olaskeet");
        map.put("a3","Ridwan");
        map.put("a4","Abolore");
        map.put("a0","Aafiya");
        map.put("a9","Redux");
        System.out.println(map);

        for (String key: map.keySet()
             ) {
            System.out.println("Key: "+ key + " Value: " + map.get(key));
        }

        for (Map.Entry<String, String> entry: map.entrySet()
             ) {
            System.out.println("Key: "+ entry.getKey() + " Value: " + entry.getValue());
        }

        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, String> temp = entryIterator.next();
            System.out.println("Key: "+ temp.getKey() + " Value: " + temp.getValue());
        }
    }
}
