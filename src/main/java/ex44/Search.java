/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex44;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Search {
    public static void getProduct() throws IOException{
        JSONParser jsonParser = new JSONParser();
        String path = ("src/main/java/ex44/exercise44_input.json");
        Object object = null;
        try {
            object = jsonParser.parse(new FileReader(path));
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject)object;
        JSONArray jsonArray = (JSONArray)jsonObject.get("products");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Products products = new Products();
        String name;
        boolean breaker=true;
        while (breaker){
            Iterator iterator = products.getIterator(jsonArray);
            name = products.getNames(bufferedReader);
            while(iterator.hasNext()){
                JSONObject jObject = (JSONObject) iterator.next();
                String productName = (String) jObject.get("name");
                if (productName.toLowerCase().equals(name.toLowerCase()))
                {
                    products.getPrinter(jObject, productName);
                    breaker = false;
                }
            }
        }
    }
}