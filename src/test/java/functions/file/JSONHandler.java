package functions.file;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONHandler {

    public static JsonObject parseJSONfromString(String jsonString) {
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = null;
        try {
            jsonObject = (JsonObject) jsonParser.parse(jsonString);
        } catch (Exception e) {
//            System.out.println("Не удалось распарсить указанное значение в JSON!");
        }
        return jsonObject;
    }
}
