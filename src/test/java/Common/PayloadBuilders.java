package Common;

import org.json.simple.JSONObject;



public class PayloadBuilders {


    public static JSONObject recoveringEmployeeDataObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "2");
        jsonObject.put("email", "janet.weaver@reqres.in");
        jsonObject.put("first_name", "Janet");
        jsonObject.put("last_name", "Weaver");
        jsonObject.put("avatar", "https://reqres.in/img/faces/2-image.jpg");
        return jsonObject;
    }


    public static JSONObject updateEmployeesEmailObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "new.email@example.com");
        jsonObject.put("first_name", "Janet");
        jsonObject.put("last_name", "Weaver");
        jsonObject.put("avatar", "https://reqres.in/img/faces/2-image.jpg");
        return jsonObject;
    }


    public static JSONObject deletingEmployeesLastNameObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "new.email@example.com");
        jsonObject.put("first_name", "Janet");
        jsonObject.put("last_name", null);
        jsonObject.put("avatar", "https://reqres.in/img/faces/2-image.jpg");
        return jsonObject;
    }
}
