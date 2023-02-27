import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ResponseBody {

    @Test
    public void GetResponseBody(){
        RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");

        // Retrieve the body of the Response
        ResponseBody body = (ResponseBody) response.getBody();

        // By using the ResponseBody.asString() method, we can convert the  body
        // into the string representation.
        System.out.println("Response Body is: " + body.toString());


    }
}
