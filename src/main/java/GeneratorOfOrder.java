import java.util.List;

public class GeneratorOfOrder {

    public static Order getNewOrder(List<String> color){
        return new Order(
                "Natalya",
                "Medvedeva",
                "Moscow",
                4,
                "+7 999 777 55 22",
                5,
                "2023-11-08",
                "No Comments",
                color);
    }
}
