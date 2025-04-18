public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A: " + sideA + " | Side B: " + sideB);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        return this.sideA == rectangle.getSideA() &&
                this.sideB == rectangle.getSideB() &&
                this.color.equals(rectangle.color);
    }
}

