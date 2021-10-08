/*Change after
*   String name;
*   Products j = new Products();
*   JSONArray object = (JSONArray)jsonObject.get("products");
*
* */
package ex44;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.*;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

            String path = ("src/main/java/ex44/exercise44_input.json");
            Object obj = parser.parse(new FileReader(path));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray object = (JSONArray)jsonObject.get("products");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            Products j = new Products();
            String name;
            boolean breaker=true;
            while (breaker){
                Iterator iterator = j.getIterator(object);
                name = j.getNames(bufferedReader);
                while(iterator.hasNext()){
                    JSONObject jObject = (JSONObject) iterator.next();
                    String productName = (String) jObject.get("name");
                    // Compares
                    if (productName.toLowerCase().equals(name.toLowerCase()))
                    {
                        j.getPrinter(jObject, productName);
                        breaker = false;
                    }
                }
            }
    }
}