package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class Products {
    private String name;
    private double price;
    private double quantity;

    //input
    public String getNames(BufferedReader bufferedReader) throws IOException
    {
        System.out.println("What is the product name?");
        name = bufferedReader.readLine();
        return name;
    }
    //output
    public Iterator getIterator(JSONArray object){
        Iterator iterator = object.iterator();
        return iterator;
    }
    public void getPrinter(JSONObject product, String name){
        System.out.println("The name is: "+name);
        System.out.println("The price is: "+product.get("price"));
        System.out.println("The quantity is: "+quantity);

    }
}