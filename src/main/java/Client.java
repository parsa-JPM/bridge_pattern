public class Client {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        new Pentagon(new GreenColor()).applyColor();
    }
}
