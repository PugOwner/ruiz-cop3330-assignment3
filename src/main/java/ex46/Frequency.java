/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex46;
import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    public static void count(String string){
        TreeMap<String,Integer> map = new TreeMap<>();
        String array[] = string.split(" ");         // Words put into array. Split by space.

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
            for (int i = 0; i<entry.getValue();i++){        // Prints * for every word repetition
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.print("\r\n");
    }
}