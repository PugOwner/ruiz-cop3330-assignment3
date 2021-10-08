package ex46;

import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    public static void count(String string){
        Map<String,Integer> map = new TreeMap<>();
        String array[] = string.split(" ");

        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey()+": ");
            for (int i = 0; i<entry.getValue();i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.print("\r\n");
    }
}