import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class OrderUser extends User {
    private static final String CREATE_PATH = "/api/v1/orders";
    private static final String CANCEL_PATH = "/api/v1/orders/cancel";

    @Step("Create order")
    public ValidatableResponse create(Order order){
        return given()
                .spec(getSpec())
                .body(order)
                .when()
                .post(CREATE_PATH)
                .then();

    }

    @Step("Cancel order")
    public ValidatableResponse cancel(int track) {
        Gson cancelGson = new GsonBuilder().setPrettyPrinting().create();
        OrderTrackNumber orderTrackNumber = new OrderTrackNumber(track);
        String cancelJson = cancelGson.toJson(orderTrackNumber);
        return given()
                .spec(getSpec())
                .body(cancelJson)
                .when()
                .post(CANCEL_PATH)
                .then();
    }

    @Step("Getting of list orders")
    public ValidatableResponse get() {
        return given()
                .spec(getSpec())
                .when()
                .get(CREATE_PATH)
                .then();
    }
}
