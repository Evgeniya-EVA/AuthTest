import com.google.gson.Gson;

public class JSonBuilder {

    public static String buildJSonData(UserData user){
        Gson gson = new Gson();
        return gson.toJson(user);
    }

    public static UserData decodeJSonAnswer(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, UserData.class);
    }

    public static
}
