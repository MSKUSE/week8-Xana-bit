public class Saphe {
    protected String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public void describe() {
        System.out.println("This is a shape and its color is: " + this.color);
    }
}
