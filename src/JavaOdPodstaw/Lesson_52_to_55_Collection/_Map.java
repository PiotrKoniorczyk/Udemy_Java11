package JavaOdPodstaw.Lesson_51_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _Map {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "first");
        hashMap.put(8, "second");
        hashMap.put(2, "third");
        hashMap.put(4, "fourth");

        Map<Integer, String> treemMap = new TreeMap<>();
        treemMap.putAll(hashMap);

        System.out.println(hashMap);
        System.out.println(treemMap);

        System.out.println("Hashmap");

        for (String val_hashMap : hashMap.values()) {
            System.out.print(val_hashMap + ", ");
        }


        System.out.println();
        System.out.println("Treemap");

        for (String val_treemap : treemMap.values()) {
            System.out.print(val_treemap + ", ");


            }
        System.out.println();
        System.out.println("Entry");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.print(entry + ", ");
        }
        System.out.println();
        System.out.println("Get Value");

        for(Map.Entry<Integer, String> entry_2 : hashMap.entrySet()) {
            System.out.print(entry_2.getValue()+", ");
        }

        System.out.println();
        System.out.println("Get Key");

        for(Map.Entry<Integer, String> entry_3 : hashMap.entrySet()){
            System.out.print(entry_3.getKey()+", ");
        }
        }


    }

