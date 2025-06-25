package Common;

import io.restassured.http.Header;
import io.restassured.http.Headers;

public class HeadersUtilities {

    public static Headers getDefaultHeaders() {
        return new Headers(
                new Header("x-api-key", "reqres-free-v1")
        );
    }
}
