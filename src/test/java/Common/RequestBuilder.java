package Common;

import io.restassured.response.Response;

import static Common.BasePaths.ReqRes_BaseURL;
import static Common.ContentType.contentType;
import static Common.PayloadBuilders.*;
import static io.restassured.RestAssured.given;

public class RequestBuilder {

    public static String userID;


    public static Response recoveringEmployeeDataResponse() {
        Response response = given().
                headers(HeadersUtilities.getDefaultHeaders()).
                body(recoveringEmployeeDataObject()).
                contentType(contentType).
                log().all().
                get(ReqRes_BaseURL + "/api/users").
                then().
                log().all().
                extract().response();

        userID = response.jsonPath().getString("id"); // Store generated ID for further calls
        return response;
    }


    public static Response updateEmployeesEmailResponse() {
        return given().
                headers(HeadersUtilities.getDefaultHeaders()).
                body(updateEmployeesEmailObject()).
                contentType(contentType).
                log().all().
                put(ReqRes_BaseURL + "/api/users/" + userID).
                then().
                log().all().
                extract().response();
    }


    public static Response deletingEmployeesLastNameResponse() {
        return given().
                headers(HeadersUtilities.getDefaultHeaders()).
                body(deletingEmployeesLastNameObject()).
                contentType(contentType).
                log().all().
                delete(ReqRes_BaseURL + "/api/users/" + userID).
                then().
                log().all().
                extract().response();
    }
}
