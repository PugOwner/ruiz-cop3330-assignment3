/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex44;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class Products {

    public Products() {
    }

    public String getNames(BufferedReader bufferedReader) throws IOException
    {
        System.out.println("What is the product name");
        return bufferedReader.readLine();
    }

    public Iterator getIterator(JSONArray object){
        Iterator iterator;
        iterator = object.iterator();
        return iterator;
    }

    public void getPrinter(JSONObject product, String name){
        System.out.println("The name is: "+name);
        System.out.println("The price is: "+product.get("price"));
        System.out.println("The quantity is: "+product.get("quantity"));
    }
}