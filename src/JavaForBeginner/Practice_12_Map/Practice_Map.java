package JavaForBeginner.Practice_12_Map;

import java.util.Map;
import java.util.TreeMap;


public class Practice_Map {
    public static void main(String[] args) {

        Map<Integer, Integer> coordinates = new TreeMap<>();

        coordinates.put(1,30);
        coordinates.put(2,12);
        coordinates.put(3,51);
        coordinates.put(4,13);
        coordinates.put(5,82);
        coordinates.put(6,2);


        for(Map.Entry<Integer, Integer> cor : coordinates.entrySet()){
            System.out.print("x =" + cor.getKey());
            System.out.println(" y =" + cor.getValue());
        }


    }

}
