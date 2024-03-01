package ReadJsonValue;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class ReadDataFromJson {

    public static void main(String[] args) {

        String js = "{\n" +
                "\"Name\":\"ABCD\",\n" +
                "\"Address\":\"Add\",\n" +
                "\"Gender\" :\"Male\"\n" +
                "\n" +
                "}";

        Object obj = JSONValue.parse(js);

        JSONObject jsobj = (JSONObject) obj;

       String NameVal =  (String)jsobj.get("Name");

        System.out.println(NameVal);
        // Prince_delete it


    }
}
