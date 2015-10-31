package Task3;

import java.awt.List;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.table.TableStringConverter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class depedenciesResolving {

	public static void main(String[] args) {
		 JSONParser parser = new JSONParser();
		 List myList = new List();
         try {
        	 //Resolving the item that should be installed
			Object obj = parser.parse(new FileReader("C://Users//Viktor//Desktop//eclipse//projects//Admision//src//Main//dependencies.json"));
			JSONObject obekt = (JSONObject) obj;
			String[] parts = obekt.get("dependencies").toString().replace("},{", " ,").split(" ");
			String test = parts[0].toString().substring(2, 10);
			//Reading that what else needs to be installed
			Object reqs = parser.parse(new FileReader("C://Users//Viktor//Desktop//eclipse//projects//Admision//src//Main//all_packages.json"));
			JSONObject goTru = (JSONObject) reqs;
			for(Iterator iterator = goTru.keySet().iterator(); iterator.hasNext();) {
			    String key = (String) iterator.next();
			   myList.add(key);
			   myList.add(goTru.get(key).toString());
			    //System.out.println(goTru.get(key));
			    /*if (key.toString().equals(test)) {
			    	String[] tryit = goTru.get(key).toString().replace("},{", " ,").split(" ");
			    	String what = tryit[0].toString();
			    	what = what.split("");
			    	 System.out.println(what);
				}*/
			    //System.out.println(key.toString());
			}
			/*String[] needsTo = obekt.get(test).toString().replace("},{", " ,").split(" ");
			JSONObject obekt2 = (JSONObject) reqs;
			System.out.println(test);   */
			System.out.println(Arrays.toString(((java.util.List) myList).toArray()));
		} catch (IOException | ParseException e) {
			System.out.println("Ne staa");
			e.printStackTrace();
		}
	}

}
