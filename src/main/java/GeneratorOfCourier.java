public class GeneratorOfCourier {
    public static Courier getCourierWithExistingLogin() {
        return new Courier("Bobby", "1234", "Bob");
    }
    public static Courier getNewValidCourier() {
        return new Courier("Alexy", "1234", "Alex");
    }
    public static Courier getCourierWithEmptyLogin(){
        return new Courier(null, "1234", "Boris");
    }
    public static Courier getCourierWithEmptyName(){
        return new Courier("Ivan", "iv123", null);
    }
    public static Courier getCourierWithEmptyPassword(){
        return new Courier("Vova", null, "Vladimir");
    }


}
